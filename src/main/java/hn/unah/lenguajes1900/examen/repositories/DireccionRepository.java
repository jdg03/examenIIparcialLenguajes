package hn.unah.lenguajes1900.examen.repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes1900.examen.entities.Direccion;


public interface DireccionRepository extends CrudRepository<Direccion, Integer> {
    
}
