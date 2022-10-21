package com.ventas.ventas.model;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;

    @Column (length = 20)
    private String nit;

    @Column (length = 20)
    private String razonSocial;


    @NotNull
    @NotBlank(message = "El email es obligatorio")
    @Size(min = 3, message = "El email debe ser de al menos 3 caracteres ")
    @Email(message = "El email enviado no tiene un formato valido")
    @Column(name = "email", nullable = false, length = 70)
    private String email;

    @OneToOne
    @JoinColumn(name = "id_persona", nullable = false)
    private Persona persona;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(idCliente, cliente.idCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente);
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
