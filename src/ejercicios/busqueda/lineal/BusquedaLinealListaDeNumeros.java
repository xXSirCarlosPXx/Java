package ejercicios.busqueda.lineal;

public class BusquedaLinealListaDeNumeros {
    
    public static int busquedaLineal(int[] arreglo, int elementoBuscado){
        for (int i=0; i < arreglo.length; i++) if (arreglo[i] == elementoBuscado) return i;
        return -1;
    }

    public static void main(String[] args) {
        int[] numeros = {22, 3, 87, 15, 42, 9, 76, 30};
        int numero = 42;
        int pos = busquedaLineal(numeros, numero);
        
        if (pos != -1) System.out.println("El valor " + numero + " se encuentra en el indice: " + pos);
        else System.out.println("El valor " + numero + " no existe en el vector");       
    }
}
