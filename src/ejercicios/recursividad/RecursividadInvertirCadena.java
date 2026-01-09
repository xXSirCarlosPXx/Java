package ejercicios.recursividad;

public class RecursividadInvertirCadena {

    public static void main(String[] args) {
        String texto = "Hola mundo!";

        String invertidaFor = "";
        for (int i = texto.length() - 1; i >= 0; i--) invertidaFor += texto.charAt(i);

        String invertidaRec = invertir(texto);

        System.out.println("Bucle: " + invertidaFor);
        System.out.println("Funcion: " + invertidaRec);
    }
    
    public static String invertir(String texto) {
        if (texto.length() <= 1) return texto;
        return invertir(texto.substring(1)) + texto.charAt(0);
    }
}
