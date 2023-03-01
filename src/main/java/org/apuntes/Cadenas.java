package org.apuntes;

/**
 * @author alejandro
 */
public class Cadenas {
    public static void main(String[] args) {
        String cad1 = "Mariposa", cad2 = "Mosca", res, cad3 = " Martillo ", cad4 = "";
        char c;

        boolean b;
        int x, y;

        res = cad1.concat(cad2);                      //  Devuelve la unión de dos cadenas.
        b = cad1.contains("po");                      //  Devuelve booleano si otra cadena se encuentra en cad1.
        c = cad1.charAt(0);                           //  Devuelve el caracter de la posicion de la cadena indicada.
        b = cad1.startsWith("Ma");                    //  Devuelve booleano si una cadena dada empieza por un caracter o cadena indicado.
        b = cad1.startsWith("ri", 2);     //  Devuelve booleano si una cadena dada empieza por un caracter o cadena en posición indicada.
        res = cad1.substring(4);             //  Devuelve String de una cadena dada, a partir de la posición indicada, desde el inicio indicado hasta el final.
        res = cad1.substring(0,4);                    //  Devuelve String de una cadena dada, a partir de la posición indicada, desde el inciio y final indicado.
        res = cad1.toUpperCase();                     //  Devuelve String pasando a mayusculas.
        res = cad1.toLowerCase();                     //  Devuelve String pasando a minusculas.
        x = cad1.indexOf("a");                        //  Devuelve entero de la primera posicion donde se encuentra caracter o cadena indicado. -1 si no aparece.
        x = cad1.indexOf("a", 2);        //  Devuelve entero de la primera posicion donde se encuentra caracter o cadena indicado, a paritr de la posicion indicada. -1 si no aparece.
        x = cad1.lastIndexOf("a");                //  Devuelve entero de la ultima posicion donde se encuentra un caracter o cadena indicado.
        res = cad2.replace("s", "t"); //  Devuelve cadena reemplazando el caracter o cadena indicandos.
        x = cad1.length();                            //  Devuelve entero correspondiente al tamaño de la cadena.
        b = cad1.equals(cad2);                        //  Devuelve booleano comparando si dos cadenas son iguales incluidas mayusculas.
        b = cad1.equalsIgnoreCase(cad2);              //  Devuelve booleano comprando si dos cadenas son iguales ignorando mayusculas.
        x = cad1.compareTo(cad1);                     //  Devuelve un entero para indicar la ordenación. 0 si son iguales. Negativo si cad1 va antes de cad2. Positivo si cad1 va después cad2.
        x = cad1.compareToIgnoreCase(cad2);           //  Devuelve un entero para indicar la ordenación ignorando Mayusculas. 0 si son iguales. Negativo si cad1 va antes de cad2. Positivo si cad1 va después cad2.
        res = cad3.trim();                            //  Devuelve cadena quitando los espacios en blanco del principio y fiinal de la cadena.
        b = cad4.isEmpty();                           // Devuelve booleano indicando si la cadena está vacia.
        res = String.valueOf(10);                  //  Pasa variables o parametros de diferentes tipos a un String.

        //GetChars
        char[] c1 = new char[cad1.length()];
        cad1.getChars(0,cad1.length(), c1, 0);  // Devuelve void. Mete en un char[], los caracteres de la cadena desde el inicio indicado hasta el tamaño indicado.

        //ToCharArray
        char[] c2;
        c2 = cad1.toCharArray();                       // Devuelve un array de caracteres con el contenido de la cadena.

        for (char caracter: c2) {
            //System.out.println(caracter);
        }


        System.out.println(res);
    }
}
