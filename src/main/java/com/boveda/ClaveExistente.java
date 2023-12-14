package com.boveda;

import com.boveda.views.MainLayout;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.Scanner;

public class ClaveExistente extends Claves {



    @Override
    public String ingresar(int longitud) {
        boolean a;
        String clave;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese la contraseña que desea guardar, debe tener mínimo 8 caracteres");
            clave= scanner.next();
            longitud = clave.length();
            a = Longitud(longitud);
        }while (a==false);
        return clave;
    }
}