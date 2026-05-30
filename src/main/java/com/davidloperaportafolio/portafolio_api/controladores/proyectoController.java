package com.davidloperaportafolio.portafolio_api.controladores;

import com.davidloperaportafolio.portafolio_api.modelos.Proyecto;
import com.davidloperaportafolio.portafolio_api.servicios.proyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proyectos")
@CrossOrigin(origins = "*")
public class proyectoController {

    @Autowired
    private proyectoService servicio;

    @GetMapping
    public List<Proyecto> obtenerTodos() {
        return servicio.obtenerTodos();
    }

    @PostMapping
    public Proyecto crearProyecto(@RequestBody Proyecto proyecto) {
        return servicio.crearProyecto(proyecto);
    }
}