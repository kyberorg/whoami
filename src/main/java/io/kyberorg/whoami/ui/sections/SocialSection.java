package io.kyberorg.whoami.ui.sections;

import com.vaadin.flow.component.orderedlayout.FlexLayout;
import io.kyberorg.whoami.elements.Logo;

public class SocialSection extends FlexLayout {

    public SocialSection() {
        Logo gitHubLogo = Logo.create()
                .withSource("images/gh.png").withAltText("GitHub")
                .withUrl("https://github.com/kyberorg")
                .build();

        Logo linkedInLogo = Logo.create()
                .withSource("images/linked.png").withAltText("LinkedIn")
                .withUrl("https://www.linkedin.com/in/kyberorg/")
                .build();

        Logo facebookLogo = Logo.create()
                .withSource("images/fb.png").withAltText("Facebook")
                .withUrl("https://www.facebook.com/kyberorg")
                .build();

        Logo twitterLogo = Logo.create()
                .withSource("images/twitter.png").withAltText("Twitter")
                .withUrl("https://twitter.com/kyberorg")
                .build();

        add(gitHubLogo, linkedInLogo, facebookLogo, twitterLogo);
    }
}
