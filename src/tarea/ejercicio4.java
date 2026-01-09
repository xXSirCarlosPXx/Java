package tarea;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] notas = new int[5];
        int aprobados = 0;
        int reprobados = 0;

        System.out.println("Registro de notas de 5 estudiantes");

        for (int i = 0; i < 5; i++) {
            System.out.println("Nota del estudiante " + (i + 1) + " (0-100): ");
            notas[i] = leer.nextInt();
        }

        System.out.println("Aprobados (>= 70 puntos):");
        for (int i = 0; i < 5; i++) {
            if (notas[i] >= 70) {
                System.out.println("Estudiante " + (i + 1) + ": " + notas[i] + " puntos");
                aprobados++;
            }
        }
        if (aprobados == 0) {
            System.out.println("No hay estudiantes aprobados");
        }

        System.out.println("Reprobados (< 70 puntos):");
        for (int i = 0; i < 5; i++) {
            if (notas[i] < 70) {
                System.out.println("Estudiante " + (i + 1) + ": " + notas[i] + " puntos");
                reprobados++;
            }
        }
        if (reprobados == 0) {
            System.out.println("No hay estudiantes reprobados");
        }
    }
}
