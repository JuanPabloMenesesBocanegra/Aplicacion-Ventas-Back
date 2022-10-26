package com.ventas.ventas.repository;

import com.ventas.ventas.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVenta extends JpaRepository<Venta, Integer> {
}
