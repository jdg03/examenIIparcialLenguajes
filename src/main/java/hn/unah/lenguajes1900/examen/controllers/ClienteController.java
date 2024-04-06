package hn.unah.lenguajes1900.examen.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.examen.entities.Cliente;
import hn.unah.lenguajes1900.examen.services.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/examen")
public class ClienteController {


    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    
    @PostMapping("/crearCliente")
    public Cliente crearCliente(@RequestBody Cliente cliente){

        return this.clienteServiceImpl.crearCliente(cliente);

    }


    @GetMapping("/obtenerClientes")
    public List<Cliente> obtenerUsuarios(){
        return this.clienteServiceImpl.Obtenerclientes();
    }

    
    @GetMapping("/obtenerClienteId/{dni}")
    public Optional<Cliente> obtenerClienteId(@PathVariable String dni){
        return this.clienteServiceImpl.ObtenerclientePorDni(dni);
    }

    @PutMapping("/asociarCuentaCliente")
    public Cliente asociarCuentaCliente(@PathVariable String dni, @RequestParam String numerocuenta){

        return this.clienteServiceImpl.asociarCuentaCliente(dni, numerocuenta);
    }
    
}
