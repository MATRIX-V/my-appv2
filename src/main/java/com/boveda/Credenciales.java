package com.boveda;

import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
@Document (collection = "credenciales")

public class Credenciales {
    private String plataforma;

    private String usuario;

    private String clave;

    public Credenciales(String plataforma, String usuario, String clave) {
        this.plataforma = plataforma;
        this.usuario = usuario;
        this.clave = clave;
    }

    public Credenciales() {
    }

    public String getPlataforma() {
        return plataforma;
    }


}
