package io.kyberorg.whoami;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.component.page.Inline;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.server.AppShellSettings;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

@SpringComponent
@Push
@Viewport("width=device-width, minimum-scale=1.0, initial-scale=1.0, user-scalable=yes")
@PWA(
        name = "Site about @kyberorg",
        shortName = "whoami",
        offlinePath = "offline-page.html",
        offlineResources = {"images/logo.jpg"},
        description = "WhoAmI: site about @kyberorg")
@Theme(themeClass = Lumo.class, variant = Lumo.DARK)
public class WebApp implements AppShellConfigurator {
    @Override
    public void configurePage(final AppShellSettings settings) {
        settings.addFavIcon("icon", "/icons/favicon-32x32.png", "32x32");
        settings.addLink("shortcut icon", "/icons/favicon-16x16.png");
        settings.addLink("apple-touch-icon", "/icons/apple-touch-icon.png");
        settings.addLink("manifest", "/site.webmanifest");
        settings.addLink("mask-icon", "/icons/safari-pinned-tab.svg");

        settings.addMetaTag("apple-mobile-web-app-title", "WhoAmI");
        settings.addMetaTag("application-name", "WhoAmI");
        settings.addMetaTag("msapplication-TileColor", "#ffc40d");
        settings.addMetaTag("theme-color", "#ffffff");

        //SEO tags
        settings.addMetaTag("title","Kyberorg.io - Site about kyberorg");
        settings.addMetaTag("description", "Site about Aleksandr Muravja aka kyberorg");
        settings.addMetaTag("og:type","website");
        settings.addMetaTag("og:url", "https://kyberorg.io/");
        settings.addMetaTag("og:title", "Kyberorg.io - Site about kyberorg");
        settings.addMetaTag("og:image", "https://kyberorg.io/images/preview.png");
        settings.addMetaTag("twitter:card","summary_large_image");
        settings.addMetaTag("twitter:url", "https://kyberorg.io/");
        settings.addMetaTag("twitter:title","Kyberorg.io - Site about kyberorg");
        settings.addMetaTag("twitter:description", "Site about Aleksandr Muravja aka kyberorg");
        settings.addMetaTag("twitter:image", "https://kyberorg.io/images/preview.png");

        //Splash (Loading) Screen
        settings.addInlineFromFile("splash-screen.html", Inline.Wrapping.NONE);
        //Google Analytics
        settings.addInlineFromFile("gtag.html", Inline.Wrapping.NONE);
    }
}
