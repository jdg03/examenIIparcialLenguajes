package hn.unah.lenguajes1900.examen.services.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.examen.entities.Cliente;
import hn.unah.lenguajes1900.examen.entities.Direccion;
import hn.unah.lenguajes1900.examen.repositories.ClienteRepository;
import hn.unah.lenguajes1900.examen.repositories.DireccionRepository;
import hn.unah.lenguajes1900.examen.services.DireccionService;

@Service
public class DireccionServiceimpl implements DireccionService  {

    @Autowired
    private DireccionRepository direccionRepository;

    @Autowired
    private ClienteRepository ClienteRepository;

    @Override
    public Direccion crearDireccion(Direccion direccion, String dni) {
   
       Cliente  cliente = this.ClienteRepository.findById(dni).get();
      
       if (cliente!=null) {
          
           //direccion.setDni(cliente.getDni);

          
           return direccionRepository.save(direccion);
       } else {
          
           return null;
       }
    }
    
}
