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

        Logo manjaroLogo = Logo.create()
                .withSource("images/manjaro.png").withAltText("Manjaro Mirror")
                .withUrl("https://manjaro.kyberorg.fi")
                .build();

        manjaroLogo.setWidth("4rem");
        manjaroLogo.setHeight("4rem");

        Logo honeypotLogo = Logo.create()
                .withSource("images/honeypot.png").withAltText("Honeypot")
                .withUrl("https://github.com/kyberorg/honeypot")
                .build();

        honeypotLogo.setWidth("4rem");
        honeypotLogo.setHeight("4rem");

        add(yalseeLogo, manjaroLogo, honeypotLogo);
    }
}
