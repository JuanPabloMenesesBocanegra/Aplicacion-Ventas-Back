package com.ventas.ventas.repository;

import com.ventas.ventas.model.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetalleVenta extends JpaRepository<DetalleVenta, Integer> {
}
