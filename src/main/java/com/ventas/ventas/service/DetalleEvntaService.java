package com.ventas.ventas.service;

import com.ventas.ventas.model.DetalleVenta;
import com.ventas.ventas.repository.IDetalleVenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DetalleEvntaService implements ICRUDService<DetalleVenta> {

    @Autowired
    private IDetalleVenta detalleVentaRepo;
    @Override
    public List<DetalleVenta> findAll() { return detalleVentaRepo.findAll();}

    @Override
    public Optional<DetalleVenta> findById(Integer id) {return detalleVentaRepo.findById(id);}

    @Override
    public DetalleVenta create(DetalleVenta detalleVenta) {return detalleVentaRepo.save(detalleVenta);}

    @Override
    public DetalleVenta update(DetalleVenta detalleVenta) { return detalleVentaRepo.save(detalleVenta);}

    @Override
    public void delete(Integer id) { detalleVentaRepo.deleteById(id);}
}
