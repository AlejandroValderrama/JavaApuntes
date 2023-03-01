package org.FicherosObjetos;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private int edad;

    /**
     * @return the nombre
     */
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString(){
        return "Nombre: " + this.nombre + " Edad: " + this.edad;
    }
}
