package com.boveda.services;

import com.boveda.models.Credenciales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CredencialesService {
    private CredencialesRepository credencialesRepository;
    @Autowired
    public CredencialesService(CredencialesRepository credencialesRepository){
        this.credencialesRepository=credencialesRepository;
    }

    public void agregarCredenciales(Credenciales credenciales){
        try{
            credencialesRepository.save(credenciales);
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("No se pudo guardar el contacto");
        }
    }

    public List<Credenciales> BuscarCredencialesPorUsuario(String idUsuario){
        List<Credenciales> listaCredenciales= new ArrayList<>();
        try{
          listaCredenciales=credencialesRepository.findByIdUsuario(idUsuario);
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("No se pudo guardar el contacto");
        }
        return listaCredenciales;
    }




}
