package com.api.empresa.service;

import com.api.empresa.model.Cliente;
import com.api.empresa.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    // mostrar cliente
    public List<Cliente> getAllClientes(){
        return clienteRepository.findAll();
    }

    // crear cliente
    public Cliente createCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    // editar cliente
    public Cliente updateCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    // eliminar cliente
    public void deleteClienteById(Long id){
        clienteRepository.deleteById(id);
    }
}
