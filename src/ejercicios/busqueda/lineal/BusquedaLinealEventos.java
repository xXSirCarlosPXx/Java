package ejercicios.busqueda.lineal;

import java.util.ArrayList;
import java.util.List;

public class BusquedaLinealEventos {
    
    public static void main(String[] args) {
        int[] zonas = {1, 2, 3, 2, 1, 3, 3, 1, 1, 2};
        List<Integer> vips = filtrarZona(zonas, 1);
        System.out.println(vips);
    }
    
    public static List<Integer> filtrarZona(int[] zonas, int zonaBuscada) {
        List<Integer> resultado = new ArrayList<>();

        for (int i = 0; i < zonas.length; i++) {
            if (zonas[i] == zonaBuscada) {
                resultado.add(zonas[i]);
            }
        }
        return resultado;
    }
}
