import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] calificaciones = new int[10];
        int sobresalientes = 0;

        System.out.println("Unidad 1 de la asignatura (4 temas de contenido)");
        System.out.println("Calificaciones del primer trabajo practico");

        for (int i = 0; i < 10; i++) {
            System.out.println("Calificacion del estudiante " + (i + 1) + " (0-100): ");
            calificaciones[i] = leer.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (calificaciones[i] > 90) {
                sobresalientes++;
            }
        }

        System.out.println("Calificaciones ingresadas:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + calificaciones[i]);
        }

        System.out.println("Cantidad de estudiantes con logro sobresaliente (calificacion > 90): " + sobresalientes);
    }
}
