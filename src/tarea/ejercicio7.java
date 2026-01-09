import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[10];
        int suma = 0;

        System.out.println("Ingrese 10 numeros enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = leer.nextInt();
        }

        System.out.println("Elementos en posiciones pares:");
        for (int i = 0; i < 10; i += 2) {
            System.out.println("Índice[" + i + "]: " + numeros[i]);
            suma += numeros[i];
        }

        System.out.println("Suma de elementos en posiciones pares: " + suma);
    }
}
