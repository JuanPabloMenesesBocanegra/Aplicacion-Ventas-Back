package com.ventas.ventas.service;

import com.ventas.ventas.model.Venta;
import com.ventas.ventas.repository.IVenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class VentaService implements ICRUDService<Venta>{

    @Autowired
    private IVenta ventaRepo;
    @Override
    public List<Venta> findAll() {return ventaRepo.findAll();}

    @Override
    public Optional<Venta> findById(Integer id) {return ventaRepo.findById(id);}

    @Override
    public Venta create(Venta venta) {return ventaRepo.save(venta);}

    @Override
    public Venta update(Venta venta) {return ventaRepo.save(venta);}

    @Override
    public void delete(Integer id) {ventaRepo.deleteById(id);}
}
