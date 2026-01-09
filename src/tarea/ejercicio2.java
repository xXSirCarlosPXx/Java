import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] calificaciones = new int[4];
        double suma = 0;
        double promedio;

        System.out.println("Evaluacion: Ejercicios de Problemas Aplicados");
        System.out.println("Ingrese las calificaciones de las 4 tareas practicas:");

        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese la calificacion de la tarea " + (i + 1) + " (0-100): ");
            calificaciones[i] = leer.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            suma += calificaciones[i];
        }

        promedio = suma / 4;

        System.out.println("Calificaciones ingresadas:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Tarea " + (i + 1) + ": " + calificaciones[i]);
        }

        System.out.println("Promedio aritmetico: " + promedio);
    }
}
