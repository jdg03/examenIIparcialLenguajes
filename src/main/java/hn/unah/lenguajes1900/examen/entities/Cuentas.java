package hn.unah.lenguajes1900.examen.entities;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="cuentas")
@Data
public class Cuentas {
    
    @Id
    @Column(name="numerocuenta")
    private String numerocuenta;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dni", referencedColumnName = "dni")//nombre del id en la otra tabla
    private Cliente dni ;// este va en el mapedBY

    private Double saldo;

    @Column(name="fechaapertura")
    private LocalDate fechaapertura;

    private boolean estado;

    private boolean sobregiro;


    @JsonIgnore
    @JsonManagedReference//evita recursion infinita, va en la entidad debil 1 a m
    @OneToMany(mappedBy = "idmovimiento")//nombre del atributo en la otra tabla
    private List<Movimientos> movimientos;

    
}
