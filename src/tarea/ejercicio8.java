package tarea;

import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] notas = new int[6];
        boolean[] resultados = new boolean[6];

        System.out.println("Notas de los estudiantes:");

        for (int i = 0; i < 6; i++) {
            System.out.print("Nota[" + i + "] = ");
            notas[i] = leer.nextInt();

            if (notas[i] >= 70) {
                resultados[i] = true;
            } else {
                resultados[i] = false;
            }
        }

        System.out.println("Vector Resultados (true = aprobado, false = reprobado):");
        for (int i = 0; i < 6; i++) {
            System.out.println("Resultados[" + i + "] = " + resultados[i] + " (Nota[" + i + "]: " + notas[i] + ")");
        }
    }
}
