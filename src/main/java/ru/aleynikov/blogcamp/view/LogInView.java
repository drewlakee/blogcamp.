package ru.aleynikov.blogcamp.view;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import ru.aleynikov.blogcamp.staticResources.StaticResources;

@PageTitle("Login")
@Route("login")
@StyleSheet(StaticResources.LOGIN_VIEW_STYLES)
public class LogInView extends HorizontalLayout {

    private Image logoImage = new Image(StaticResources.LOGO_IMAGE, "logo");
    private LoginForm loginForm = new LoginForm();
    private VerticalLayout loginLayout = new VerticalLayout();

    public LogInView() {
        loginLayout.setSizeFull();
        loginLayout.setClassName("login-form");

        logoImage.setClassName("logo-login");

        

        loginLayout.setHorizontalComponentAlignment(Alignment.CENTER, logoImage, loginForm);

        loginLayout.add(logoImage, loginForm);

        setVerticalComponentAlignment(Alignment.CENTER, loginLayout);

        add(loginLayout);

        loginForm.addLoginListener(loginEvent -> {



            //    getUI().ifPresent(ui -> ui.navigate("feed"));
        });
    }
}
