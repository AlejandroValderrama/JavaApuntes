package org.FicherosObjetos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
public class MiObjectOutputStream extends ObjectOutputStream {

    public MiObjectOutputStream(OutputStream out) throws IOException
    {
        super(out);
    }



    //SOBREESCRIBO EL MÉTODO QUE GENERA EL PROBLEMA PARA QUE NO HAGA NADA
    protected void writeStreamHeader() throws IOException
    {
    }

}
