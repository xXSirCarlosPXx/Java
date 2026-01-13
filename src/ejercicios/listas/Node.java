package ejercicios.listas;

class Node<T> {
    private final T data;
    private Node<T> next;

    Node(T value) {
        this.data = value;
    }

    T getData() {
        return data;
    }

    Node<T> getNext() {
        return next;
    }

    void setNext(Node<T> next) {
        this.next = next;
    }
}
