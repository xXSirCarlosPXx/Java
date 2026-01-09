package ejercicios.recursividad;

public class RecursividadRecorrerVector {
    
    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for (int i = 0; i < vector.length; i++) System.out.println("Bucle: vector[" + i + "] = " + vector[i]);
        
        recorrerVector(vector, 0);
    }
    
    public static void recorrerVector(int[] vector, int i) {
        if (i == vector.length) return;
        System.out.println("Funcion: vector[" + i + "] = " + vector[i]);
        recorrerVector(vector, i + 1);
    }
}
