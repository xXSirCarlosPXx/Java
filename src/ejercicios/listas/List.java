package ejercicios.listas;

import java.util.Objects;
import java.util.StringJoiner;

public class List<T> {
    private Node<T> head;
    private Node<T> tail;

    public List() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(T value) {
        Node<T> nodo = new Node<>(value);
        nodo.setNext(head);
        head = nodo;
        if (tail == null) {
            tail = nodo;
        }
    }

    public void addLast(T value) {
        Node<T> nodo = new Node<>(value);
        if (head == null) {
            head = tail = nodo;
            return;
        }
        tail.setNext(nodo);
        tail = nodo;
    }

    public boolean deleteNode(T value) {
        if (head == null) return false;
        if (Objects.equals(head.getData(), value)) {
            head = head.getNext();
            if (head == null) {
                tail = null;
            }
            return true;
        }
        Node<T> prev = head;
        Node<T> curr = head.getNext();
        while (curr != null && !Objects.equals(curr.getData(), value)) {
            prev = curr;
            curr = curr.getNext();
        }
        if (curr == null) return false;
        prev.setNext(curr.getNext());
        if (curr == tail) {
            tail = prev;
        }
        return true;
    }

    public boolean search(T value) {
        Node<T> current = head;
        while (current != null) {
            if (Objects.equals(current.getData(), value)) return true;
            current = current.getNext();
        }
        return false;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        Node<T> actual = head;
        while (actual != null) {
            sj.add(String.valueOf(actual.getData()));
            actual = actual.getNext();
        }
        return sj.toString();
    }

    public void printList() {
        System.out.println(this);
    }
}
