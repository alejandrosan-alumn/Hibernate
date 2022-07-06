/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDatos;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.query.Query;



/**
 *
 * @author alexP
 */
public class LeerBDHibernate {
    
    Query query;
    public LeerBDHibernate() {
    
        query = null;
    }
    
    public ArrayList<Empresa> LeerFicheroEmpresa(){
        
        Session sesion;
        ArrayList<Empresa>listaAux;
        sesion = HibernateUtil.getCurrentSession();
            query = sesion.createQuery("FROM Empresa");;
            listaAux = (ArrayList<Empresa>) query.list();
            //listaEmpresa = new ArrayList<Empresa>(listaAux);
            System.out.println("Entro " + listaAux.size());
            
            return listaAux;
    }
    
    public ArrayList<Saga> LeerFicheroSaga(){
        
        query = HibernateUtil.getCurrentSession().createQuery("FROM Saga");
        ArrayList<Saga>lista = (ArrayList<Saga>) query.list();
        return lista;
    }
    
    public ArrayList<Videojuego> LeerFicheroVideojuego(){
        
        query = HibernateUtil.getCurrentSession().createQuery("FROM Videojuego");
        ArrayList<Videojuego>lista = (ArrayList<Videojuego>) query.list();
        return lista;
    }
    
    public ArrayList<Personaje> LeerFicheroPersonaje(){
        
        query = HibernateUtil.getCurrentSession().createQuery("FROM Personaje");
        ArrayList<Personaje>lista = (ArrayList<Personaje>) query.list();
        return lista;
    }
}