package org.Ficheros.Escribir;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Escribir {
    public static void main(String[] args) {
        String cadena = "Esto es lo que quiero escribir";
        FileWriter fichero = null;
        PrintWriter fich = null;

        try{

            fichero = new FileWriter("prueba.txt",true);
            fich = new PrintWriter(fichero);
            fich.write(cadena);
            fich.println();
            fich.println("sigo escribiendo");
            fich.printf("hola %s\n", "ana");


        }catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }finally{
            fich.flush();
            fich.close();
        }
    }
}
