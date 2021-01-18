package io.kyberorg.whoami.ui.sections;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vdurmont.emoji.EmojiParser;
import io.kyberorg.whoami.Emoji;
import io.kyberorg.whoami.elements.Logo;

public class WorkSection extends VerticalLayout {

    public WorkSection() {
        FlexLayout firstLine = new FlexLayout();
        Text first = new Text("I work at ");
        Logo knLogo = Logo.create()
                .withSource("images/kn.png").withAltText("Kühne+Nagel")
                .build().roundLogo();

        Text second = new Text(EmojiParser.parseToUnicode("and I "+ Emoji.LOVE +" it"));
        firstLine.setAlignItems(Alignment.CENTER);
        firstLine.add(first, knLogo, second);

        FlexLayout secondLine = new FlexLayout();
        Text availableForHireText = new Text("Am I available to hire: ");
        Text availableForHireStatus = new Text(EmojiParser.parseToUnicode(Emoji.CROSS));

        secondLine.add(availableForHireText, availableForHireStatus);
        add(firstLine, secondLine);
    }
}
