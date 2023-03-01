package org.Ficheros.Metodos;

import java.io.File;
public class Main {

    public static void main(String[] args) {

        File directorio = new File("src/ficherosfile");  //directorio actual
        String[] contenidoD;
        //Listo el contenido de la carpeta pero sólo de aquellos elementos que
        //cumplen la condición del filtro creado.
        contenidoD =directorio.list(new MiFiltro(".java"));
        for(int i=0; i<contenidoD.length; i++){
            System.out.println(contenidoD[i]);
        }

    }

}
