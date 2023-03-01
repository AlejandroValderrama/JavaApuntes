package org.POO;

import java.util.Comparator;

public class OrdenPersonasApellidos implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        if(p1.getApellidos().compareTo(p2.getApellidos()) == 0)
            return p1.getNombre().compareTo(p2.getNombre());
        else
            return p1.getApellidos().compareTo(p2.getApellidos());
    }
}
