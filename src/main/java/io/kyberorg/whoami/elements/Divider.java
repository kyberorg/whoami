package io.kyberorg.whoami.elements;

import com.vaadin.flow.component.html.Hr;

public class Divider extends Hr {
    public Divider() {
        getStyle().set("background-image", "#f5f9ff");
        getStyle().set("flex", "0 0 2px");
        getStyle().set("align-self", "stretch");
    }
}
