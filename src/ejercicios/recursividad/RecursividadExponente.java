package ejercicios.recursividad;

public class RecursividadExponente {
    
    public static void main(String[] args) {
        int numero = 4;
        int exponente = 5;
        int resultado = 1;
        
        for (int i = 1; i <= exponente; i++) resultado *= numero;
        
        System.out.println("Bucle: " + numero + " elevado a " + exponente + " = " + resultado);
        System.out.println("Funcion: " + numero + " elevado a " + exponente + " = " + exponente(numero, exponente));
    }
    
    public static int exponente(int numero, int exponente) {
        if (exponente == 0) return 1;
        return numero * exponente(numero, exponente - 1);
    }
}
