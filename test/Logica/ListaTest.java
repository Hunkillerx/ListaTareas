/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Iterator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alumno
 */
public class ListaTest {
    
    public ListaTest() {
    }

    /**
     * Test of esVacia method, of class Lista.
     */
    @Test
    public void testEsVacia() {
        System.out.println("esVacia");
        Lista instance = new Lista();
        boolean expResult = true;
        boolean result = instance.esVacia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of insertar method, of class Lista.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        Object ob = null;
        Lista instance = new Lista();
        instance.insertar(ob);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of elminar method, of class Lista.
     */
    @Test
    public void testElminar() {
        System.out.println("elminar");
        Object ob = new Object();
        Lista instance = new Lista();
        instance.insertar(ob);
        instance.elminar(ob);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of vaciar method, of class Lista.
     */
    @Test
    public void testVaciar() {
        System.out.println("vaciar");
        Lista instance = new Lista();
        instance.vaciar();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of contiene method, of class Lista.
     */
    @Test
    public void testContiene() {
        System.out.println("contiene");
        Object ob = new Object();
        Lista instance = new Lista();
        boolean expResult = false;
        boolean result = instance.contiene(ob);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of primerElmento method, of class Lista.
     */
    @Test
    public void testPrimerElmento() {
        System.out.println("primerElmento");
        Lista instance = new Lista();
        Object expResult = new Object();
        instance.insertar(expResult);
        Object result = instance.primerElmento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of sustituir method, of class Lista.
     */
    @Test
    public void testSustituir() {
        System.out.println("sustituir");
        Object ob1 = new Object();
        Object ob2 = new Object();
        Lista instance = new Lista();
        instance.insertar(ob2);
        instance.sustituir(ob1, ob2);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of iterador method, of class Lista.
     */
    @Test
    public void testIterador() {
        System.out.println("iterador");
        Lista instance = new Lista();
        Iterator expResult = null;
        Iterator result = instance.iterador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
