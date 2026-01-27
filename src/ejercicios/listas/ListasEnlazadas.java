package ejercicios.listas;

public class ListasEnlazadas {
    
    static void main() {
        List<Object> lista = new List<>();

        System.out.println("La lista esta vacia? " + lista.isEmpty());

        lista.addFirst(40);
        lista.addFirst("Hola mundo");
        lista.addFirst(true);
        lista.addFirst(10.4);

        lista.addLast(50);

        System.out.println("La lista esta vacia? " + lista.isEmpty());

        System.out.println("Se encontro el numero? " + lista.contains(30));
        System.out.println("Se encontro el numero? " + lista.contains(100));

        lista.printList();

        System.out.println("Se elimino el numero? " + lista.remove(20));
        System.out.println("Se elimino el numero? " + lista.remove(100));

        lista.printList();
    }
}
