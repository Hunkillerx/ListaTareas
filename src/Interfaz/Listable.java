/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author JoseDiaz
 */
public interface Listable {
    
    /**Metodo que indica si una lista es vacia
     * 
     * @return returna true si el conjunto es vacio y false si no
     */
    public boolean esVacia();
    
    /**Metodo que inserta un objecto a la lista
     * 
     * @param ob objeto a entrar
     */
    public void insertar(Object ob);
    
    /**Metodo que elimina un objeto de la lista
     * 
     * @param ob objeto a eliminar
     */
    public void elminar(Object ob);
    
    /**Metodo que vacia la lista
     * 
     */
    public void vaciar();
    
    /**Metodo que determina si una lista contiene a un elemento
     * 
     * @param ob metodo a analizar
     * @return true si lo contiene o false si no
     */
    public boolean contiene(Object ob);
    
    /**
     * 
     * @return 
     */
    public Object primerElmento();
    /**
     * 
     * @param ob1
     * @param ob2 
     */
    public void sustituir(Object ob1, Object ob2);
    /**
     * 
     * @return 
     */
    public java.util.Iterator iterador();

}
