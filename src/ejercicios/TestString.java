package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class TestString {
    
    public static List<Integer> busquedaLineal(String[] arreglo, String articulo){
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(articulo)) {
                indices.add(i);
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        String[] listaArticulos = {"Pan", "Leche", "Huevos", "Azúcar", "Sal", "Café", "Sal"};
        String articulo = "Sal";
        List<Integer> indices = busquedaLineal(listaArticulos, articulo);
        
        if (indices.isEmpty()) System.out.println("Nadie existe ese articulo");
        else for (int pos : indices) System.out.println("El articulo '" + articulo + "' esta en la posicion: " + pos);       
    }

}
