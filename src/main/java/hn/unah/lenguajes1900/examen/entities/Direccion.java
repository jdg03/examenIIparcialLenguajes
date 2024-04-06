package hn.unah.lenguajes1900.examen.entities;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="direccion")
@Data
public class Direccion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="iddireccion")
    private int iddireccion;

     //si va en la denicion de la tabla
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="dni", referencedColumnName = "dni") //este es el name del id en la otra tabla
    private Cliente dni;

    private String estado;

    private String ciudad;

    private String calle;

   
}


