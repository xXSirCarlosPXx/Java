package tarea;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[] precios = new double[5];

        System.out.println("Precios originales:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Precio " + (i + 1) + ": ");
            precios[i] = leer.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            precios[i] = precios[i] * 0.90;
        }

        System.out.println("Precios actualizados (10% de descuento):");
        for (int i = 0; i < 5; i++) {
            System.out.println("Precio " + (i + 1) + ": " + precios[i]);
        }
    }
}
