package hn.unah.lenguajes1900.examen.services;

import java.util.List;
import java.util.Optional;

import hn.unah.lenguajes1900.examen.entities.Cliente;

public interface ClienteService {
    

    public Cliente crearCliente(Cliente cliente);

    public Cliente asociarCuentaCliente(String dni, String numerocuenta );

    public List<Cliente> Obtenerclientes();

    
    public Optional<Cliente> ObtenerclientePorDni(String dni);

}
