package com.cibertec.api.moviles.controller;


import com.cibertec.api.moviles.entity.Categoria;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoriaController {
    private final List<Categoria> categories = new ArrayList<>(
            Arrays.asList(
                    new Categoria(1, "Comida"),
                    new Categoria(2, "Electronica"),
                    new Categoria(3, "Ropa"),
                    new Categoria(4, "Limpieza"),
                    new Categoria(5,"Bebidas"),
                    new Categoria(6,"Juguetes"),
                    new Categoria(7,"Mascotas"),
                    new Categoria(8,"Deportes"),
                    new Categoria(9 , "Hogar")
            )
    );

    @GetMapping
    public ResponseEntity<List<Categoria>> getAllCategories() {
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

}
