package hn.unah.lenguajes1900.examen.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.examen.entities.Cliente;
import hn.unah.lenguajes1900.examen.entities.Cuentas;
import hn.unah.lenguajes1900.examen.repositories.ClienteRepository;
import hn.unah.lenguajes1900.examen.repositories.CuentasRepository;
import hn.unah.lenguajes1900.examen.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private CuentasRepository cuentasRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {

        Optional<Cliente> clienteExistente = clienteRepository.findById(cliente.getDni());

        if (clienteExistente.isPresent()) {
            
            return clienteExistente.get();
        } else {
            
            Cliente clienteGuardado = this.clienteRepository.save(cliente);

    
            if (null !=cliente.getCuentas()) {
             
                for (Cuentas cuenta : cliente.getCuentas()) {
              
                    cuenta.setDni(clienteGuardado);
                   
                    this.cuentasRepository.save(cuenta);
                }
            }

            // Devuelve el cliente guardado en la base de datos
            return clienteGuardado;
        }
    }
    

    @Override
    public Cliente asociarCuentaCliente(String dni, String numerocuenta) {
       
        Optional<Cliente> clienteOptional = clienteRepository.findById(dni);
        if (!clienteOptional.isPresent()) {
         return null;
        }
        Cliente cliente = clienteOptional.get();

      
        Optional<Cuentas> cuentaOptional = cuentasRepository.findById(numerocuenta);
        if (!cuentaOptional.isPresent()) {
            return null;
        }
        Cuentas cuenta = cuentaOptional.get();

        // Verificar si la cuenta ya está asociada a otro cliente
        if (cuenta.getDni() != null && !cuenta.getDni().getDni().equals(dni)) {
           return null;
        }

        
        cuenta.setDni(cliente);
        cuentasRepository.save(cuenta);

        return cliente;
    }

    @Override
    public List<Cliente> Obtenerclientes() {

        return (List<Cliente>) this.clienteRepository.findAll();

    }

    @Override
    public Optional<Cliente> ObtenerclientePorDni(String dni) {

        return this.clienteRepository.findById(dni);
    }

}
