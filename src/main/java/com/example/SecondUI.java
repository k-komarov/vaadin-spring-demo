package com.example;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.ui.Component;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;

/**
 * @author Kirill Komarov
 */
@SpringUI(path = SecondUI.PATH)
@SpringViewDisplay
public class SecondUI extends UI implements ViewDisplay{
    public final static String PATH = "/second";
    private final Panel viewDisplay = new Panel();

    @Override
    public void showView(View view) {
        viewDisplay.setContent((Component) view);
    }

    @Override
    protected void init(VaadinRequest request) {
        setContent(viewDisplay);
    }
}
