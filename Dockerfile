FROM kio.ee/lib/eclipse-temurin:17-jre-alpine as runner
LABEL maintainer="Aleksandr Muravja <alex@kyberorg.io>"

# see https://yls.ee/NNRXyg (issue about sed https->http in alpine)
# see https://yls.ee/WPJIZF (issue about updating those packages)
RUN sed -i 's,https,http,g' /etc/apk/repositories && \
    apk add --update-cache \
    jq \
    curl \
    libcrypto1.1=1.1.1q-r0 \
        libssl1.1=1.1.1q-r0 && \
    rm -rf /var/cache/apk/*

VOLUME /tmp

COPY ./target/whoami.jar /app/
COPY ./docker-entrypoint.sh /

RUN chmod +x /docker-entrypoint.sh
# RUN ls -al /
ENTRYPOINT /docker-entrypoint.sh

EXPOSE 8080
HEALTHCHECK --start-period=60s --interval=5s --timeout=20s --retries=3 \
   CMD curl --silent --request GET http://127.0.0.1:8080/actuator/health \
                   | jq --exit-status '.status == "UP"' || exit 1
