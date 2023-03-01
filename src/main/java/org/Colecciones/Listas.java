package org.Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Listas {

    public static void main(String[] args) {
        int x;
        boolean b;

        // ARRAYLIST    ->  Ideal para acceder a elementos
        ArrayList<Integer> numeros = new ArrayList<>();

        // Add
        numeros.add(10);    // Añade elemento al final. Devuelve booleano indicando el estado de la operación.
        numeros.add(15);
        numeros.add(7);
        numeros.add(15);
        mostrar(numeros);

        // Set
        numeros.set(0, 11);     // Modifica un elemento, indicando su posicion.

        // Size
        x = numeros.size();     // Devuelve el numero de elementos total.

        // Get
        x = numeros.get(1);     // Devuelve el elemento en el indice indicado.

        //IsEmpty
        b = numeros.isEmpty();  // Indica si el ArrayList esta vacio.

        //IndexOf
        x = numeros.indexOf(15);    // Devuelve la posición de la primera aparición del elemento por parametro. -1 si el número no existe.

        //LastIndexOf
        x = numeros.lastIndexOf(15);     // Devuelve la posición de la ultima aparición del elemento por parametro. -1 si el número no existe.

        //Sort
        Collections.sort(numeros);      // Ordena la arrayList.

        //Contains
        b = numeros.contains(15);       // Devuelve booleano indicando si el parametro pertenece al arraylist.

        // Remove ->    Borra la primera apariciendo cuando es un objeto.
        numeros.remove(2);  // Devuelve booleano indicando si se ha borrado el elemnto del indice indicado.
        mostrar(numeros);

        // Clear
        numeros.clear();        // Vacia una ArrayList al completo




        //LinkedList    -> Doblemente enlazada. Más rápida para insertar y para almacenar
        LinkedList<Integer> numeros2 = new LinkedList<Integer>();

        //Add
        numeros2.add(20);
        numeros2.add(13);
        numeros2.add(6);

        //AddFirst
        numeros2.addFirst(5); // Añade un elemento en la primera posicion de la lista.

        //AddLast
        numeros2.addLast(20);   // Alade un elemento al final de la lista.

        //clone
        Object numeros3 = numeros2.clone(); // Devuelve la copia de la lista.

        //Contains
        b = numeros2.contains(20);  // Comprueba si el elemento dado está presente en la lista.

        //Get
        x = numeros2.get(2);    // Devuelve el elemento del índice especificado de la lista.

        //GetFirst
        x = numeros2.getFirst();    // Recupera el primer elemento de la lista.

        //GetLast
        x = numeros2.getLast();     // Recupera el ultimo elemento de la lista.

        //IndexOf
        x = numeros2.indexOf(20);    // Devuelve el índice de la primera ocurrencia del elemento especificado.

        //LastIndexOf
        x = numeros2.lastIndexOf(20);    // Devuelve el índice de la última ocurrencia del elemento especificado.

        //Poll
        x = numeros2.poll();        // Devuelve y elimina el primer elemento de la lista.

        //PollFirst
        x = numeros2.pollFirst();   // igual que el método poll(). Elimina el primer elemento de la lista.

        //PollLast
        x = numeros2.pollLast(); // Devuelve y elimina el último elemento de la lista.

        //Remove
        numeros2.remove();      // Elimina el primer elemento de la lista.

        //Remove con parametro
        numeros2.remove(2);     // Elimina el elemento de la lista que está presente en el índice especificado.

        //Remove con parametro de Objeto

        //Size
        x = numeros2.size();       // Devuelve el número de elementos de la lista.

        //Clear
        numeros2.clear();   // Elimina todos los elementos de la lista.



    }

    public static void mostrar(ArrayList<Integer> numeros) {
        Iterator it = numeros.iterator();

        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }

        System.out.println();
    }
}
