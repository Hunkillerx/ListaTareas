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
public class Tarea {

    public Tarea(String nombre, boolean hecho) {
        this.nombre = nombre;
        this.hecho = hecho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isHecho() {
        return hecho;
    }

    public void setHecho(boolean hecho) {
        this.hecho = hecho;
    }
    
    private String nombre;
    private boolean hecho;
    
}
