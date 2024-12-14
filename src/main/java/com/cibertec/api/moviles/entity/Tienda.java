package com.cibertec.api.moviles.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Tienda {
    private Integer id;
    private String nombre;


    public Tienda(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Tienda(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
