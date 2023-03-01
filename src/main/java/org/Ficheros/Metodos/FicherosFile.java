package org.Ficheros.Metodos;

import java.io.File;

public class FicherosFile {

    /* La clase File se usa para obtener información sobre archivos y directorios.
    Además la clase File permite crear y eliminar archivos y directorios.
    Un objeto de la case Java File representa un archivo o directorio.
     */
    public static void main(String[] args) {

        //Primer constructor File(String directorio)
//           File miFich1 = new File("/home/ana/Escritorio/prueba1.txt");
////           // En Windows: "c:\\java\\ficheros\\prueba1.txt"
////
////           //Segundo constructor File(File directorio, String nombreFich)
//           File ruta = new File("/home/ana/Escritorio");
//           File miFich2 = new File(ruta, "prueba2.txt");
//
//           Tercer constructor File(String directorio, String nombreFich)
//           File miFich3 = new File ("/home/ana/Escritorio", "prueba3.txt");
//
        File fich = new File("pepe.sql");
        System.out.println(fich.canRead());    //Booleano puede leerse?
        System.out.println(fich.canWrite());   //Booleano puede escribirse?
        System.out.println( fich.exists());    //Booleano existe?
        System.out.println(fich.isFile());     //Booleano es un fichero?
        System.out.println(fich.isDirectory());  //Booleano es un directorio?
        System.out.println("Fecha en milisegundos: " + fich.lastModified()); //0 si no existe
        System.out.println(fich.getName());  //Devuelve nombre
        System.out.println(fich.getPath());   //Devuelve ruta

        //SOLO PARA FICHEROS

        System.out.println("Tamaño: "+fich.length());
        // si dividimos la cantidad devuelta entre 1024 obtenemos el tamaño del archivo en KB.

        //renombrar, a partir de ese momento usaremos el objeto nuevoNombre
        File nuevoNombre = new File("pepe.sql");
        fich.renameTo(nuevoNombre);

        //borra fichero o directorio (sólo si está vacío
        System.out.println(fich.delete());

        //SOLO PARA DIRECTORIOS
        System.out.println("_____________________________");
        File directorio = new File(".");  //directorio actual
        String[] lista = directorio.list();
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }


        File nuevaCarpeta = new File("nueva");
        System.out.println(nuevaCarpeta.mkdir());
        //Se accede al nuevo directorio con el objeto nuevaCarpeta

    }
}
