package ejercicios.recursividad;

public class RecursividadPares {

    public static void main(String[] args) {
        int N[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int par = 0;

        for (int i : N) if (i % 2 == 0) par++;

        System.out.println("Bucle: Cantidad de numeros pares: " + par);
        System.out.println("Funcion: Cantidad de numeros pares: " + par(N, 0));
    }

    public static int par(int[] vector, int i) {
        if (i == vector.length) return 0;
        return (vector[i] % 2 == 0 ? 1 : 0) + par(vector, i + 1);
    }
}
