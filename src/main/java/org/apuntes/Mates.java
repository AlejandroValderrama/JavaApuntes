package org.apuntes;

import java.util.Random;

/**
 * @author alejandro
 */
public class Mates {

    public static void main(String[] args) {

        double res, num1 = 7.5, num2 = 2;
        double res1 = 0;

        // Clase Math
        res = Math.abs(num1);           //  Devuelve el valor absoluto de un numero.
        res = Math.acos(num1);          //  Devuelve el arco coseno de un angulo en radianes.
        res = Math.asin(num1);          //  Devuelve el arco seno de un ángulo en radianes.
        res = Math.atan(num1);          //  Devuelve el arco tangente entre -PI/2 y PI/2.
        res = Math.atan2(num1, num2);   //  Devuelve el arco tangente entre -PI y PI.
        res = Math.ceil(num1);          //  Devuelve el entero más cercano por arriba.
        res = Math.floor(num1);         //  Devuelve el entero más cercano por debajo.
        res = Math.round(num1);         //  Devuelve el entero más cercano, a partir del .5 redondea por arriba.
        res = Math.cos(num1);           //  Devuelve el coseno de un ángulo.
        res = Math.sin(num1);           //  Devuelve el seno de un ángulo.
        res = Math.tan(num1);           //  Devuelve la tangente de un ángulo.
        res = Math.exp(num1);           //  Devuelve el exponencial de un número.
        res = Math.log(num1);           //  Devuelve el logaritmo natural en base e de un número.
        res = Math.max(num1, num2);     //  Devuelve el mayor de dos entre dos valores.
        res = Math.min(num1, num2);     //  Devuelve el menor de dos entre dos valores.
        res = Math.random();            //  Devuelve un número aleatorio entre 0 y 1. Se pueden cambiar el rango de generación.
        res = (Math.random()*25)+1;     //  Devuelve un número aleatorio entre min y un max. *rango + minimo.
        res = Math.sqrt(num1);          //  Devuelve la raíz cuadrada de un número.
        res = Math.pow(num1, num2);     //  Devuelve un número elevado a un exponente. (base, exponente)
        res = Math.PI;                  //  Devuelve el valor de PI. Es un double.
        res = Math.E;                   //  Devuelve el valor de E. Es un double.


        // Clase Random
        Random aleat = new Random();

        // [] incluye el numero
        // () excluye el numero

        // Del [5 al 105]
        res = 5 + aleat.nextInt(100); // Param: cantidad de números

        // Del (-20 al 20)
        res = -19 + aleat.nextInt(39); // Param: cantidad de números

        System.out.printf(""+res1);
    }
}
