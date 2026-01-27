package ejercicios.nolineal.arbolbinario;

public class Node {
    private final int dato;
    private Node izquierdo;
    private Node derecho;

    public Node(int valor) {
        this.dato = valor;
    }

    public int getData() {
        return dato;
    }

    public Node getLeft() {
        return izquierdo;
    }

    public void setLeft(Node izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Node getRight() {
        return derecho;
    }

    public void setRight(Node derecho) {
        this.derecho = derecho;
    }
}
