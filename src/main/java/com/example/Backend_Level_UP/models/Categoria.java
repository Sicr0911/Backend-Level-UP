package com.example.Backend_Level_UP.models;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Entity
@Table(name = "Categoria")
@Getter @Setter @NoArgsConstructor @ToString
public class Categoria {

        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;


        private String nombre;
        private String descripcion;


        @OneToMany(mappedBy = "categoria")
        private Set<Producto> productos;


}

