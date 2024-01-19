package com.boveda.models;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
@Document (collection = "credenciales")

public class Credenciales {
    @Id
    private String id;
    @Indexed (name="plataforma", unique = true)
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getPlataforma() {
        return plataforma;
    }


}
