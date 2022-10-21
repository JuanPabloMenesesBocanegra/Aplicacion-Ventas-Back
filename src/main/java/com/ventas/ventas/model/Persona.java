package com.ventas.ventas.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPersona;

    @NotNull
    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 3, max = 70, message = "El nombre debe ser mayor a 3 caracteres / menor a 70")
    @Column(name = "nombres", nullable = false, length = 70)
    private String nombres;

    @NotNull
    @NotBlank(message = "El Apellido es obligatorio")
    @Size(min = 3, max = 70, message = "El Apellido debe ser mayor a 3 caracteres / menor a 70")
    @Column(name = "apellidos", nullable = false, length = 70)
    private String apellidos;

    @Column(name = "direccion", nullable = false, length = 70)
    private String direccion;

    @Column(name = "telefono", nullable = false, length = 70)
    private String telefono;


    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
