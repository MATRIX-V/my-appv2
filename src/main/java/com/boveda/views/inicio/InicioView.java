package com.boveda.views.inicio;

import com.boveda.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Inicio")
@Route(value = "inicio", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Uses(Icon.class)
public class InicioView extends Composite<VerticalLayout> {

    public InicioView() {
        H1 h1 = new H1();
        H4 h4 = new H4();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        h1.setText("¡Bienvenido a tu bóveda de contraseñas!");
        h1.setWidth("max-content");
        h4.setText("Creado por Naomi Lizano y Matías Criollo");
        h4.setWidth("max-content");
        getContent().add(h1);
        getContent().add(h4);
    }
}
