package com.davidloperaportafolio.portafolio_api.servicios;

import com.davidloperaportafolio.portafolio_api.modelos.Proyecto;
import com.davidloperaportafolio.portafolio_api.repositorio.IproyectoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class proyectoService {

    @Autowired
    private IproyectoRepository repository;

    public List<Proyecto> obtenerTodos() {
        return repository.findAll();
    }

    public Proyecto crearProyecto(Proyecto proyecto) {
        // Aquí en el futuro puedes agregar lógica, por ejemplo:
        // if(repository.existsById(proyecto.getId())) { throw new RuntimeException("El ID ya existe"); }
        return repository.save(proyecto);
    }
}