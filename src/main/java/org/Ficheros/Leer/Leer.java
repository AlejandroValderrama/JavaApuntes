package org.Ficheros.Leer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leer {

    public static void main(String[] args) {

        //La clase BufferedReader o BufferedWriter utilizan un buffer intermedio
        //lo cual hace que la lectura/escritura no sea carácter a carácter
        //Esta clase tiene método readLine que me permite leer frases de una sola vez
        String ruta="/home/anag/Escritorio/prueba.dat";
        FileReader mifichero= null;
        BufferedReader lector=null;
        String linea;
        try{

            mifichero = new FileReader(ruta);
            lector = new BufferedReader(mifichero);
            linea = lector.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = lector.readLine();
            }

        }catch (IOException e){
            System.out.println("Error");

        }finally{
            try {
                lector.close();
            } catch (IOException ex) {
                System.out.println("Error E/S");
            }
        }

    }
}
