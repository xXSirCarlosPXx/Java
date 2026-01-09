package ejercicios;

public class TestBusquedaBinaria {
    
    public static void main(String[] args) {
        int[] A = {-8, 4, 5, 9, 12, 18, 25, 40, 60};
        System.out.println(busquedaBinariaInt(A, 40));
        System.out.println(busquedaBinariaInt(A, 7));
        String[] nombres = {"Andres", "Beatriz", "Carlos", "Diana", "Elena"};
        System.out.println(busquedaBinariaString(nombres, "Carlos"));
        System.out.println(busquedaBinariaString(nombres, "Juan"));
    }
    
    public static int busquedaBinariaInt(int[] arr, int objetivo) {
        int inf = 0;
        int sup = arr.length - 1;
        
        while (inf <= sup) {
            int med = (inf + sup) / 2;
            
            if (arr[med] == objetivo) return med;
            if (objetivo < arr[med]) sup = med - 1;
            else inf = med + 1;
        }
        return -1;
    }
    
    public static int busquedaBinariaString(String[] arr, String objetivo) {
        int inf = 0; 
        int sup = arr.length - 1;

        while (inf <= sup) {
            int med = (inf + sup) / 2;

            int comp = objetivo.compareTo(arr[med]);
            if (comp == 0) return med;
            if (comp < 0) sup = med - 1;
            else inf = med + 1;
        }
        return -1;
    }
}
