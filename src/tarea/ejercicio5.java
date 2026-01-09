package tarea;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[6];
        int temporal = vector[0];

        System.out.println("Intercambio del primer y ultimo elemento de un vector");

        System.out.println("Ingrese 6 numeros enteros para el vector:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Elemento " + (i + 1) + " (indice " + i + "): ");
            vector[i] = leer.nextInt();
        }

        System.out.println("VECTOR ANTES DEL INTERCAMBIO");
        System.out.print("[ ");
        for (int i = 0; i < 6; i++) {
            System.out.print(vector[i]);
            if (i < 5) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");

        temporal = vector[0];
        vector[0] = vector[5];
        vector[5] = temporal;

        System.out.println("VECTOR DESPUES DEL INTERCAMBIO");
        System.out.print("[ ");
        for (int i = 0; i < 6; i++) {
            System.out.print(vector[i]);
            if (i < 5) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
}
