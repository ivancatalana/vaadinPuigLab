package com.example.application.home;

import com.example.application.Application;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.*;

@CssImport("./styles/styles.css")
@PageTitle("Inicio")
@Route(value = "home")
public class HomeView extends VerticalLayout {

    public HomeView(){


        Text inicio = new Text("Página Principal");

        setAlignItems(Alignment.CENTER);

        add(inicio);

    }
}
/*
@CssImport("./styles/styles.css")

@PageTitle("Inicio")
@Route(value = "home")



public class HomeView extends AppLayout {

    public HomeView(){
         createHeader();
         createDrawer();

    }

    private void createHeader(){
        H1  logo = new H1("Home");
        logo.addClassName("logo");
        HorizontalLayout header = new HorizontalLayout(new DrawerToggle(),logo);
        header.addClassName("header");
        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
        addToNavbar(header);
   }
   private void createDrawer(){
        RouterLink listLinks= new RouterLink("Lista Destinos",ListView.class);
        listLinks.setHighlightCondition(HighlightConditions.sameLocation());
    }
}


 */
