package org.apuntes;

/**
 * @author alejandro
 */
public class Bucles {
    public static void main(String[] args) {
        int num = 1, num1 = 1;
        int[] num2 = {1,2,3,4,5};

        // While
        System.out.println("While\n-------------------------");
        while(num <= 5 ){
            System.out.println(num);
            num++;
        }


        // Do While
        System.out.println("\nDo While\n-------------------------");
        do {
            System.out.println(num1);
            num1++;
        } while(num1 <= 5);


        // For
        System.out.println("\nFor\n-------------------------");
        for (int i = 1; i<=5; i++) {
            System.out.println(i);
        }

        // Foreach
        System.out.println("\nForeach\n-------------------------");
        for (int numero: num2) {
            System.out.println(numero);
        }


        // Bucles Anidados
        System.out.println("\nBucles Anidados\n-------------------------");
        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= 5; y++) {
                System.out.print(y);
            }
            System.out.println();
        }

    }
}
