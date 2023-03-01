package org.apuntes;

/**
 * @author alejandro
 */
public class Condicionales {
    public static void main(String[] args) {
        boolean t = true, f = false, res;
        int num = 3, num1 = 2;

        // If (TRUE)
        if (t) // Cumple porque t es true.
            System.out.println("Es true");

        if (!f) // Cumple porque !f es disitnto de true.
            System.out.println("Es distinto de true");

        if (num != 3) // No cumple porque num no es distinto a 3.
            System.out.println("Es distinto de 3");

        if (f)  // No cumple porque f es false.
            System.out.println("No es false");

        if (num > num1 && num == 3)
            System.out.println("Num es mayor a num1 y es igual a 3");


        //If (TRUE) Else if (TRUE) Else (Si no se cumple ningún if)
        if (num == 5)
            System.out.println("Es igual a 5");
        else // Cumple else porque num es distinto a 5.
            System.out.println("No es igual a 5");


        if (f)  // Cumple else porque f es false.
            System.out.println("No es false");
        else
            System.out.println("Es false");


        if (num > num1 && num == 4) // AND tiene que cumplir las dos condiciones
            System.out.println("Num es mayor a num1 y es igual a 3");
        else if (num < num1 || num == 3) // Funciona porque al ser OR cumple una de las dos condiciones
            System.out.println("Num es menor a num1 o es igual a 3");
        else
            System.out.println("No cumple ninguna condicion");


        // Operador Ternario
        res = (4 %2 == 0) ? true : false;   // Es un if pero en una linea.

        //Switch
        switch (num) {
            case 1:
                System.out.println("num es 1");
                break;
            case 2:
                System.out.println("num es 2");
                break;
            case 3:
                System.out.println("num es 3");
                break;
            default:
                System.out.println("num no es 1, 2, 3");
        }
    }
}
