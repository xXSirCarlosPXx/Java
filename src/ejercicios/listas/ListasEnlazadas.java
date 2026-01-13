package ejercicios.listas;

public class ListasEnlazadas {
    
    static void main() {
        List<Integer> lista = new List<>();

        System.out.println("La lista esta vacia? " + lista.isEmpty());

        lista.addFirst(40);
        lista.addFirst(30);
        lista.addFirst(20);
        lista.addFirst(10);

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
