package ejercicios.busqueda.lineal;

public class BusquedaLinealListaDeCodigos {
    
    public static Boolean busquedaLineal(String[] listaCodigos, String codigo){
        for (String c : listaCodigos) if (c.equals(codigo)) return true;
        return false;
    }

    public static void main(String[] args) {
        String[] listaCodigos = {"LSB-A245", "LSB-A485", "LSB-A356", "LSB-A564", "LSB-A201", "LSB-A895", "LSB-A231", "LSB-A789"};
        String codigo = "LSB-A201";
        Boolean existe = busquedaLineal(listaCodigos, codigo);
        
        if (existe != false) System.out.println("El valor " + codigo + " se encuentra en el vector");
        else System.out.println("El valor " + codigo + " no existe en el vector");
    }
}
