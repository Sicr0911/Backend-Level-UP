package com.example.Backend_Level_UP.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Usuario")
@Getter @Setter @ToString @NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Nombre;
    private String Email;

    private String Password;

    private String rol;

    @OneToMany(mappedBy = "Usuario")
    private set<Boleta> boletas;
}
