

package com.boveda;

        import java.util.HashMap;
        import java.util.Map;
        import java.util.Scanner;

public class Boveda {
    private static Boveda instancia;
    private static Map<String, String> mapClaves = new HashMap<>();
    private static Map<String, String> mapUsuarios = new HashMap<>();
    Encriptar encriptar1 = new Encriptar();


    public Boveda() {
        // Inicialización de la instancia, si es necesario
    }

    // Patron de diseño Singleton para tener una única instancia
    public static synchronized Boveda obtenerInstancia() {
        if (instancia == null) {
            instancia = new Boveda();
        }
        return instancia;
    }

    public String guardarClave(String plat, String clave) {
        String claveE = encriptar1.encriptarAES(clave);
        mapClaves.put(plat, claveE);
        return claveE;
    }

    public void guardarUsuario(String plat, String usuario) {
        mapUsuarios.put(plat, usuario);
    }

    public String mostrarClave(String plat) {
        return encriptar1.desencriptarAES(mapClaves.get(plat));
    }

    public String mostrarUsuario(String plat) {
        return mapUsuarios.get(plat);
    }




    public boolean existePlataforma(String plat) {
        return mapClaves.containsKey(plat);
    }
    public String cambiarClave(String plat, String nuevaClave) {
        String claveE = encriptar1.encriptarAES(nuevaClave);
        mapClaves.put(plat, claveE);
        return claveE;
    }

    public void cambiarUsuario(String plat, String nuevoUsuario) {
        mapUsuarios.put(plat, nuevoUsuario);
    }



    public static void eliminarDato(String plat) {
        if (mapUsuarios.containsKey(plat)) {
            // Eliminar la entrada correspondiente en ambos mapas
            mapUsuarios.remove(plat);
            mapClaves.remove(plat);
        }

    }
}

