package io.kyberorg.whoami.elements;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Image;
import org.apache.commons.lang3.StringUtils;

@Tag("img")
public class Logo extends Image {
    public static Builder create() {
        return new Builder();
    }

    private Logo(String source, String alt, String url) {
        getStyle().set("margin", "0.5rem");
        if(StringUtils.isNotBlank(source)) {
            setSrc(source);
        }

        if (StringUtils.isNotBlank(alt)) {
            setAlt(alt);
        }

        if(StringUtils.isNotBlank(url)) {
            addClickListener(event -> UI.getCurrent().getPage().setLocation(url));
            getStyle().set("cursor","pointer");
        }
    }

    public Logo roundLogo() {
        getStyle().set("borderRadius", "25%");
        return this;
    }

    public static class Builder {
        private String source;
        private String altText;
        private String url;

        public Builder withSource(String imageSource) {
            this.source = imageSource;
            return this;
        }

        public Builder withAltText(String alternativeText) {
            this.altText = alternativeText;
            return this;
        }

        public Builder withUrl(String url) {
            this.url = url;
            return this;
        }

        public Logo build() {
            return new Logo(source, altText, url);
        }
    }
}
