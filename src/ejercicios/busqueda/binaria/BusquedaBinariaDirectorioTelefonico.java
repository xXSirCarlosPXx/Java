package ejercicios.busqueda.binaria;

public class BusquedaBinariaDirectorioTelefonico {
    
    public static void main(String[] args) {
        String[] nombres = {"Andres", "Beatriz", "Carlos", "Diana", "Elena"};
        String[] telefonos = {"098333444", "096777888", "097555666", "099111222", "095999000"};
        String nombre = "Diana";
        
        System.out.println(buscarContacto(nombres, telefonos, nombre));
    }
    
    public static String buscarContacto(String[] nombres, String[] telefonos, String nombre){
        int sup = nombres.length - 1;
        int inf = 0;
        
        while (inf <= sup) {
            int med = (inf + sup) / 2;
            int comp = nombre.compareTo(nombres[med]);
            
            if (comp == 0) return "El numero de "+ nombre + " es: " + telefonos[med];
            if (comp < 0) sup = med - 1;
            else inf = med + 1;
        }
        return "No se encontro el contacto: " + nombre;
    }
}
