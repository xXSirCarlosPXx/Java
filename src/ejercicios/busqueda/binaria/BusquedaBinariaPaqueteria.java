package ejercicios.busqueda.binaria;

public class BusquedaBinariaPaqueteria {
    
    public static void main(String[] args) {
        int[] ids = {1001, 1200, 2000, 3500, 5000, 5020, 7000, 9000};

        int objetivo = 5020;
        int pos = buscarPaquete(ids, objetivo);

        if (pos != -1) System.out.println("Paquete " + objetivo + " encontrado en el indice: " + pos);
        else System.out.println("Paquete " + objetivo + " no esta en el lote");
    }
    
    public static int buscarPaquete(int[] ids, int objetivo) {
        int inf = 0;
        int sup = ids.length - 1;

        while (inf <= sup) {
            int med = (inf + sup) / 2;

            if (ids[med] == objetivo) return med;
            if (objetivo < ids[med]) sup = med - 1;
            else inf = med + 1;
        }
        return -1;
    }
}
