package com.example;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.Page;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;

/**
 * @author Kirill Komarov
 */
@SpringView(name = "", ui = SecondUI.class)
public class SecondUIView extends CssLayout implements View {

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        final Label label = new Label("View of SecondUI");
        final Button button = new Button("Go to FirstUI");
        button.addClickListener(e -> {
            Page.getCurrent().setLocation(FirstUI.PATH);
        });
        addComponents(label, button);
    }
}
