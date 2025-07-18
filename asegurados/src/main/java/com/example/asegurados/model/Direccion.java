package com.example.asegurados.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Direccion {
    private int id;
    private String calle;
    private String numeroExterior;
    private String colonia;
    private String ciudad;
}
