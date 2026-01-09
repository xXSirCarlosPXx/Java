package ejercicios.recursividad;

public class RecursividadFactorial {
    
    public static void main(String[] args) {
        int numero = 4;
        int factorial = 1;
        
        for (int i = 1; i <= numero; i++) factorial *= i;
        
        System.out.println("Bucle: El factorial de " + numero + " es: " + factorial);
        System.out.println("Funcion: El factorial de " + numero + " es: " + factorial(numero));
    }
    
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
