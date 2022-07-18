#!/bin/sh

JAVA_OPTS=${JAVA_OPTS}

# Remote Debug Support
if [[ ${JAVA_VERSION} == *"jdk"* && -n "${JAVA_DEBUG_PORT}" ]]; then
  export JAVA_OPTS="$JAVA_OPTS -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=0.0.0.0:${JAVA_DEBUG_PORT}"
fi
# End Remote Debug Support

export JAVA_OPTS="$JAVA_OPTS -Djava.security.egd=file:/dev/./urandom"
export JAVA_OPTS="$JAVA_OPTS --add-opens java.base/java.lang=ALL-UNNAMED"
export JAVA_OPTS="$JAVA_OPTS -XX:+UseContainerSupport"
export JAVA_OPTS="$JAVA_OPTS -XX:+AlwaysActAsServerClassMachine"
export JAVA_OPTS="$JAVA_OPTS -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/opt/dumps"

# Vaadin Production Mode #
export JAVA_OPTS="$JAVA_OPTS -Dvaadin.production=true"
# End Vaadin Production Mode #

exec java ${JAVA_OPTS} -jar /app/whoami.jar
