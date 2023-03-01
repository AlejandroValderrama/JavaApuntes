package org.apuntes;

import java.util.Arrays;

public class ArrayMatrices {
    public static void main(String[] args) {

        //ARRAY
        int[] array;
        int[] array1 = {0, 2, 1, 4, 3, 5};
        int[] array2 = new int[10];    // Hay que indicar siempre el tamaño.

        array2[0] = 5;

        // COPYOF   ->  Copia un array y lo devuelve en un nuevo array, indicando el nuevo tamaño.
        array = Arrays.copyOf(array1, 3);

        // COPYOFRANGE  ->  Copia un array y lo devuelve en un nuevo array, indicando la posicion de origen y final.
        array = Arrays.copyOfRange(array1, 3, array1.length);

        // EQUALS   ->  Booleano que indica si dos arrays son iguales.
        boolean b = Arrays.equals(array, array1);
        System.out.println(b);

        // FILL ->  Rellena un array al completo con el mismo valor que le indiquemos como parámetro.
        Arrays.fill(array, 5);

        // SORT -> Ordena el array.
        Arrays.sort(array1);

        // TOSTRING -> Muestra el contenido del array pasado como parámetros.
        System.out.println(Arrays.toString(array1));




        // MATRICES
        int[][] matriz0 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matriz = new int[5][5];     // Hay que indicar siempre el tamaño.

        // Recorrer, añadir y mostrar
        for(int i=0; i< matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j] = (int)(Math.random()*10);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }

        // ORDENACION Y BUSQUEDA
        String[] cadena = {"a","s","d","f","g"};

        burbuja(cadena); // Ordenacion
        mostrar(cadena);
        String clave = "f";

        int i = busquedaBinaria(cadena, clave); // Busqueda
        System.out.printf("Posición de %s: %d",clave, i);
    }



    // ORDENACION
    public static  void burbuja (String[] cadenas) {
        String aux;

        for (int i=0; i<cadenas.length; i++) {
            for (int j=0; j<i; j++) {
                if(cadenas[j].compareTo(cadenas[i]) >0) {
                    aux = cadenas[j];
                    cadenas[j] = cadenas[i];
                    cadenas[i] = aux;
                }
            }
        }
    }



    //BUSQUEDA
    public static int busquedaBinaria(String[] cadenas, String clave) {
        int inferior = 0, superior = cadenas.length-1;
        int medio = (inferior + superior + 1) / 2;
        int encontrado = -1;

        do {
            if (clave.equals(cadenas[medio]))
                encontrado = medio;
            else if (clave.compareTo(cadenas[medio]) < 0)
                superior = medio -1;
            else
                inferior = medio + 1;
            medio = (inferior + superior) / 2;
        } while (inferior <= superior && encontrado == -1);

        return encontrado;
    }



    public static void mostrar(String[] cadenas){

        for(int i=0; i<cadenas.length; i++){
            System.out.print(cadenas[i]+" ");
        }
        System.out.println("");
    }

    public static void mostrarInt(int[] cadenas){

        for(int i=0; i<cadenas.length; i++){
            System.out.print(cadenas[i]+" ");
        }
        System.out.println("");
    }
}
