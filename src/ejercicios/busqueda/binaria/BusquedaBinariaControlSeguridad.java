package ejercicios.busqueda.binaria;

public class BusquedaBinariaControlSeguridad {
    
    public static void main(String[] args) {
        int[] listaBlanca = {101, 205, 900, 1200, 3500, 5020, 8800};
        int idEscaneado = 5020;

        if (accesoVip(listaBlanca, idEscaneado)) System.out.println("ACCESO CONCEDIDO");
        else System.out.println("ACCESO DENEGADO");
    }
    
    public static boolean accesoVip(int[] listaBlanca, int idEscaneado) {
        int inf = 0, sup = listaBlanca.length - 1;

        while (inf <= sup) {
            int med = (inf + sup) / 2;

            if (listaBlanca[med] == idEscaneado) return true;
            if (idEscaneado < listaBlanca[med]) sup = med - 1;
            else inf = med + 1;
        }
        return false;
    }
}
