package ejercicios.busqueda.lineal;

public class BusquedaLinealListaDeCompras {
    
    public static int busquedaLineal(String[] listaArticulos, String articulo){
        for (int i=0; i < listaArticulos.length; i++) if (listaArticulos[i].equals(articulo)) return i;
        return -1;
    }

    public static void main(String[] args) {
        String[] listaArticulos = {"Pan", "Leche", "Huevos", "Azúcar", "Sal", "Café"};
        String articulo = "Sal";
        int pos = busquedaLineal(listaArticulos, articulo);
        
        if (pos != -1) System.out.println("El valor " + articulo + " se encuentra en el indice: " + pos);
        else System.out.println("El valor " + articulo + " no existe en el vector");       
    }
}
