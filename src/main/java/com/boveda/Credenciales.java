package com.boveda;

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
}
