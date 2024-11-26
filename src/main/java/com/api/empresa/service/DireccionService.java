package com.api.empresa.service;

import com.api.empresa.model.Direccion;
import com.api.empresa.repository.DireccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DireccionService {

    @Autowired
    private DireccionRepository direccionRepository;

    // mostrar direccion
    public List<Direccion> getAllDirecciones(){
        return direccionRepository.findAll();
    }

    // crear direccion
    public Direccion createDireccion(Direccion direccion){
        return direccionRepository.save(direccion);
    }

    // editar direccion
    public Direccion updatedireccion(Direccion direccion){
        return direccionRepository.save(direccion);
    }

    // eliminar cliente
    public void deleteDireccionById(Long id){
        direccionRepository.deleteById(id);
    }
}
