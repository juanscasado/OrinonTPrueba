package com.api.empresa.controller;

import com.api.empresa.model.Cliente;
import com.api.empresa.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    // GET
    @GetMapping
    public List<Cliente> listarTodo(){
        return clienteService.getAllClientes();
    }

    // POST
    @PostMapping
    public Cliente crear(@RequestBody Cliente cliente){
        return clienteService.createCliente(cliente);
    }

    // PUT
    @PostMapping("editar/{id}")
    public Cliente actualizar(@RequestBody Cliente cliente, @PathVariable Long id){
        cliente.setIdCliente(id);
        return clienteService.updateCliente(cliente);
    }

    // ELIMINAR
    @DeleteMapping("eliminar/{id}")
    public void eliminar(@PathVariable Long id){
        clienteService.deleteClienteById(id);
    }

}
