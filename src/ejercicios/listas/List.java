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
        Node<T> anterior = head;
        Node<T> actual = head.getNext();
        while (actual != null && !Objects.equals(actual.getData(), value)) {
            anterior = actual;
            actual = actual.getNext();
        }
        if (actual == null) return false;
        anterior.setNext(actual.getNext());
        if (actual == tail) {
            tail = anterior;
        }
        return true;
    }

    public boolean search(T value) {
        Node<T> actual = head;
        while (actual != null) {
            if (Objects.equals(actual.getData(), value)) return true;
            actual = actual.getNext();
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
