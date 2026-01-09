package ejercicios.arreglos;

import java.util.Scanner;

public class Arreglos {
        
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0;
        for (; n < 2; ) {
            System.out.print("Tamano del arreglo (>=2): ");
            for (; !sc.hasNextInt(); ) {
                sc.next();
                System.out.println("Solo se aceptan enteros!");
                System.out.print("Tamano del arreglo (>=2): ");
            }
            n = sc.nextInt();
        }

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            for (; !sc.hasNextInt(); ) {
                sc.next();
                System.out.println("Solo se aceptan enteros!");
                System.out.print("a[" + i + "] = ");
            }
            a[i] = sc.nextInt();
        }

        System.out.println("Mostrar indice -> valor:");
        for (int i = 0; i < n; i++) {
            System.out.println(i + " -> " + a[i]);
        }

        System.out.println("Suma, promedio, mayor, menor:");
        int suma = 0;
        int mayor = a[0], idxMayor = 0;
        int menor = a[0], idxMenor = 0;

        for (int i = 0; i < n; i++) {
            suma += a[i];

            if (a[i] > mayor) { mayor = a[i]; idxMayor = i; }
            if (a[i] < menor) { menor = a[i]; idxMenor = i; }
        }

        double promedio = (double) suma / n;
        System.out.println("Suma = " + suma);
        System.out.println("Promedio = " + promedio);
        System.out.println("Mayor = " + mayor + " (indice " + idxMayor + ")");
        System.out.println("Menor = " + menor + " (indice " + idxMenor + ")");

        System.out.println("Pares e impares:");
        int pares = 0, impares = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) pares++;
            else impares++;
        }
        System.out.println("Pares = " + pares);
        System.out.println("Impares = " + impares);

        System.out.println("Invertir arreglo:");
        for (int i = 0; i < n / 2; i++) {
            int j = n - i - 1;
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }

        System.out.print("Invertido: [");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");

        sc.close();
    }
}
