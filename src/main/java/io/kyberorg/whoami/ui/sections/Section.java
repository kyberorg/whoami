package io.kyberorg.whoami.ui.sections;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import io.kyberorg.whoami.elements.Divider;

@Tag("section")
public class Section extends Div {

    public static Builder create() {
        return new Builder();
    }

    private Section(String title, Component content) {
        H3 titleElement = new H3(title);
        Divider divider = new Divider();

        add(titleElement, divider, content);
    }

    public static class Builder {
        private String title;
        private Component content;

        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder andContent(Component content) {
            this.content = content;
            return this;
        }

        public Section build() {
            return new Section(title, content);
        }
    }

}
