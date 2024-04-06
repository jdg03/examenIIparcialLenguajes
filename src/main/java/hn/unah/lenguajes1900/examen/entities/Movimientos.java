package hn.unah.lenguajes1900.examen.entities;

import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="movimientos")
@Data
public class Movimientos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idmovimiento")
    private int idmovimiento;

    @ManyToOne
    @JoinColumn(name = "dni", referencedColumnName = "dni")//nombre del id en la otra tabla
    private Cuentas numeroCuenta;

    @Column(name="tipomovimiento")
    private String tipoMovimiento;

    @Column(name="monto")
    private Double monto;

    @Column(name="fechamovimiento")
    private LocalDate fechaMovimiento;




}
