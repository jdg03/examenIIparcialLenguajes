package hn.unah.lenguajes1900.examen.repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes1900.examen.entities.Movimientos;

public interface MovimientosRepository extends CrudRepository<Movimientos, Integer> {
    
}
