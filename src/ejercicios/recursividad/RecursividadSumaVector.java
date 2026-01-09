package ejercicios.recursividad;

public class RecursividadSumaVector {
    
    public static void main(String[] args) {
        int[] numeros = {8, 6, 5, 3, 4, 8, 9, 1};
        int suma = 0;
        
        for (int i = 0; i < numeros.length; i++) suma += numeros[i];
        
        System.out.println("Bucle: El resultado de la suma da: " + suma);
        System.out.println("Funcion: El resultado de la suma da: " + suma(numeros, 0));
    }
    
    public static int suma(int[] vector, int i) {
        if (i < vector.length) return vector[i] + suma(vector, i + 1);
        return 0;
    }
}
