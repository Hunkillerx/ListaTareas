/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Interfaz.Listable;
import java.util.Iterator;

/**
 *
 * @author Alumno
 */
public class Lista implements Listable {
    
    private Nodo inicio;
    
    public Lista() {
    }
    
    @Override
    public boolean esVacia() {
        return inicio == null;
    }
    
    @Override
    public void insertar(Object ob) {
        inicio = new Nodo(ob, inicio);
    }
    
    @Override
    public void elminar(Object ob) {
        Nodo pos = inicio;
        Nodo anterior = null;
        while (pos != null && !pos.getElemento().equals(ob)) {
            anterior = pos;
            pos = pos.getSiguiente();
        }
        if (pos != null) {
            if (pos == inicio) {
                inicio = inicio.getSiguiente();
            } else {
                anterior.setSiguiente(pos.getSiguiente());
            }
        }
    }
    
    @Override
    public void vaciar() {
        inicio = null;
    }
    
    private Nodo buscar(Object ob) {
        Nodo pos = inicio;
        while (pos != null && !pos.getElemento().equals(ob)) {
            pos = pos.getSiguiente();
        }
        return pos;
    }
    
    @Override
    public boolean contiene(Object ob) {
        return buscar(ob) != null;
    }
    
    @Override
    public Object primerElmento() {
        return inicio.getElemento();
    }
    
    @Override
    public void sustituir(Object Sustituyente, Object aSustituir) {
        Nodo n = buscar(aSustituir);
        if (n != null) {
            n.setElemento(Sustituyente);
        } else {
            throw new java.util.NoSuchElementException("El elemento" + aSustituir + "no esta en la lista");
        }
        
    }
    
  public java.util.Iterator iterador() { 
    return new MiIterador(); 
  }
	
  /*
   * Clase interna que implementa el iterador
   */
  private class MiIterador implements java.util.Iterator {
    private Nodo posicion = inicio;

    public boolean hasNext() { return posicion != null;}

    public Object next() throws java.util.NoSuchElementException {
      if (hasNext()) {
	Object o = posicion.getElemento();
	posicion = posicion.getSiguiente();
	return o;
      }
      throw new java.util.NoSuchElementException();
    }

    public void remove() {
      throw new IllegalStateException();
    }
  }
}
