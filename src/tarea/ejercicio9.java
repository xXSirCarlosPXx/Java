import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[7];
        int valorMaximo = numeros[0];
        int posicionMaximo = 0;

        System.out.println("Ingrese 7 numeros enteros:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = leer.nextInt();
        }

        for (int i = 0; i < 7; i++) {
            if (numeros[i] > valorMaximo) {
                valorMaximo = numeros[i];
                posicionMaximo = i;
            }
        }

        System.out.println("El valor más grande es: " + valorMaximo);
        System.out.println("Se encuentra en la posición (índice): " + posicionMaximo);
    }
}
