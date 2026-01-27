package ejercicios.nolineal.arbolbinario;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    private Node raiz;

    public boolean contains(int valor) {
        return search(valor) != null;
    }

    public boolean insert(int valor) {
        if (contains(valor)) return false;
        raiz = insertRecursive(raiz, valor);
        return true;
    }

    private Node insertRecursive(Node actual, int valor) {
        if (actual == null) return new Node(valor);

        if (valor < actual.getData()) {
            actual.setLeft(insertRecursive(actual.getLeft(), valor));
        } else if (valor > actual.getData()) {
            actual.setRight(insertRecursive(actual.getRight(), valor));
        }
        return actual;
    }

    public Node search(int valor) {
        return searchRecursive(raiz, valor);
    }

    private Node searchRecursive(Node nodo, int valor) {
        if (nodo == null || nodo.getData() == valor) return nodo;
        if (valor < nodo.getData()) return searchRecursive(nodo.getLeft(), valor);
        return searchRecursive(nodo.getRight(), valor);
    }

    public void delete(int valor) {
        raiz = deleteRecursive(raiz, valor);
    }

    private Node deleteRecursive(Node nodo, int valor) {
        if (nodo == null) return null;

        if (valor < nodo.getData()) {
            nodo.setLeft(deleteRecursive(nodo.getLeft(), valor));
            return nodo;
        }

        if (valor > nodo.getData()) {
            nodo.setRight(deleteRecursive(nodo.getRight(), valor));
            return nodo;
        }

        if (nodo.getLeft() == null && nodo.getRight() == null) return null;
        if (nodo.getLeft() == null) return nodo.getRight();
        if (nodo.getRight() == null) return nodo.getLeft();

        Node sucesor = minValueNode(nodo.getRight());

        Node reemplazo = new Node(sucesor.getData());
        reemplazo.setLeft(nodo.getLeft());
        reemplazo.setRight(deleteRecursive(nodo.getRight(), sucesor.getData()));
        return reemplazo;
    }

    private Node minValueNode(Node nodo) {
        if (nodo == null) return null;
        if (nodo.getLeft() == null) return nodo;
        return minValueNode(nodo.getLeft());
    }

    public int height() {
        return heightRecursive(raiz);
    }

    private int heightRecursive(Node nodo) {
        if (nodo == null) return -1;
        int alturaIzq = heightRecursive(nodo.getLeft());
        int alturaDer = heightRecursive(nodo.getRight());
        return Math.max(alturaIzq, alturaDer) + 1;
    }

    public int depth(int valor) {
        return depthRecursive(raiz, valor, 0);
    }

    private int depthRecursive(Node nodo, int valor, int nivel) {
        if (nodo == null) return -1;
        if (nodo.getData() == valor) return nivel;

        if (valor < nodo.getData()) return depthRecursive(nodo.getLeft(), valor, nivel + 1);
        return depthRecursive(nodo.getRight(), valor, nivel + 1);
    }

    public String pathToString(int valor) {
        List<Integer> camino = new ArrayList<>();
        boolean ok = pathToRecursive(raiz, valor, camino);
        if (!ok) return null;
        return listToStringRecursive(camino, 0);
    }

    private boolean pathToRecursive(Node nodo, int valor, List<Integer> camino) {
        if (nodo == null) return false;

        camino.add(nodo.getData());

        if (nodo.getData() == valor) return true;

        if (valor < nodo.getData()) {
            if (pathToRecursive(nodo.getLeft(), valor, camino)) return true;
        } else {
            if (pathToRecursive(nodo.getRight(), valor, camino)) return true;
        }

        camino.removeLast();
        return false;
    }

    private String listToStringRecursive(List<Integer> lista, int indice) {
        if (indice >= lista.size()) return "";
        String actual = String.valueOf(lista.get(indice));
        String resto = listToStringRecursive(lista, indice + 1);
        return resto.isEmpty() ? actual : (actual + " " + resto);
    }

    public String preOrderString() {
        StringBuilder texto = new StringBuilder();
        preOrderRecursive(raiz, texto);
        return texto.toString().trim();
    }

    private void preOrderRecursive(Node nodo, StringBuilder texto) {
        if (nodo == null) return;
        texto.append(nodo.getData()).append(' ');
        preOrderRecursive(nodo.getLeft(), texto);
        preOrderRecursive(nodo.getRight(), texto);
    }

    public String inOrderString() {
        StringBuilder texto = new StringBuilder();
        inOrderRecursive(raiz, texto);
        return texto.toString().trim();
    }

    private void inOrderRecursive(Node nodo, StringBuilder texto) {
        if (nodo == null) return;
        inOrderRecursive(nodo.getLeft(), texto);
        texto.append(nodo.getData()).append(' ');
        inOrderRecursive(nodo.getRight(), texto);
    }

    public String postOrderString() {
        StringBuilder texto = new StringBuilder();
        postOrderRecursive(raiz, texto);
        return texto.toString().trim();
    }

    private void postOrderRecursive(Node nodo, StringBuilder texto) {
        if (nodo == null) return;
        postOrderRecursive(nodo.getLeft(), texto);
        postOrderRecursive(nodo.getRight(), texto);
        texto.append(nodo.getData()).append(' ');
    }

    public String breadthFirstString() {
        StringBuilder texto = new StringBuilder();
        int altura = height();
        breadthFirstLevels(0, altura, texto);
        return texto.toString().trim();
    }

    private void breadthFirstLevels(int nivel, int altura, StringBuilder texto) {
        if (nivel > altura) return;
        printLevel(raiz, nivel, texto);
        breadthFirstLevels(nivel + 1, altura, texto);
    }

    private void printLevel(Node nodo, int nivel, StringBuilder texto) {
        if (nodo == null) return;

        if (nivel == 0) {
            texto.append(nodo.getData()).append(' ');
            return;
        }

        printLevel(nodo.getLeft(), nivel - 1, texto);
        printLevel(nodo.getRight(), nivel - 1, texto);
    }
}
