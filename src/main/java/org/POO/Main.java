package org.POO;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author alejandro
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();

        Persona p1 = new Persona("1234", 30, "Ap1", "Nom1");
        Persona p2 = new Persona("5678", 43, "Ap2", "Nom2");
        Persona p3 = new Persona("9012", 22, "Ap3", "Nom3");
        Persona p4 = new Persona("3456", 27, "Ap4", "Nom4");

        Persona a1 = new Alumno("444", 20, "Ap6", "Nom5",444,2);
        Persona a2 = new Alumno("333", 25, "Ap5","Nom5",333,8);
        Persona a3 = new Alumno("222", 19, "Ap5","Nom6",222,5);

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);

        personas.add(a1);
        personas.add(a2);
        personas.add(a3);

        for(Persona p: personas){
            System.out.println(p);
        }
        System.out.println("_______________________");

        //Ordena en función del método "compareTo" que se encuentra en la clase
        // Persona implementado por la interface Complarable
        Collections.sort(personas);

        for(Persona p: personas){
            System.out.println(p);
        }
        System.out.println("_______________________");

        //Ordena por Dni del método "compare" que se encuentra en la clase
        // OrdenPersonasDni implementado por la interface Comparator
        Collections.sort(personas, new OrdenPersonasDni());

        for(Persona p: personas){
            System.out.println(p);
        }
        System.out.println("_______________________");


        //Ordena por Apellidos y nombre del método "compare" que se encuentra en la clase
        // OrdenPersonasApellidos implementado por la interface Comparator
        Collections.sort(personas, new OrdenPersonasApellidos());

        for(Persona p: personas){
            System.out.println(p);
        }

        p1.cantar();
    }
}
