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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author alexP
 */
@Entity
@Table(name="empresas")
public class Empresa implements Serializable{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name="idEmpresa")
    private int idEmpresa;
    @Column(name="nombreEmpresa")
    private String nombre;
    @Column(name="paisSede")
    private String paisSede;
    @Column(name="ceo")
    private String ceo;
    @Column(name="fechaFundacion")
    private String fechaFundacion;
    //@Column(name="idSagaDeEmpresa")
    @OneToMany(mappedBy="idEmpresaAsignada", cascade=CascadeType.ALL)
    private List<Saga> sagaDeLaEmpresa;

    public Empresa() {
    }

    public Empresa(String nombre, String paisSede, String ceo, String fechaFundacion, int idEmpresa, ArrayList<Saga> sagaDeLaEmpresa) {
        this.nombre = nombre;
        this.paisSede = paisSede;
        this.ceo = ceo;
        this.fechaFundacion = fechaFundacion;
        this.idEmpresa = idEmpresa;
        this.sagaDeLaEmpresa = sagaDeLaEmpresa;
    }

    public Empresa(String nombre, String paisSede, String ceo, String fechaFundacion) {
        this.nombre = nombre;
        this.paisSede = paisSede;
        this.ceo = ceo;
        this.fechaFundacion = fechaFundacion;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisSede() {
        return paisSede;
    }

    public void setPaisSede(String paisSede) {
        this.paisSede = paisSede;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    
    public List<Saga> getSagaDeLaEmpresa() {
        return sagaDeLaEmpresa;
    }

    public void setSagaDeLaEmpresa(ArrayList<Saga> sagaDeLaEmpresa) {
        this.sagaDeLaEmpresa = sagaDeLaEmpresa;
    }
    
    
}
