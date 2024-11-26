package com.api.empresa.controller;

import com.api.empresa.model.Direccion;
import com.api.empresa.service.DireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/direcciones")
public class DireccionController {

    @Autowired
    private DireccionService direccionService;

    // GET
    @GetMapping
    public List<Direccion> listarTodo(){
        return direccionService.getAllDirecciones();
    }

    // POST
    @PostMapping
    public Direccion crear(@RequestBody Direccion direccion){
        return direccionService.createDireccion(direccion);
    }

    // PUT
    @PostMapping("editar/{id}")
    public Direccion actualizar(@RequestBody Direccion direccion, @PathVariable Long id){
        direccion.setIdDireccion(id);
        return direccionService.updatedireccion(direccion);
    }

    // ELIMINAR
    @DeleteMapping("eliminar/{id}")
    public void eliminar(@PathVariable Long id){
        direccionService.deleteDireccionById(id);
    }
}
