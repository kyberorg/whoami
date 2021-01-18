package io.kyberorg.whoami.ui.sections;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class AboutSection extends VerticalLayout {

    public AboutSection() {
        String sectionText = """
                Software craftsman and DevOps engineer. \
                                
                Mainly dealing with Docker, Docker Swarm and Kubernetes.\
                Developing in Java (Spring and Vaadin). \
                                                               
                Hobbies are: traveling, 4x4, aviation.
                """;

        add(sectionText);
    }
}
