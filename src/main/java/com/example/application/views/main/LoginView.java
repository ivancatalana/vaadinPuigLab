package com.example.application.views.main;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Main")
    @Route(value = "/LoginView")
    public class LoginView extends HorizontalLayout {


        public LoginView() {
            addClassName("login-rich-content");

            LoginForm loginForm = new LoginForm();
            add(loginForm);
// See login-rich-content.css
            addClassName("login-rich-content");
            loginForm.getElement().getThemeList().add("dark");
        }

    }
