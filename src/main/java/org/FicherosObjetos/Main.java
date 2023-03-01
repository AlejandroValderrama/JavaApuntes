package org.FicherosObjetos;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        escribirF();
        leerF();
        addF();
        leerF();
         */

    }

    public static void escribirF(){
        String nombre, cargo;
        int edad;
        Trabajador trab;
        try{
            FileOutputStream fBinario = new FileOutputStream("empresa");
            ObjectOutputStream fich = new  ObjectOutputStream(fBinario);

            Scanner entrada = new Scanner(System.in);

            System.out.println("Cuántos trabajadores tiene empresa?");
            int num = entrada.nextInt();
            entrada.nextLine();


            for(int i= 0; i<num; i++){

                System.out.println("Introduzca cargo:");
                cargo = entrada.nextLine();
                System.out.println("Introduzca nombre:");

                nombre = entrada.nextLine();
                System.out.println("Introduzca edad");
                edad = entrada.nextInt();
                entrada.nextLine();
                trab = new Trabajador(nombre, edad, cargo);
                fich.writeObject(trab);

            }
            fich.flush();
            fich.close();
        }catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();

        }

    }

    public static void addF(){
        String nombre, cargo;
        int edad;
        Trabajador trab;
        try{
            FileOutputStream fBinario = new FileOutputStream("empresa",true);
            MiObjectOutputStream fich = new  MiObjectOutputStream(fBinario);

            Scanner entrada = new Scanner(System.in);

            System.out.println("Cuántos trabajadores tiene empresa?");
            int num = entrada.nextInt();
            entrada.nextLine();


            for(int i= 0; i<num; i++){

                System.out.println("Introduzca cargo:");
                cargo = entrada.nextLine();
                System.out.println("Introduzca nombre:");

                nombre = entrada.nextLine();
                System.out.println("Introduzca edad");
                edad = entrada.nextInt();
                entrada.nextLine();
                trab = new Trabajador(nombre, edad, cargo);
                fich.writeObject(trab);

            }
            fich.flush();
            fich.close();
        }catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();

        }

    }


    public static void leerF(){

        try{
            FileInputStream flujo= new FileInputStream("empresa");
            ObjectInputStream fich2 = new  ObjectInputStream(flujo);
            System.out.println("Recuperamos del fichero");
            Trabajador trabajador;
            boolean continuar = true;

            while(continuar){
                try{

                    trabajador = (Trabajador)fich2.readObject();
                    System.out.println(trabajador);

                }catch(EOFException e){

                    continuar = false;
                }
            }


            fich2.close();
        }catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();

        }catch (ClassNotFoundException e2){
            System.out.println("Error al leer, no se encuentra la clase");

        }
    }
}
