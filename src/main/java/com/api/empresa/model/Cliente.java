package com.api.empresa.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    private String nombre;
    private String apellido;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Direccion> direcciones = new ArrayList<>();

}
