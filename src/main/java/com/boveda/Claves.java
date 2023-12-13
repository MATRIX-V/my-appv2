package com.boveda;

import java.util.Scanner;

public abstract class Claves {

    public abstract String ingresar(int longitud);

    public boolean Longitud (int longitud){
        if (longitud<8) {
            return false;
        }
        else{
            return true;
        }
    }

    public String generarUsuario (){
        Scanner scanner = new Scanner(System.in);
        /*int menu2=0;
        String usuario="";
        do {
            System.out.println("1. Guardar contraseña");
            System.out.println("2.Salir");
            menu2 = scanner.nextInt();
            if (menu2==1){
                System.out.println("Ingrese el usuario correspondiente a esta contraseña");
                usuario = scanner.next();

            } else if (menu2==2) {
                break;
            }
            else {
                System.out.println("Numero inválido");
            }
        }while (menu2!=1);
        return usuario;*/
        System.out.println("Ingrese el usuario correspondiente a esta contraseña");
        String usuario = scanner.next();
        return usuario;
    }
    public String generarPalabraClave (){
        Scanner scanner = new Scanner(System.in);
        int menu2=0;
        String plat="";
        System.out.println("Ingrese la plataforma a la que corresponden estos datos");
        plat = scanner.next();

        return plat;
    }




}