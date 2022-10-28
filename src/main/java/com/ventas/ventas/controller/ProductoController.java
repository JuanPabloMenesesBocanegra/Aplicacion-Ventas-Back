package com.ventas.ventas.controller;

import com.ventas.ventas.model.Producto;
import com.ventas.ventas.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public ResponseEntity<List<Producto>> findAll(){

        return  ResponseEntity.ok(productoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> findById(@PathVariable("id") Integer idProducto){
        return productoService.findById(idProducto).map(ResponseEntity::ok)
                .orElseGet(()-> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Producto> Create(@Valid @RequestBody Producto producto){
        return new ResponseEntity<>(productoService.create(producto), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Producto> update(Producto producto){
        return productoService.findById(producto.getIdProducto())
                .map(p-> ResponseEntity.ok(productoService.update(producto)))
                .orElseGet(()-> ResponseEntity.notFound().build());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Producto> delete(@PathVariable("id") Integer idProducto){

        return productoService.findById(idProducto)
                .map( c -> {
                    productoService.delete(idProducto);
                    return ResponseEntity.ok(c);

                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

}

