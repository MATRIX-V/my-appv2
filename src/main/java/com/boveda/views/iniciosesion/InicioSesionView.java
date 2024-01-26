package com.boveda.views.iniciosesion;



import com.boveda.services.CredencialesService;
import com.boveda.views.MainLayout;
import com.boveda.views.crearclave.CrearClaveView;
import com.boveda.views.inicio.InicioView;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

import java.util.ArrayList;
import java.util.List;

@PageTitle("Inicio Sesion")
@Route(value = "inicio-sesion")
@RouteAlias(value = "", layout = MainLayout.class)
@Uses(Icon.class)
public class InicioSesionView extends Composite<VerticalLayout> {
    private CredencialesService credencialesService;
    private UsuarioService usuarioService;

    public InicioSesionView(CredencialesService credencialesService) {

        HorizontalLayout layoutRow = new HorizontalLayout();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        TextField textFieldUsuario = new TextField();
        TextField textFieldClave = new TextField();
        Button BotonIniciar = new Button();
        Button BotonCrear = new Button();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        HorizontalLayout layoutRow4 = new HorizontalLayout();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        layoutRow2.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        layoutColumn2.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        textFieldUsuario.setLabel("Usuario maestro");
        layoutColumn2.setAlignSelf(FlexComponent.Alignment.CENTER, textFieldUsuario);
        textFieldUsuario.setWidth("min-content");
        textFieldClave.setLabel("Contraseña maestra");
        layoutColumn2.setAlignSelf(FlexComponent.Alignment.CENTER, textFieldClave);
        textFieldClave.setWidth("min-content");
        BotonIniciar.setText("Entrar");
        BotonCrear.setText("Crear");
        layoutColumn2.setAlignSelf(FlexComponent.Alignment.CENTER, BotonIniciar);
        layoutColumn2.setAlignSelf(FlexComponent.Alignment.CENTER, BotonCrear);
        BotonIniciar.setWidth("min-content");
        BotonIniciar.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        BotonIniciar.addClickListener(event -> {
            // La lógica que se desea ejecutar cuando se presiona el botón
            String usuarioMaestro = textFieldUsuario.getValue();
            String claveMaestra = textFieldClave.getValue();

            if (usuarioService.validarUsuarioMaestro(usuarioMaestro, claveMaestra)) {
                // Credenciales maestras válidas, redirige a la vista de Inicio
                UI.getCurrent().navigate(InicioView.class);
                credencialesService.RecargarCredenciales(CredencialesService.id);
                //usuarioService.cargarDatosIniciales(CredencialesService.id);
            } else {
                Notification.show("Credenciales maestras incorrectas");
            }

        });
        BotonCrear.addClickListener(event -> {
            String usuarioMaestro = textFieldUsuario.getValue();
            String claveMaestra = textFieldClave.getValue();
            Usuario usuario = new Usuario(usuarioMaestro, claveMaestra);
            usuarioService.CrearUsuario(usuario);
            CredencialesService.id = usuario.getId();
            credencialesService.RecargarCredenciales(CredencialesService.id);
            UI.getCurrent().navigate(InicioView.class);
                });
        layoutRow3.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.getStyle().set("flex-grow", "1");
        layoutRow4.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow4);
        layoutRow4.addClassName(Gap.MEDIUM);
        layoutRow4.setWidth("100%");
        layoutRow4.getStyle().set("flex-grow", "1");
        getContent().add(layoutRow);
        layoutRow.add(layoutRow2);
        layoutRow.add(layoutColumn2);
        layoutColumn2.add(textFieldUsuario);
        layoutColumn2.add(textFieldClave);
        layoutColumn2.add(BotonIniciar);
        layoutColumn2.add(BotonCrear);


        layoutRow.add(layoutRow3);
        getContent().add(layoutRow4);
    }
}
