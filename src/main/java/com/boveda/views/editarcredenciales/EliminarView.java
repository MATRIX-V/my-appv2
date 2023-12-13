package com.boveda.views.eliminar;

import com.boveda.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Eliminar")
@Route(value = "eliminar", layout = MainLayout.class)
@Uses(Icon.class)
public class EliminarView extends Composite<VerticalLayout> {

    public EliminarView() {
        H1 h1 = new H1();
        H4 h4 = new H4();
        TextField textField = new TextField();
        Button buttonPrimary = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        h1.setText("Credenciales para eliminar");
        h1.setWidth("max-content");
        h4.setText("Credenciales");
        h4.setWidth("max-content");
        textField.setLabel("Plataforma");
        textField.setWidth("min-content");
        buttonPrimary.setText("Buscar");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(h1);
        getContent().add(h4);
        getContent().add(textField);
        getContent().add(buttonPrimary);
    }
}