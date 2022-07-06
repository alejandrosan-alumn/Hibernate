/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDatos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author alexP
 */
@Entity
@Table(name="videojuegos")
public class Videojuego implements Serializable{
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name="idVideojuego")
    private int idVideojuego;
    @Column(name="nombreVideojuego")
    private String nombreVideojuego;
    @Column(name="motorVideojuego")
    private String motorVideojuego;
    @Column(name="fechaLanzamiento")
    private String fechaLanzamiento;
    @Column(name="pegi")
    private int pegi;
    //@Column(name="idSagaVideojuego")
    @ManyToOne
    @JoinColumn(name="idSagaVideojuego")
    private Saga idSagaVideojuego;
    //@Column(name="personajesEnVideojuego")
    @OneToMany(mappedBy="idVideojuegoPertenece", cascade=CascadeType.ALL)
    private List<Personaje> personajesEnVideojuegos;

    public Videojuego() {
    }

    public Videojuego(String nombreVideojuego, String motorVideojuego, String fechaLanzamiento, int pegi, int idVideojuego, Saga idSagaVideojuego, ArrayList<Personaje> personajesEnVideojuegos) {
        this.nombreVideojuego = nombreVideojuego;
        this.motorVideojuego = motorVideojuego;
        this.fechaLanzamiento = fechaLanzamiento;
        this.pegi = pegi;
        this.idVideojuego = idVideojuego;
        this.idSagaVideojuego = idSagaVideojuego;
        this.personajesEnVideojuegos = personajesEnVideojuegos;
    }

    public Videojuego(String nombreVideojuego, String motorVideojuego, String fechaLanzamiento, int pegi, Saga idSagaVideojuego) {
        this.nombreVideojuego = nombreVideojuego;
        this.motorVideojuego = motorVideojuego;
        this.fechaLanzamiento = fechaLanzamiento;
        this.pegi = pegi;
        this.idSagaVideojuego = idSagaVideojuego;
    }

    public String getNombreVideojuego() {
        return nombreVideojuego;
    }

    public void setNombreVideojuego(String nombreVideojuego) {
        this.nombreVideojuego = nombreVideojuego;
    }

    public String getMotorVideojuego() {
        return motorVideojuego;
    }

    public void setMotorVideojuego(String motorVideojuego) {
        this.motorVideojuego = motorVideojuego;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    public int getIdVideojuego() {
        return idVideojuego;
    }

    public void setIdVideojuego(int idVideojuego) {
        this.idVideojuego = idVideojuego;
    }

    
    public Saga getIdSagaVideojuego() {
        return idSagaVideojuego;
    }

    public void setIdSagaVideojuego(Saga idSagaVideojuego) {
        this.idSagaVideojuego = idSagaVideojuego;
    }

    
    public List<Personaje> getPersonajesEnVideojuegos() {
        return personajesEnVideojuegos;
    }

    public void setPersonajesEnVideojuegos(ArrayList<Personaje> personajesEnVideojuegos) {
        this.personajesEnVideojuegos = personajesEnVideojuegos;
    }

    
}
