package com.example.application.login;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Sesión Iniciada")
@Route(value = "login")
public class LoginView extends VerticalLayout {

    private TextField name;
    private PasswordField password;
    private Button iniciarSesion;
    private Button cancelar;

    public LoginView() {
        name = new TextField("Usuario");
        password = new PasswordField("Contraseña");
        iniciarSesion = new Button("Iniciar sesión", new Icon(VaadinIcon.SIGN_IN));
        cancelar = new Button("Limpiar Datos", new Icon(VaadinIcon.SIGN_OUT));

        iniciarSesion.setIconAfterText(true);
        cancelar.setIconAfterText(true);

        name.setRequired(true);
        password.setRequired(true);

        iniciarSesion.addClickListener(e -> {
            boolean passwordCorrecto = false;
            boolean usuarioCorrecto = false;

            if (name.getValue().equals("usuario")){
                usuarioCorrecto = true;
            } else {
                usuarioCorrecto = false;
                Notification.show("Nombre de usuario Incorrecto");
            }

            if (password.getValue().equals("usuario")){
                passwordCorrecto = true;
            } else {
                passwordCorrecto = false;
                Notification.show("Contraseña incorrecta");
            }

            if (usuarioCorrecto && passwordCorrecto){
                UI.getCurrent().navigate("home");
            }

        });

        cancelar.addClickListener(e -> {
            eliminarDatos();
        });

        //FormLayout formLogin = new FormLayout(name, password, iniciarSesion, cancelar);
        //add(new H1("Iniciar Sesión"), formLogin);

        setMargin(true);
        setAlignItems(Alignment.CENTER);
       add(new H1("Iniciar Sesión"),name , password, iniciarSesion,cancelar);
    };

    private void eliminarDatos() {
        name.setValue("");
        password.setValue("");
    }


}

