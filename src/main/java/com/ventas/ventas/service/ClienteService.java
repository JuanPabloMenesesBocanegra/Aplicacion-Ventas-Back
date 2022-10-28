package com.ventas.ventas.service;

import com.ventas.ventas.model.Cliente;
import com.ventas.ventas.repository.IClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements ICRUDService<Cliente>{

    @Autowired
    private IClienteRepositorio clienteRepo;

    @Override
    public List<Cliente> findAll() {

        return clienteRepo.findAll();
    }

    @Override
    public Optional<Cliente> findById(Integer id) {

        return clienteRepo.findById(id);
    }

    @Override
    public Cliente create(Cliente cliente) {

        return clienteRepo.save(cliente);
    }

    @Override
    public Cliente update(Cliente cliente) {

        return clienteRepo.save(cliente);
    }

    @Override
    public void delete(Integer id) {

        clienteRepo.deleteById(id);

    }
}
