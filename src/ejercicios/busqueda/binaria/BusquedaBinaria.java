package ejercicios.busqueda.binaria;

public class BusquedaBinaria {

    public static void main(String[] args) {
        int[] A = {-8, 4, 5, 9, 12, 18, 25, 40, 60};
        int v = 40;
        int pos = busquedaBinaria(A, v);
        
        if (pos != -1) System.out.println("Se encontro el valor " + v + " en el indice: " + pos);
        else System.out.println("No se encontro el valor " + v + " en el arreglo");
    }
    
    public static int busquedaBinaria(int[] v, int vb){
        int c, b, a;
        b = 0;
        a = v.length - 1;
        while (b <= a) {
            c = (b + a) / 2;
            if (v[c] == vb) return c;
            if(vb < v[c]) a = c - 1;
            else b = c + 1;
        }
        return -1;
    }
}

