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
@PageTitle("Kyberorg.io - Site about kyberorg")
@Route("")
public class MainView extends VerticalLayout {
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
}
