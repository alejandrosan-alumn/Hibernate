/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDatos;

import java.util.ArrayList;
import org.hibernate.Session;

/**
 *
 * @author alexP
 */
public class EscribirBDHibernate{
    
    private Session sesion;
    public EscribirBDHibernate() {
        
        sesion = null;
    }
    
    public void AniadirOModificarEmpresa(ArrayList<Empresa>objeto){
        
        this.sesion = HibernateUtil.getCurrentSession();
        sesion.beginTransaction();
        for(Empresa empresa : objeto){
            sesion.saveOrUpdate(empresa);
        }
        sesion.getTransaction().commit();
        sesion.close();
    }
    
    public void EliminarEmpresa(Empresa objeto){
        
        this.sesion = HibernateUtil.getCurrentSession();
        sesion.beginTransaction();
        sesion.delete(objeto);
        sesion.getTransaction().commit();
        sesion.close();
    }
    
    /*public void AniadirEmpresa(Empresa objetoAnadido){
        
        this.sesion = HibernateUtil.getCurrentSession();
        sesion.beginTransaction();
        sesion.save(objetoAnadido);
        sesion.getTransaction().commit();
        sesion.close();
    }*/
    
    public void AniadirOModificarSaga (ArrayList<Saga>objeto){
        
        this.sesion = HibernateUtil.getCurrentSession();
        sesion.beginTransaction();
        for(Saga lista : objeto){
            sesion.saveOrUpdate(lista);
        }
        sesion.getTransaction().commit();
        sesion.close();
    }
    
    public void EliminarSaga(Saga objeto){
        
        this.sesion = HibernateUtil.getCurrentSession();
        sesion.beginTransaction();
        sesion.delete(objeto);
        sesion.getTransaction().commit();
        sesion.close();
    }
    
    public void AniadirOModificarVideojuego (ArrayList<Videojuego>objeto){
        
        this.sesion = HibernateUtil.getCurrentSession();
        sesion.beginTransaction();
        for(Videojuego lista : objeto){
            sesion.saveOrUpdate(lista);
        }
        sesion.getTransaction().commit();
        sesion.close();
    }
    
    public void EliminarVideojuego(Videojuego objeto){
        
        this.sesion = HibernateUtil.getCurrentSession();
        sesion.beginTransaction();
        sesion.delete(objeto);
        sesion.getTransaction().commit();
        sesion.close();
    }
    
    public void AniadirOModificarPersonaje (ArrayList<Personaje>objeto){
        
        this.sesion = HibernateUtil.getCurrentSession();
        sesion.beginTransaction();
        for(Personaje lista : objeto){
            sesion.saveOrUpdate(lista);
        }
        sesion.getTransaction().commit();
        sesion.close();
    }
    
    public void EliminarPersonaje(Personaje objeto){
        
        this.sesion = HibernateUtil.getCurrentSession();
        sesion.beginTransaction();
        sesion.delete(objeto);
        sesion.getTransaction().commit();
        sesion.close();
    }
}
