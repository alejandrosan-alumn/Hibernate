/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ModeloDatos.Empresa;
import ModeloDatos.HibernateUtil;
import Vista.Ventana;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alexP
 */
public class TestUnitarios {

    public TestUnitarios() {
    }

    @Test
    public void TestAñadirEmpresaYEscribirlaEnElFichero(){

        Ventana ventanaTest = new Ventana();
        Empresa empresaTest = new Empresa("Test", "Test", "Test", "Test");
        int tamañoLibreDelFicheroPreEscritura = ventanaTest.getListaEmpresas().size();
        
        ventanaTest.getListaEmpresas().add(empresaTest);
        ventanaTest.getCrearFichero().AniadirOModificarEmpresa(ventanaTest.getListaEmpresas());
        
        int tamanoArrayPostEscritura = ventanaTest.getListaEmpresas().size();
        assertNotEquals(tamañoLibreDelFicheroPreEscritura, tamanoArrayPostEscritura);
        ventanaTest.getListaEmpresas().remove(ventanaTest.getListaEmpresas().size()-1);
        ventanaTest.getCrearFichero().EliminarEmpresa(empresaTest);
    }
    @Test
    public void TestLeerArchivoYLeerLaEmpresaTestIntroducida(){
        
        Ventana ventanaTest = new Ventana();
        Empresa empresaTestAniadir = new Empresa("Test2", "Test2", "Test2", "Test2");
        ventanaTest.getListaEmpresas().add(empresaTestAniadir);
        ventanaTest.getCrearFichero().AniadirOModificarEmpresa(ventanaTest.getListaEmpresas());
        
        Empresa empresaTest = new Empresa("Test2", "Test2", "Test2", "Test2");
        //ventanaTest.CargarArraysDeDatos();
        assertEquals(empresaTest.getNombre(), ventanaTest.getListaEmpresas().get(ventanaTest.getListaEmpresas().size()-1).getNombre());
        
        ventanaTest.getListaEmpresas().remove(ventanaTest.getListaEmpresas().size()-1);
        ventanaTest.getCrearFichero().EliminarEmpresa(empresaTestAniadir);
    }
    @Test
    public void TestModificarUnaEmpresaYQueSeModifiqueEnElFichero(){
        
        Ventana ventanaTest = new Ventana();
        Empresa empresaTestAniadir = new Empresa("Test3", "Test3", "Test3", "Test3");
        ventanaTest.getListaEmpresas().add(empresaTestAniadir);
        ventanaTest.getCrearFichero().AniadirOModificarEmpresa(ventanaTest.getListaEmpresas());
        //ventanaTest.CargarArraysDeDatos();
        
        ventanaTest.ModificarSeleccionadoDelArray("TestMod", "TestMod", "TestMod", "TestMod", ventanaTest.getListaEmpresas().size()-1);
        ventanaTest.getCrearFichero().AniadirOModificarEmpresa(ventanaTest.getListaEmpresas());
        //ventanaTest.CargarArraysDeDatos();
        assertEquals("TestMod", ventanaTest.getListaEmpresas().get(ventanaTest.getListaEmpresas().size()-1).getNombre());
        
        ventanaTest.getListaEmpresas().remove(ventanaTest.getListaEmpresas().size()-1);
        ventanaTest.getCrearFichero().EliminarEmpresa(empresaTestAniadir);
    }
    @Test
    public void TestEliminarEmpresaTestPorCompleto(){
        
        Ventana ventanaTest = new Ventana();
        int posicionBorrado = 0;
        Empresa empresaTest = new Empresa("Test4", "Test4", "Test4", "Test4");
        ventanaTest.getListaEmpresas().add(empresaTest);
        ventanaTest.getCrearFichero().AniadirOModificarEmpresa(ventanaTest.getListaEmpresas());
        //ventanaTest.CargarArraysDeDatos();
        
        if(ventanaTest.getListaEmpresas().size() > 0){
            posicionBorrado = ventanaTest.getListaEmpresas().size()-1;
        }

        ventanaTest.getListaEmpresas().remove(ventanaTest.getListaEmpresas().size()-1);
        ventanaTest.getCrearFichero().EliminarEmpresa(empresaTest);
        //ventanaTest.CargarArraysDeDatos();
        assertEquals(posicionBorrado, ventanaTest.getListaEmpresas().size());
    }
}