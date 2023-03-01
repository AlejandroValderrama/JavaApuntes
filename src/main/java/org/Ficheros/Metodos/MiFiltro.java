package org.Ficheros.Metodos;

import java.io.File;
import java.io.FilenameFilter;

//Para crear en el método accept el criterio que deben cumplir los elementos del
//directorio que voy a listar con list
public class MiFiltro implements FilenameFilter {

    private String extension;

    public MiFiltro(String extension){
        this.extension=extension;
    }

    @Override
    public boolean accept(File file, String nombre) {
        return nombre.endsWith(extension);
        //En este caso busco coincidencias con los caracteres que componen el final
        //del nombre para localizar sólo fich de una determinada extensión
    }
}
