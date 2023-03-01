package org.Colecciones;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {

        /*
            Para la ordenación debemos usar los mismo elementos empleados en
            el equals y hascode para el compareto. Para otro criterio usar
            Comparator.

            Para que funcione la no duplicidad hay que sobreescribi el
            metodo equals y hascode usando los mismo elementos.
         */

        //HashMap   ->  No duplicados (clave). No ordenación.
        HashMap<String, String> agenda = new HashMap<>();
        agenda.put("Doctor", "(+52)-4000-5000");
        agenda.put("Casa", "(888)-4000-3400");
        agenda.put("Hermano", "(575)-2042-3233");
        agenda.put("Tio", "(421)-1010-0020");
        agenda.put("Suegros", "(334)-6105-4334");
        agenda.put("Oficina", "(304)-5205-8454");
        agenda.put("Abogado", "(756)-1205-3454");
        agenda.put("Papa", "(55)-9555-3270");
        agenda.put("Tienda", "(874)-2400-8600");
        agenda.put("Oficina", "(55)-2042-3270");
        agenda.put("Oficina", "(1)-5205-3233");

        /*
        System.out.println("____________________\n");
        System.out.println(agenda);
        System.out.println("____________________\n");

        System.out.println(agenda.keySet());
        System.out.println(agenda.values());
        System.out.println("Tamaño de la colección: " + agenda.size());
        System.out.println("____________________\n");

        mostrarMapa(agenda);
        System.out.println("____________________\n");
        mostrarMapa2(agenda);
        */

        //LinkedHashMap ->  No duplicados. Orden por insercción (clave).
        LinkedHashMap<String, String> agenda2 = new LinkedHashMap<>();
        agenda2.put("Doctor", "(+52)-4000-5000");
        agenda2.put("Casa", "(888)-4000-3400");
        agenda2.put("Hermano", "(575)-2042-3233");
        agenda2.put("Tio", "(421)-1010-0020");
        agenda2.put("Suegros", "(334)-6105-4334");
        agenda2.put("Doctor", "(+52)-4000-5000"); // Este es duplicado y no lo registra.

        mostrarMapa(agenda2);


        //TreeMap   -> No duplicados (clave). Claves ordenadas a criterio.
        TreeMap<String, String> agenda3 = new TreeMap<>();
        agenda3.put("Doctor", "(+52)-4000-5000");
        agenda3.put("Casa", "(888)-4000-3400");
        agenda3.put("Hermano", "(575)-2042-3233");
        agenda3.put("Tio", "(421)-1010-0020");
        agenda3.put("Suegros", "(334)-6105-4334");
        agenda3.put("Doctor", "(+52)-4000-5000"); // Este es duplicado y no lo registra.


    }

    public static void mostrarMapa(LinkedHashMap agenda) {
        Iterator it = agenda.keySet().iterator();
        String clave, valor;

        System.out.println("Agenda con " + agenda.size() + " teléfonos");

        while(it.hasNext()){
            clave = (String) it.next();
            valor = (String) agenda.get(clave);
            System.out.println(clave + " : " + valor);
        }
    }

    public static void mostrarMapa2(HashMap agenda) {

        System.out.println("Agenda con " + agenda.size() + " teléfonos");

        Iterator <Entry<String, String>> it = agenda.entrySet().iterator();

        while(it.hasNext()){
            Entry<String, String> e = (Entry<String, String>) it.next();
            System.out.println(e.getKey() + "---> " + e.getValue());
        }
    }
}
