/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDatos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author alexP
 */
@Entity
@Table(name="personajes")
public class Personaje implements Serializable{
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name="idPersonaje")
    private int idProtagonista;
    @Column(name="nombreProtagonista")
    private String nombreProtagonista;
    @Column(name="interpreteModelo")
    private String interpreteModelo;
    @Column(name="interpreteVoz")
    private String interpreteVoz;
    @Column(name="anioAparicion")
    private int anioAparicion;
    //@Column(name="idVideojuegoPertenece")
    @ManyToOne
    @JoinColumn(name="idVideojuegoPertenece")
    private Videojuego idVideojuegoPertenece;

    public Personaje() {
    }

    public Personaje(String nombreProtagonista, String interpreteModelo, String interpreteVoz, int anioAparicion, int idProtagonista, Videojuego idVideojuegoPertenece) {
        this.nombreProtagonista = nombreProtagonista;
        this.interpreteModelo = interpreteModelo;
        this.interpreteVoz = interpreteVoz;
        this.anioAparicion = anioAparicion;
        this.idProtagonista = idProtagonista;
        this.idVideojuegoPertenece = idVideojuegoPertenece;
    }

    public Personaje(String nombreProtagonista, String interpreteModelo, String interpreteVoz, int anioAparicion, Videojuego idVideojuegoPertenece) {
        this.nombreProtagonista = nombreProtagonista;
        this.interpreteModelo = interpreteModelo;
        this.interpreteVoz = interpreteVoz;
        this.anioAparicion = anioAparicion;
        this.idVideojuegoPertenece = idVideojuegoPertenece;
    }

    public String getNombreProtagonista() {
        return nombreProtagonista;
    }

    public void setNombreProtagonista(String nombreProtagonista) {
        this.nombreProtagonista = nombreProtagonista;
    }

    public String getInterpreteModelo() {
        return interpreteModelo;
    }

    public void setInterpreteModelo(String interpreteModelo) {
        this.interpreteModelo = interpreteModelo;
    }

    public String getInterpreteVoz() {
        return interpreteVoz;
    }

    public void setInterpreteVoz(String interpreteVoz) {
        this.interpreteVoz = interpreteVoz;
    }

    public int getAnioAparicion() {
        return anioAparicion;
    }

    public void setAnioAparicion(int anioAparicion) {
        this.anioAparicion = anioAparicion;
    }

    public int getIdProtagonista() {
        return idProtagonista;
    }

    public void setIdProtagonista(int idProtagonista) {
        this.idProtagonista = idProtagonista;
    }

    
    public Videojuego getIdVideojuegoPertenece() {
        return idVideojuegoPertenece;
    }

    public void setIdVideojuegoPertenece(Videojuego idVideojuegoPertenece) {
        this.idVideojuegoPertenece = idVideojuegoPertenece;
    }
}
