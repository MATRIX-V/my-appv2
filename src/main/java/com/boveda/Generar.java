package com.boveda;

import com.boveda.Claves;
import com.vaadin.flow.component.html.Paragraph;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Generar extends Claves {

    //declaramos con final para evitar modificación del contenido en cualquier parte del código:
    /* serán llamados en conjunto como libelementos a la hora de la generacion de claves*/
    private String minusculas = "abcdefghijklmnñopqrstuvwxyz";
    private String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String num = "1234567890";
    private String especiales = "?¡¿'!|°#$%&/())=?¨*[]´+}{-*/;:_<>.";

    ////////////////////////////////////////////////////////////////////////////////////////
    public Generar() {
    }


    public String pswgen(int lenght) {

    /*StringBuilder para poder usar y modificar solo en pswgen las cadenas de caracteres que
    declaré al inicio */

        StringBuilder contrasena = new StringBuilder();
        String libelementos = this.minusculas + this.mayusculas + this.num + this.especiales;
        Random random = new SecureRandom();

        for (int i = 0; i < lenght; i++) {
            //randomiza el contenido de libelementos, es decir, minusculas, mayusculas, num y signos
            int index = random.nextInt(libelementos.length());
            contrasena.append(libelementos.charAt(index));
        }
        return contrasena.toString();

    }

    @Override
    public String ingresar(int longitud) {
        // Crear un nuevo JTextField


        boolean a = Longitud(longitud);

        if (a == false) {

            return "Su contraseña no será segura, debe tener minimo 8 caracteres";
        }
        else {
            String pswgen = pswgen(longitud);
            return pswgen;
        }


    }


}