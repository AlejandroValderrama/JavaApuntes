package org.POO;

public class Alumno extends Persona {
    private int nie;
    private double nota;

    public Alumno(String dni, int edad, String apellidos, String nombre, int nie, double nota) {
        super(dni, edad, apellidos, nombre);
        this.nie = nie;
        this.nota = nota;
    }

    public Alumno(String dni, int nie) {
        super(dni);
        this.nie = nie;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nie=" + nie +
                ", nota=" + nota +
                "} " + super.toString();
    }
}
