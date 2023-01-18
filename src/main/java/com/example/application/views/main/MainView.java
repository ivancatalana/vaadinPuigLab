package com.example.application.views.main;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "")
public class MainView extends VerticalLayout {

    private Text comenzar;

    public MainView() {


        comenzar = new Text("Pulsa aquí para comenzar");

        comenzar.addAttachListener(e -> {
            UI.getCurrent().navigate("login");
        });


        //setVerticalComponentAlignment(Alignment.END, name, sayHello);
        setMargin(true);
        setAlignItems(Alignment.CENTER);

        add(new H1("Empezar"),comenzar);
    }




}