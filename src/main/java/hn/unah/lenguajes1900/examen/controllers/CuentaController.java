package hn.unah.lenguajes1900.examen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.examen.entities.Cuentas;
import hn.unah.lenguajes1900.examen.services.impl.CuentaServiceImpl;

@RestController
@RequestMapping("/examen")
public class CuentaController {

    @Autowired
    private CuentaServiceImpl cuentaServiceImpl;

    
    @PostMapping("/crearCuentas")
    public Cuentas crearCuenta(@RequestBody Cuentas cuenta){

        return this.cuentaServiceImpl.crearCuenta(cuenta);

    }
}
