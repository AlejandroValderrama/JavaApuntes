package org.Enumeraciones;

/**
 * @author alejandro
 */
public enum Precios {
    PRECIONORMAL(100,1), PRECIOVIP(80,2);
    double precio;
    int estante;

    Precios(double p, int est){
        precio = p;
        estante = est;
    }
    public double getPrecio() {
        return precio;
    }

    public int getEstante() {
        return estante;
    }

    public void setPrecio(double p, int est) {
        this.precio = p;
        this.estante = est;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setEstante(int estante) {
        this.estante = estante;
    }
}
