package org.apuntes;

import java.util.Scanner;

/**
 *
 * @author alejandro
 */

public class Datos {

    public static void main(String[] args) {

        // Numericos enteros
        byte b = 1;     // -128 <> 127
        short s = 1;    // -32768 <> 32767
        int i = 1;      // -2147483648 <> 2147483647
        long l = 1L;    // -9223372036854775808 <> 9223372036854775807

        // Numericos Decimal
        float f = 1.4f; // Aproximado a 7 dígitos
        double d = 1.4; // Aproximado a 16 dígitos

        // Booleano
        boolean b1 = true;
        boolean b2 = false;


        // Caracter y Enteros
        char c = 'c';
        char n = 99;    // 99 en decimal es la 'c'

        /*
        Caracteres especiales

            \t      Tabulador
            \n      Salto de linea
            \r      Retorno de carro
            \b      Retroceso
            \'      Comillas simples
            \''     Comillas dobles
            \\      Barra invertida
        */

        // Cadena
        String cadena = "Hola mundo";

        // Constantes
        final double PI = 3.11592; // Datos que nunca varían

        // Casting
        int i1 = 1; // 1
        double d2 = (double) i1; // 1.0
        double d3 = 2.4;
        i1 = (int) d3; // 2 -> perderíamos 0.4 por redondeo
        char c1 = 'c';
        i1 = (int) 'c'; // 99 -> código UNICODE de c

        /*
        Operadores

            +   Suma
            -   Resta
            ++  Incremento valor en 1
            --  Decremento valor en 1
            !   Invierte el valor booleano

            x++ Evalua e incrementa     ->  i=1; j=++i; / i=2; j=2;
            ++x Incrementa y evalua     ->  i=1; j=i++; / i=2; j=1;
            x-- Evalua y decrementa     ->  i=1; j=--i; / i=0; j=0;
            --x Decrementa y evalua     ->  i=1; j=i--; / i=0; j=1;

            +=  Suma y asigna           ->  i+=2;   /   i=i+2;
            -=  Resta y asigna          ->  i-=2;   /   i=i-2;
            *=  Multiplica y asigna     ->  i*=2;   /   i=i*2;
            /=  Divide y asgina         ->  i/=2;   /   i=i/2;
            %=  Resto y asgina          ->  i%=2;   /   i=i%2;

        Operadores Relacionales

            ==  Igual
            !=  Distinto
            <   Menor
            >   Mayor
            <=  Menor o igual
            >=  Mayor o igual

        Operadores Booleanos

            !   Negación (Distinto)     -> Cambia el valor booleano
            &&  AND (Y)                 -> Es TRUE si ambos expresiones son TRUE, lo contrario es FALSE
            ||  OR  (O)                 -> Es TRUE si tan solo uno de las dos es TRUE. lo contrario es FALSE
            ^   XOR (O exclusivo)       -> Es TRUE si los operandos son diferentes. Iguales es FALSE

         */

        // Expresiones
        double d4;
        d4= 2.5 * 2;
        d4 = 5.6 + 8;
        d4 = 2.2 / 2;
        d4 = 2 % 3; // Resto de la división

        // Introducir datos por consola
        Scanner entrada = new Scanner(System.in);
        //int num = entrada.nextInt();
        //c1 = entrada.next().chartAt(0);

        // Mostrar mensaje o dato por consola
        System.out.println("Hola mundo"); // Mensaje con salto de linea
        System.out.printf("Hola mundo\n"); // Mensaje sin salto de linea

        /*
        Printf

            %d  ->  Nº enteros
            %f  ->  Nº Reales   -> .1f Indica un decimal
            %s  ->  Cadena
            %c  -> Char
            %b  -> Booleano

         */

        System.out.printf("entero = %d\ndecimal = %.2f\nchar = %c\ncadena = %s\nboolean = %b",i1,d2,c1,cadena,b1);


    }
}
