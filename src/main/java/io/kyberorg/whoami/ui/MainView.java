package io.kyberorg.whoami.ui;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.UI;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.InitialPageSettings;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.server.PageConfigurator;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import io.kyberorg.whoami.ui.sections.*;

@SpringComponent
@UIScope
@Push
@Viewport("width=device-width, minimum-scale=1.0, initial-scale=1.0, user-scalable=yes")
@PWA(
        name = "Site about @kyberorg",
        shortName = "whoami",
        offlinePath = "offline-page.html",
        offlineResources = {"images/logo.jpg"},
        description = "WhoAmI: site about @kyberorg")
@Theme(value = Lumo.class, variant = Lumo.DARK)
@PageTitle("Kyberorg.io")
@Route("")
public class MainView extends VerticalLayout implements PageConfigurator {

    public MainView() {
        Component titleSection = TitleSection.getInstance();

        Section aboutSection = Section.create()
                .withTitle("Who Am I? (About Me)")
                .andContent(new AboutSection())
                .build();

        Section socialSection = Section.create()
                .withTitle("Where Am I? (Social Network Accounts)")
                .andContent(new SocialSection())
                .build();

        Section myProjectSection = Section.create()
                .withTitle("What I do? (My Projects)")
                .andContent(new ProjectsSection())
                .build();

        Section myWorkSection = Section.create()
                .withTitle("Who pays me? (My Work)")
                .andContent(new WorkSection())
                .build();

        Section homeSection = Section.create()
                .withTitle("Where I reside? (My Home)")
                .andContent(new HomeSection())
                .build();

        getStyle().set("margin","0 auto");
        setMaxWidth("1000px");
        addClassName("centered-content");

        add(titleSection, aboutSection, socialSection, myProjectSection, myWorkSection, homeSection);

        // hide the splash screen after the main view is loaded
        UI.getCurrent().getPage().executeJs(
                "document.querySelector('#splash-screen').classList.add('loaded')");
    }
    @Override
    public void configurePage(InitialPageSettings settings) {
        settings.addFavIcon("icon", "/icons/favicon-32x32.png", "32x32");
        settings.addLink("shortcut icon", "/icons/favicon-16x16.png");
        settings.addLink("apple-touch-icon", "/icons/apple-touch-icon.png");
        settings.addLink("manifest", "/site.webmanifest");
        settings.addLink("mask-icon", "/icons/safari-pinned-tab.svg");

        settings.addMetaTag("apple-mobile-web-app-title", "WhoAmI");
        settings.addMetaTag("application-name", "WhoAmI");
        settings.addMetaTag("msapplication-TileColor", "#ffc40d");
        settings.addMetaTag("theme-color", "#ffffff");

        settings.addInlineFromFile("splash-screen.html", InitialPageSettings.WrapMode.NONE);
    }
}
