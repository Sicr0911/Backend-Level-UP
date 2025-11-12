package com.example.Backend_Level_UP.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Producto")
@Getter @Setter @ToString @NoArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tipo-Producto")
    private String tipoProducto;

    @Column(unique = true, nullable = false)
    @NotBlank(message = "El campo nombre no puede ser vacio")
    private String nombre;

    @OneToMany(mappedBy = "tipoProducto", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonBackReference("tipo-usuario")
    private List<Producto> productos = new ArrayList<>();
}
