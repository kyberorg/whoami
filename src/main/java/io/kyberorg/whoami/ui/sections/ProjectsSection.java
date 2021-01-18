package io.kyberorg.whoami.ui.sections;

import com.vaadin.flow.component.orderedlayout.FlexLayout;
import io.kyberorg.whoami.elements.Logo;

public class ProjectsSection extends FlexLayout {

    public ProjectsSection() {

        Logo yalseeLogo = Logo.create()
                .withSource("images/yalsee.png").withAltText("yals.ee")
                .withUrl("https://yals.ee")
                .build();

        yalseeLogo.setWidth("4rem");
        yalseeLogo.setHeight("4rem");

        yalseeLogo.setTitle("Yalsee - the link shortener");

        add(yalseeLogo);
    }
}
