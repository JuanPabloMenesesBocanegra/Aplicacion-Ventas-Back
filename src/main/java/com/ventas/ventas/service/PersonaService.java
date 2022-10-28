package com.ventas.ventas.service;

import com.ventas.ventas.model.Persona;
import com.ventas.ventas.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements ICRUDService<Persona>{

    @Autowired
    private IPersonaRepository personaRepo;

    @Override
    public List<Persona> findAll() { return personaRepo.findAll();}

    @Override
    public Optional<Persona> findById(Integer id) {return personaRepo.findById(id);}

    @Override
    public Persona create(Persona persona) { return personaRepo.save(persona);}

    @Override
    public Persona update(Persona persona) {return personaRepo.save(persona);}

    @Override
    public void delete(Integer id) { personaRepo.deleteById(id);}
}
