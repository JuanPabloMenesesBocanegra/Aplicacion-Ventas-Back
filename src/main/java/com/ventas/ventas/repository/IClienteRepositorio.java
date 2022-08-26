package com.ventas.ventas.repository;
import com.ventas.ventas.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepositorio extends JpaRepository<Cliente, Integer> {


}
