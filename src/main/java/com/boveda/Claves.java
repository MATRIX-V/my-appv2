package com.boveda;

import java.util.Scanner;

public abstract class Claves {

    public abstract String ingresar(int longitud);

    public boolean Longitud (int longitud){
        if (longitud<8 || longitud>100) {
            return false;
        }
        else{
            return true;
        }
    }






}