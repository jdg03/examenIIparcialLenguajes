package hn.unah.lenguajes1900.examen.services;

import hn.unah.lenguajes1900.examen.entities.Movimientos;

public interface MovimientService {
    
    public Movimientos CrearMovimiento(Movimientos movimiento);

    public Movimientos ObtenerMovimientosPorCuenta(String numeroCuenta);

}
