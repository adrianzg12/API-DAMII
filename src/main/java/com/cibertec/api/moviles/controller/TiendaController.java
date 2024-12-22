package com.cibertec.api.moviles.controller;

import com.cibertec.api.moviles.entity.Tienda;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/tiendas")
public class TiendaController {

    private final List<Tienda> stores = new ArrayList<>(
            Arrays.asList(
                    new Tienda(1, "Supermercado"),
                    new Tienda(2, "Tienda de Electrónica"),
                    new Tienda(3, "Boutique de Ropa"),
                    new Tienda(5,"Libreria"),
                    new Tienda(6,"Jardineria"),
                    new Tienda(7,"Papeleria")
            )
    );

    @GetMapping
    public ResponseEntity<List<Tienda>> getAllStores() {
        return new ResponseEntity<>(stores, HttpStatus.OK);
    }

}
