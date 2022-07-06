/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDatos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.query.Query;



/**
 *
 * @author alexP
 */
public class LeerSQLite {

    Conexion conectarse;
    Statement declaracion;
    String sentencia;
    
    public LeerSQLite() {
    
    }
    
    public void LeerFicheroEmpresa(ArrayList<Empresa>listaEmpresa){
        
        Query query = HibernateUtil.getCurrentSession().createQuery("FROM Empresa");
        listaEmpresa = (ArrayList<Empresa>) query.list();
    }
    
    public void LeerFicheroSaga(ArrayList<Saga>lista){
        
        Query query = HibernateUtil.getCurrentSession().createQuery("FROM Saga");
        lista = (ArrayList<Saga>) query.list();
    }
    
    public void LeerFicheroVideojuego(ArrayList<Videojuego>lista){
        
        Query query = HibernateUtil.getCurrentSession().createQuery("FROM Videojuego");
        lista = (ArrayList<Videojuego>) query.list();
    }
    
    public void LeerFicheroPersonaje(ArrayList<Personaje>lista){
        
        Query query = HibernateUtil.getCurrentSession().createQuery("FROM Personaje");
        lista = (ArrayList<Personaje>) query.list();
    }
}