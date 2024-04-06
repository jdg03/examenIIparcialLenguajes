package hn.unah.lenguajes1900.examen.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.examen.entities.Cuentas;
import hn.unah.lenguajes1900.examen.repositories.CuentasRepository;
import hn.unah.lenguajes1900.examen.repositories.MovimientosRepository;
import hn.unah.lenguajes1900.examen.services.CuentaService;

@Service
public class CuentaServiceImpl implements CuentaService {


    @Autowired
    private CuentasRepository cuentasRepository;

    @Autowired
    private MovimientosRepository movimientosRepository;

    @Override
    public Cuentas crearCuenta(Cuentas cuentas) {
        
        return this.cuentasRepository.save(cuentas);

    }
    
}
