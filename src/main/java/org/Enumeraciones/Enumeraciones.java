package org.Enumeraciones;

/**
 * @author alejandro
 */
public class Enumeraciones {
    enum Dia {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO}

    public static void main(String[] args) {

        Dia d1;  // Declaracion de variable tipo Dia
        d1 = Dia.LUNES;  // asignacion de valor

        Dia d2 = Dia.MARTES;

        /*
            - Los enum son final (Constantes)
            - Son static
            - No se crean objetos con new, solo se declaran.
         */

        /*name()
            public final String name()
            Devuelve un String con el nombre de la constante que contiene tal
            y como aparece en la declaración.*/
        System.out.println(d1.name());


        /*equals()
            public final boolean equals(Object other)
            Devuelve true si el valor de la variable enum es igual al objeto
            que recibe.*/
        if(d1.name().equals("LUNES"))
            System.out.println("Cadena LUNES");


        /*ordinal()
            public final int ordinal()
            Devuelve un entero con la posición de la constante según está
            declarada. A la primera constante le corresponde la posición cero.*/
        System.out.println(d1.ordinal());


        /*compareTo()
            public final int compareTo(Enum other)
            Compara el enum con el que recibe según el orden en el que están
            declaradas las constantes. Solo se pueden comparar enumeraciones
            del mismo tipo.*/
        if(d2.compareTo(d1) > 0)
            System.out.println(d2 + " > " + d1);


        /*valueOf()
            public static enumConstant valueOf(String s)
            Devuelve la constante que coincide exactamente con el String que
            recibe como parámetro.*/
        String cadena = "LUNES";
        if(Dia.valueOf(cadena) == Dia.LUNES)
            System.out.println("Cadena LUNES");


        /*values()
            public static enumConstant [] values()
            Devuelve un array que contiene todas las constantes de la
            enumeración en el orden en que se han declarado.*/
        for(Dia x: Dia.values())
            System.out.println(x);

    }
}
