package com.mshabarov.example;

import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {
   
    public MainView() {
        Paragraph paragraph = new Paragraph("Hello, world!");
        add(paragraph);
    }
}
