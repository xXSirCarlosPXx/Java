package ejercicios.listas;

public class List<T> {
    Node<T> head;
    
    public List() {
        head = null;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void addFirst(T value) {
        Node<T> nodo = new Node<>(value);
        nodo.next = head;
        head = nodo;
    }
    
    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
}
