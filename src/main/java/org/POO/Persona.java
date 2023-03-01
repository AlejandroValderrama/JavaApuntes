package org.POO;

public class Persona implements IPuedeCantar, Comparable<Persona> {
    private String dni;
    private int edad;
    private String apellidos;
    private String nombre;


    public Persona(String dni, int edad, String apellidos, String nombre) {
        this.dni = dni;
        this.edad = edad;
        this.apellidos = apellidos;
        this.nombre = nombre;
    }

    public Persona(String dni) {
        this.dni = dni;
    }

    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        Persona p = (Persona) o;
        return this.dni.equalsIgnoreCase(p.getDni());
    }

    @Override
    public int hashCode() {
        return this.dni.hashCode();
    }


    // Ordenar por Edad
    @Override
    public int compareTo(Persona p2) {
        return (int) this.edad - (int) p2.getEdad();
    }


    @Override
    public void cantar() {
        System.out.println("LaLaLaLaaaa");
    }


    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", edad=" + edad +
                ", apellidos='" + apellidos + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
