package ejercicios.ordenamiento;

import java.util.Arrays;

public class OdenamientoCadenasDeTexto {

    public static void main(String[] args) {
        String[] v1 = {"Luis", "Ana", "Xavier", "Carlos"};
        String[] v2 = {"Xavier", "Luis", "Ana", "Carlos"};
        String[] v3 = {"Carlos", "Ana", "Luis", "Xavier"};

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

    public static void burbuja(String[] v) {
        int n = v.length;
        for (int i = 0; i < n - 1; i++) {
            boolean s = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (v[j].compareTo(v[j + 1]) > 0) {
                    String t = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = t;
                    s = true;
                }
            }
            if (!s) break;
        }
    }

    public static void seleccion(String[] v) {
        int n = v.length;
        for (int i = 0; i < n - 1; i++) {
            int m = i;

            for (int j = i + 1; j < n; j++) {
                if (v[j].compareTo(v[m]) < 0) {
                    m = j;
                }
            }

            if (m != i) {
                String t = v[i];
                v[i] = v[m];
                v[m] = t;
            }
        }
    }

    public static void insercion(String[] v) {
        int n = v.length;
        for (int i = 1; i < n; i++) {
            String t = v[i];
            int j = i - 1;

            while (j >= 0 && v[j].compareTo(t) > 0) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = t;
        }
    }
}
