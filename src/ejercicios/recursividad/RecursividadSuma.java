package ejercicios.recursividad;

public class RecursividadSuma {
    
    public static void main(String[] args) {
        int numero = 8;
        int suma = 0;
        
        for (int i = 1; i <= numero; i++) suma += i;
        
        System.out.println("Bucle: El resultado de la suma da: " + suma);
        System.out.println("Funcion: El resultado de la suma da: " + suma(numero));
    }
    
    public static int suma(int numero) {
        if (numero == 1) return 1;
        return numero + suma(numero - 1);
    }
}
