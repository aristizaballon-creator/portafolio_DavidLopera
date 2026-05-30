package com.davidloperaportafolio.portafolio_api.repositorio;


import com.davidloperaportafolio.portafolio_api.modelos.Proyecto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IproyectoRepository extends MongoRepository<Proyecto, String> {
    // MongoRepository ya trae métodos como save(), findAll(), findById(), etc.
}