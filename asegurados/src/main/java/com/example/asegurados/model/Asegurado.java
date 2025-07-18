package com.example.asegurados.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Asegurado {
    private long id;
    private long numPoliza;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String email;
    private String movil;
    private Direccion direccion;
}
