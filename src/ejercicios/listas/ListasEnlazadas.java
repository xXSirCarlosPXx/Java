package ejercicios.listas;

public class ListasEnlazadas {
    
    public static void main(String[] args) {
        List<Object> lista = new List<>();

        System.out.println("La lista esta vacia? " + lista.isEmpty());

        lista.addFirst(30);
        lista.addFirst("Hola");
        lista.addFirst(3.2);
        lista.addFirst(true);

        System.out.println("La lista esta vacia? " + lista.isEmpty());
        
        lista.printList();
    }
}
