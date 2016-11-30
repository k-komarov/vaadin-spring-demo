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
@SpringView(name = "", ui = FirstUI.class)
public class FirstUIView extends CssLayout implements View {

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        final Label label = new Label("View of FirstUI");
        final Button button = new Button("Go to SecondUI");
        button.addClickListener(e -> {
            Page.getCurrent().setLocation(SecondUI.PATH);
        });
        addComponents(label, button);
    }
}
