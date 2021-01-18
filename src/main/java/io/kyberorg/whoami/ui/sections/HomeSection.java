package io.kyberorg.whoami.ui.sections;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vdurmont.emoji.EmojiParser;
import io.kyberorg.whoami.Emoji;

public class HomeSection extends VerticalLayout {

    public HomeSection() {
        add(EmojiParser.parseToUnicode("I live in Pirita "+ Emoji.FOREST
                +" district of Tallinn, capital of "+Emoji.ESTONIA));
    }
}
