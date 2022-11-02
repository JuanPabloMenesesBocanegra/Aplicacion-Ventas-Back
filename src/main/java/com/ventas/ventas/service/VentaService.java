package com.ventas.ventas.service;

import com.ventas.ventas.model.Venta;
import com.ventas.ventas.repository.IProductoRepository;
import com.ventas.ventas.repository.IVenta;
import com.ventas.ventas.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class VentaService implements ICRUDService<Venta>{

    @Autowired
    private IVenta ventaRepo;

    @Autowired
    private IProductoRepository productoRepo;

    @Override
    public List<Venta> findAll() {return ventaRepo.findAll();}

    @Override
    public Optional<Venta> findById(Integer id) {return ventaRepo.findById(id);}

    @Override
    public Venta create(Venta venta) {

        venta.getDetalleVenta().forEach(detalleVenta -> {
            Optional<Producto> producto = productoRepo.findById(detalleVenta.getProducto().getIdProducto());
            if(producto.isPresent()){
                Double precioUnitario = producto.get().getPrecio();
                Double precioTotal = precioUnitario * detalleVenta.getCantidad().doubleValue();
                detalleVenta.setPrecio(precioUnitario);
                detalleVenta.setPrecioTotal(precioTotal);
                detalleVenta.setVenta(venta);
            }
        });

        return ventaRepo.save(venta);
    }

    @Override
    public Venta update(Venta venta) {return ventaRepo.save(venta);}

    @Override
    public void delete(Integer id) {ventaRepo.deleteById(id);}
}
