package hn.unah.lenguajes1900.examen.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="cliente")
@Data
public class Cliente {
    
    @Id
    @Column(name="dni")
    private String dni;

    private String nombre;

    private String correo;

    private String telefono;
    

    @JsonIgnore
    @JsonManagedReference
    @OneToMany(mappedBy = "numerocuenta")//nombre del atributo en la otra tabla
    private List<Cuentas> cuentas;


     //no va en la denicion de la tabla
     @JsonIgnore// entidad debil, ve en 1 a 1
     @OneToOne(mappedBy = "dni")//nombre enla otra tabla del atributo
     private Direccion direccion;

}
