package io.kyberorg.whoami.ui.sections;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexLayout;

public class TitleSection extends FlexLayout {

    public static TitleSection getInstance() {
        return new TitleSection();
    }

    private TitleSection() {
        H2 title = new H2("Hello, I am kyberorg");
        Image myPhoto = new Image("images/logo.png", "myPhoto");

        title.getStyle().set("marginTop", "initial");
        title.getStyle().set("marginRight", "2rem");
        title.getStyle().set("marginBottom", "initial");
        title.getStyle().set("marginLeft", "initial");

        myPhoto.setWidth("4rem");
        myPhoto.setWidth("4rem");
        myPhoto.getStyle().set("borderRadius","100%");

        setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        setAlignItems(FlexComponent.Alignment.CENTER);
        setWidthFull();

        add(title, myPhoto);
    }

}
