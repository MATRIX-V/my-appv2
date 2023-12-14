package com.boveda;

import com.vaadin.flow.component.html.Paragraph;

import java.util.HashMap;
import java.util.Map;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.*;
import java.security.Key;
import java.util.Base64;
import java.util.Scanner;

public class Boveda {
    private static Boveda instancia;
    private Map<String,String> mapClaves= new HashMap<>();
    private Map<String,String> mapUsuarios= new HashMap<>();
    Encriptar encriptar1=new Encriptar();
    private Boveda() {
        // Inicialización de la instancia, si es necesario
    }
//Patron de diseño Singletonpara tener una única instancia
    public static synchronized Boveda obtenerInstancia() {
        if (instancia == null) {
            instancia = new Boveda();
        }
        return instancia;
    }

    public String guardarClave (String plat, String clave){
        String claveE = encriptar1.encriptarAES(clave);

        mapClaves.put(plat, claveE);
        return claveE;
    }


    public void guardarUsuario (String plat, String usuario){
        mapUsuarios.put(plat,usuario);
    }

    public String mostrarClave (String plat){

        return encriptar1.desencriptarAES(mapClaves.get(plat));

    }
    public String mostrarUsuario (String plat){
        return mapUsuarios.get(plat);
    }
    public void cambiarClave(String plat){
        System.out.println("Ingrese la nueva clave");
        Scanner scanner = new Scanner(System.in);
        String claven = scanner.next();
        mapClaves.put(plat, claven);
        System.out.println("La clave nueva es:"+mapClaves.get(plat));
    }


    public void cambiarUsuario(String plat){
        System.out.println("Ingrese el nuevo usuario");
        Scanner scanner = new Scanner(System.in);
        String usuarion = scanner.next();
        mapUsuarios.put(plat, usuarion);
        System.out.println("La clave nueva es:"+mapUsuarios.get(plat));
    }


}

