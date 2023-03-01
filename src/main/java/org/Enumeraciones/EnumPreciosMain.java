package org.Enumeraciones;

public class EnumPreciosMain {
    public static void main(String[] args) {
        Precios p = Precios.PRECIOVIP; //precio = 80
        System.out.println(p.getPrecio()); //muestra 80

        p.setPrecio(70, 3);
        p.setPrecio(60);
        p.setEstante(0);
        System.out.println("Precio: " + p.getPrecio() +
                "\nEstante: " + p.getEstante());
    }
}
