package com.boveda.services;

import com.boveda.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public boolean validarUsuarioMaestro(String usuario, String clave) {
        // Lógica para validar el usuario maestro en la base de datos
        // Devuelve true si las credenciales son correctas, de lo contrario, false
        try {
            Usuario usuarioMaestro = usuarioRepository.findByUsuario(usuario);
            CredencialesService.id = usuarioMaestro.getId();
            return usuarioMaestro != null && usuarioMaestro.getClave().equals(clave);
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    public boolean validarUsuarioMaestro2(String usuario) {
        // Lógica para validar el usuario maestro en la base de datos
        // Devuelve true si las credenciales son correctas, de lo contrario, false
        try {
            Usuario usuarioMaestro = usuarioRepository.findByUsuario(usuario);
            CredencialesService.id = usuarioMaestro.getId();
            return usuarioMaestro.getUsuario() != null;
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    public void crearUsuarioMaestro(Usuario usuario) {
        // Lógica para crear un usuario maestro en la base de datos
        usuarioRepository.save(usuario);
    }

    public void CrearUsuario(Usuario usuario){

        usuarioRepository.save(usuario);
    }

}
