/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Alumno
 */
public class Nodo {

    private Object elemento;
    private Nodo siguiente;

    public Nodo(Object elemento, Nodo siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    public Nodo(Object elemento) {
        this(elemento,null);
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
