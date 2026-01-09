package ejercicios.ordenamiento;

import java.util.Arrays;

public class OrdenamientoEnteros {

    public static void main(String[] args) {
        int[] v1 = {5, 2, 4, 3, 1};
        int[] v2 = {2, 5, 3, 1, 4};
        int[] v3 = {3, 1, 5, 4, 2};

        System.out.println("Burbuja:");
        System.out.println("Antes: " + Arrays.toString(v1));
        burbuja(v1);
        System.out.println("Despues: " + Arrays.toString(v1));

        System.out.println("Seleccion:");
        System.out.println("Antes: " + Arrays.toString(v2));
        seleccion(v2);
        System.out.println("Despues: " + Arrays.toString(v2));

        System.out.println("Insercion:");
        System.out.println("Antes: " + Arrays.toString(v3));
        insercion(v3);
        System.out.println("Despues: " + Arrays.toString(v3));
    }

    public static void burbuja(int[] v) {
        int n = v.length;
        for (int i = 0; i < n - 1; i++) {
            boolean s = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int t = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = t;
                    s = true;
                }
            }
            if (!s) break;
        }
    }

    public static void seleccion(int[] v) {
        int n = v.length;
        for (int i = 0; i < n - 1; i++) {
            int m = i;

            for (int j = i + 1; j < n; j++) {
                if (v[j] < v[m]) {
                    m = j;
                }
            }

            if (m != i) {
                int t = v[i];
                v[i] = v[m];
                v[m] = t;
            }
        }
    }

    public static void insercion(int[] v) {
        int n = v.length;
        for (int i = 1; i < n; i++) {
            int t = v[i];
            int j = i - 1;

            while (j >= 0 && v[j] > t) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = t;
        }
    }
}
