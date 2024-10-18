package com.uisrael.TareaSemanaIII_OneToMany.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoria_id")
    private List<Producto> Productos = new ArrayList<>();
}
