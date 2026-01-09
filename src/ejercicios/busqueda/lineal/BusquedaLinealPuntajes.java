package ejercicios.busqueda.lineal;

import java.util.ArrayList;
import java.util.List;

public class BusquedaLinealPuntajes {
    
    public static List<Integer> busquedaLineal(int[] arreglo, int marca){
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < arreglo.length; i++) if (arreglo[i] > marca) indices.add(i);
        return indices;
    }

    public static void main(String[] args) {
        int[] puntajes = {12, 5, 25, 8, 15, 3, 36};
        int marca = 20;
        List<Integer> indices = busquedaLineal(puntajes, marca);
        
        if (indices.isEmpty()) System.out.println("Nadie supero la marca");
        else for (int pos : indices) System.out.println("El jugador " + pos + " supero la marca");       
    }
}
