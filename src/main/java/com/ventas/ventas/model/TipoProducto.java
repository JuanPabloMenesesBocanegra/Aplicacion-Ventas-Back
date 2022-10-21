package com.ventas.ventas.model;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
public class TipoProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer idTipoProducto;

    @Column(length = 15)
    private String codigo;

    @Column(length = 150)
    private String nombre;

    public Integer getIdTipoProducto() {
        return idTipoProducto;
    }
}
