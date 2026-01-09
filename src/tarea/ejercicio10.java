import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] inventarios = new int[15];
        int contador = 0;

        for (int i = 0; i < 15; i++) {
            System.out.print("Ingrese el valor del inventario " + (i + 1) + ": ");
            inventarios[i] = leer.nextInt();
        }

        System.out.println("Inventarios registrados:");
        for (int i = 0; i < 15; i++) {
            System.out.println("Índice[" + i + "] = " + inventarios[i]);
        }

        System.out.print("Ingrese el valor objetivo a buscar: ");
        int valorObjetivo = leer.nextInt();

        System.out.println("Posiciones donde aparece el valor " + valorObjetivo + ":");
        for (int i = 0; i < 15; i++) {
            if (inventarios[i] == valorObjetivo) {
                System.out.println("  Índice[" + i + "] = " + inventarios[i]);
                contador++;
            }
        }

        System.out.println("El valor " + valorObjetivo + " aparece " + contador + " veces en el arreglo.");
    }
}
