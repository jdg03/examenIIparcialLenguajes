package hn.unah.lenguajes1900.examen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.examen.entities.Direccion;
import hn.unah.lenguajes1900.examen.services.impl.DireccionServiceimpl;

@RestController
@RequestMapping("/examen")
public class DireccionController {
    

  @Autowired
  private DireccionServiceimpl direccionServiceimpl;

  @RequestMapping("/guardarDireccion/{dni}")
  public Direccion crearDireccion(@RequestBody Direccion direccion, @PathVariable String dni) {
    return this.direccionServiceimpl.crearDireccion(direccion, dni);
}

}
