package ejercicios.listas;

public class Node<T> {
    T data;
    Node<T> next;
    
    public Node(T value) {
        this.data = value;
        this.next = null;
    }
}
