package com.ventas.ventas.controller;


import com.ventas.ventas.model.TipoProducto;
import com.ventas.ventas.service.TipoProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/tipoProductos")
public class TipoProductoController {

    @Autowired
    private TipoProductoService tipoProductoService;

    @GetMapping
    public ResponseEntity<List<TipoProducto>> findAll(){

        return  ResponseEntity.ok(tipoProductoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoProducto> findById(@PathVariable("id") Integer idTipoProducto){
        return tipoProductoService.findById(idTipoProducto).map(ResponseEntity::ok)
                .orElseGet(()-> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<TipoProducto> Create(@Valid @RequestBody TipoProducto tipoProducto){
        return new ResponseEntity<>(tipoProductoService.create(tipoProducto), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<TipoProducto> update(TipoProducto tipoProducto){
        return tipoProductoService.findById(tipoProducto.getIdTipoProducto())
                .map(p-> ResponseEntity.ok(tipoProductoService.update(tipoProducto)))
                .orElseGet(()-> ResponseEntity.notFound().build());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<TipoProducto> delete(@PathVariable("id") Integer idTipoProducto){

        return tipoProductoService.findById(idTipoProducto)
                .map( c -> {
                    tipoProductoService.delete(idTipoProducto);
                    return ResponseEntity.ok(c);

                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}

