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
@Table(name="sagas")
public class Saga implements Serializable{
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name="idSaga")
    private int idSaga;
    @Column (name="nombreSaga")
    private String nombreSaga;
    @Column(name="desarrolladora")
    private String desarrolladora;
    @Column(name="genero")
    private String genero;
    @Column(name="anioCreacion")
    private int anioCreacion;
    //@Column(name="idEmpresaAsignada")
    @ManyToOne
    @JoinColumn(name="idEmpresaAsignada")
    private Empresa idEmpresaAsignada;
    //@Column(name="videojuegosEnSaga")
    @OneToMany(mappedBy="idSagaVideojuego", cascade=CascadeType.ALL)
    private List<Videojuego> videojuegosEnSaga;

    public Saga() {
    }

    public Saga(String nombreSaga, String desarrolladora, String genero, int anioCreacion, int idSaga, Empresa idEmpresaAsignada, ArrayList<Videojuego> videojuegosEnSaga) {
        this.nombreSaga = nombreSaga;
        this.desarrolladora = desarrolladora;
        this.genero = genero;
        this.anioCreacion = anioCreacion;
        this.idSaga = idSaga;
        this.idEmpresaAsignada = idEmpresaAsignada;
        this.videojuegosEnSaga = videojuegosEnSaga;
    }

    public Saga(String nombreSaga, String desarrolladora, String genero, int anioCreacion, Empresa idEmpresaAsignada) {
        this.nombreSaga = nombreSaga;
        this.desarrolladora = desarrolladora;
        this.genero = genero;
        this.anioCreacion = anioCreacion;
        this.idEmpresaAsignada = idEmpresaAsignada;
    }

    public String getNombreSaga() {
        return nombreSaga;
    }

    public void setNombreSaga(String nombreSaga) {
        this.nombreSaga = nombreSaga;
    }

    public String getDesarrolladora() {
        return desarrolladora;
    }

    public void setDesarrolladora(String desarrolladora) {
        this.desarrolladora = desarrolladora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public int getIdSaga() {
        return idSaga;
    }

    public void setIdSaga(int idSaga) {
        this.idSaga = idSaga;
    }

    
    public Empresa getIdEmpresaAsignada() {
        return idEmpresaAsignada;
    }

    public void setIdEmpresaAsignada(Empresa idEmpresaAsignada) {
        this.idEmpresaAsignada = idEmpresaAsignada;
    }

    
    public List<Videojuego> getVideojuegosEnSaga() {
        return videojuegosEnSaga;
    }

    public void setVideojuegosEnSaga(ArrayList<Videojuego> videojuegosEnSaga) {
        this.videojuegosEnSaga = videojuegosEnSaga;
    }
}
