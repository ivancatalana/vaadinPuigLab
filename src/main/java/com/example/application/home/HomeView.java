package com.example.application.home;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Inicio")
@Route(value = "home")
public class HomeView extends VerticalLayout {

    public HomeView(){


        Text inicio = new Text("Página Principal");

        setAlignItems(Alignment.CENTER);

        add(inicio);

    }
}
