package com.example.application.home;

import com.example.application.views.main.MainView;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
@PageTitle("Inicio")
/*
@Route(value = "list",layout = HomeView.class)

 */
public class ListView extends VerticalLayout {


        public ListView(){


            Text inicio = new Text("Página Principal");

            setAlignItems(Alignment.CENTER);

            add(inicio);

        }

}
