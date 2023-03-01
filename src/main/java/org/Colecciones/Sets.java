package org.Colecciones;

import java.util.*;

public class Sets {
    public static void main(String[] args) {

        //HashSet   ->  No duplicados. No ordenación. Es un conjunto.
        HashSet<String> c1 = new HashSet<>();
        c1.add("Element3");
        c1.add("Element4");
        c1.add("Element1");
        c1.add("Element2");

        mostrar(c1);


        //LinkedHashSet ->  No duplicados. Orden de inserccion.
        LinkedHashSet c2 = new LinkedHashSet<>();
        c2.add("Element2");
        c2.add("Element3");
        c2.add("Element4");
        c2.add("Element1");

        mostrar(c2);

        //TreeSet   ->  No duplicados. Tienen criterio de Ordenación (Comparable - Comparator).
        TreeSet c3 = new TreeSet<>();
        c3.add("Element2");
        c3.add("Element3");
        c3.add("Element4");
        c3.add("Element1");

        mostrar(c3);
    }

    public static void mostrar(Collection coleccion) {
        Iterator it = coleccion.iterator();

        while(it.hasNext()){
            String elemento = (String)it.next();
            System.out.println(elemento+" ");
        }
        System.out.println();
    }
}
