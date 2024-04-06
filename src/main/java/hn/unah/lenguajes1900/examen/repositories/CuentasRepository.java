package hn.unah.lenguajes1900.examen.repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes1900.examen.entities.Cuentas;

public interface CuentasRepository extends CrudRepository<Cuentas, String> {
    
}
