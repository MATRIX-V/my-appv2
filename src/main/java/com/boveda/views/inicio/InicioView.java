package com.boveda.views.inicio;


import com.boveda.Credenciales;
import com.boveda.Utils;
import com.boveda.views.MainLayout;
import com.boveda.views.crearclave.CrearClaveView;
import com.boveda.views.ingresarclavepreexistente.IngresarClavePreexistenteView;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility;

import java.util.List;


@PageTitle("Inicio")
@Route(value = "inicio", layout = MainLayout.class)
@Uses(Icon.class)
public class InicioView extends Composite<VerticalLayout> {

    public InicioView() {
        H1 h1 = new H1();
        H4 h4 = new H4();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        Grid<Credenciales> grid = new Grid<>(Credenciales.class, false);
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button BotonCrear = new Button();
        Button BotonGuardar = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        h1.setText("¡Bienvenido a tu bóveda de contraseñas!");
        h1.setWidth("max-content");
        h4.setText("Creado por Naomi Lizano y Matías Criollo");
        h4.setWidth("max-content");

        // Configurar las columnas del Grid
        grid.addColumn(Credenciales::getPlataforma).setHeader("Plataforma");
        grid.addColumn(Credenciales::getUsuario).setHeader("Usuario");
        grid.addColumn(Credenciales::getClave).setHeader("Clave cifrada");

        // Configurar datos de muestra en el Grid
        List<Credenciales> credenciales = Utils.Cred;
        grid.setItems(credenciales);

        layoutColumn2.setWidthFull();
        layoutColumn2.getStyle().set("flex-grow", "1");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(LumoUtility.Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        BotonCrear.setText("Crear clave");
        BotonCrear.setWidth("min-content");
        BotonCrear.addClickListener(event -> {
            // La lógica que se desea ejecutar cuando se presiona el botón
            UI.getCurrent().navigate(CrearClaveView.class);

        });
        BotonCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        BotonGuardar.setText("Guardar clave");
        BotonGuardar.setWidth("min-content");
        BotonGuardar.addClickListener(event -> {
            // La lógica que se desea ejecutar cuando se presiona el botón
            UI.getCurrent().navigate(IngresarClavePreexistenteView.class);

        });
        getContent().add(h1);

        // Configurar las columnas del Grid
        grid.addColumn(Credenciales::getPlataforma).setHeader("Plataforma");
        grid.addColumn(Credenciales::getUsuario).setHeader("Usuario");
        grid.addColumn(Credenciales::getClave).setHeader("Clave cifrada");

        // Configurar datos de muestra en el Grid
        List<Credenciales> credenciales = Utils.Cred;
        grid.setItems(credenciales);
        layoutColumn2.setWidthFull();
        layoutColumn2.getStyle().set("flex-grow", "1");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(LumoUtility.Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        BotonCrear.setText("Crear clave");
        BotonCrear.setWidth("min-content");
        BotonCrear.addClickListener(event -> {
            // La lógica que se desea ejecutar cuando se presiona el botón
            UI.getCurrent().navigate(CrearClaveView.class);

        });
        BotonCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        BotonGuardar.setText("Guardar clave");
        BotonGuardar.setWidth("min-content");
        BotonGuardar.addClickListener(event -> {
            // La lógica que se desea ejecutar cuando se presiona el botón
            UI.getCurrent().navigate(IngresarClavePreexistenteView.class);

        });
        getContent().add(h1);
        getContent().add(h4);
        layoutColumn2.add(grid);  // Mover el Grid dentro de layoutColumn2
        getContent().add(layoutColumn2);  // Agregar layoutColumn2 al contenido
        getContent().add(layoutRow);
        layoutRow.add(BotonCrear);
        layoutRow.add(BotonGuardar);
    }
}

