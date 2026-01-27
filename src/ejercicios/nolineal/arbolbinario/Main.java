package ejercicios.nolineal.arbolbinario;

import java.util.Scanner;

public class Main {

    static void main() {
        Scanner entrada = new Scanner(System.in);
        BinaryTree arbol = new BinaryTree();
        mainMenu(arbol, entrada);
    }

    private static void mainMenu(BinaryTree arbol, Scanner entrada) {
        IO.println();
        IO.println(Ansi.title("=== MENÚ PRINCIPAL ==="));
        IO.println(Ansi.value("1) Operaciones (insertar/buscar/eliminar)"));
        IO.println(Ansi.value("2) Recorridos (pre/in/post/amplitud)"));
        IO.println(Ansi.value("3) Métricas (camino/profundidad/altura)"));
        IO.println(Ansi.value("0) Salir"));
        IO.print(Ansi.prompt("Elige una opción: "));

        int opcion = readInt(entrada);
        mainMenuOption(arbol, entrada, opcion);
    }

    private static void mainMenuOption(BinaryTree arbol, Scanner entrada, int opcion) {
        switch (opcion) {
            case 1 -> operationsMenu(arbol, entrada);
            case 2 -> traversalsMenu(arbol, entrada);
            case 3 -> metricsMenu(arbol, entrada);
            case 0 -> {
                IO.println(Ansi.title("Saliendo..."));
                entrada.close();
            }
            default -> {
                IO.println(Ansi.error("Opción inválida."));
                mainMenu(arbol, entrada);
            }
        }
    }

    private static void operationsMenu(BinaryTree arbol, Scanner entrada) {
        IO.println();
        IO.println(Ansi.header("--- OPERACIONES ---"));
        IO.println(Ansi.value("1) Insertar nodo"));
        IO.println(Ansi.value("2) Buscar nodo"));
        IO.println(Ansi.value("3) Eliminar nodo"));
        IO.println(Ansi.value("0) Volver"));
        IO.print(Ansi.prompt("Elige una opción: "));

        int opcion = readInt(entrada);
        operationsMenuOption(arbol, entrada, opcion);
    }

    private static void operationsMenuOption(BinaryTree arbol, Scanner entrada, int opcion) {
        switch (opcion) {
            case 1 -> {
                IO.print(Ansi.prompt("Ingrese el valor a insertar: "));
                int valor = readInt(entrada);

                boolean ok = arbol.insert(valor);
                IO.println(ok
                        ? Ansi.success("Insertado: " + valor)
                        : Ansi.error("No se puede insertar: el nodo ya existe (" + valor + ")."));

                operationsMenu(arbol, entrada);
            }
            case 2 -> {
                IO.print(Ansi.prompt("Ingrese el valor a buscar: "));
                int valor = readInt(entrada);

                boolean encontrado = (arbol.search(valor) != null);
                IO.println(encontrado
                        ? Ansi.success("Resultado: Encontrado (" + valor + ").")
                        : Ansi.error("Resultado: No encontrado (" + valor + ")."));

                operationsMenu(arbol, entrada);
            }
            case 3 -> {
                IO.print(Ansi.prompt("Ingrese el valor a eliminar: "));
                int valor = readInt(entrada);

                if (!arbol.contains(valor)) {
                    IO.println(Ansi.error("No se puede eliminar: el nodo no existe (" + valor + ")."));
                } else {
                    arbol.delete(valor);
                    IO.println(Ansi.success("Eliminado: " + valor));
                }

                operationsMenu(arbol, entrada);
            }
            case 0 -> mainMenu(arbol, entrada);
            default -> {
                IO.println(Ansi.error("Opción inválida."));
                operationsMenu(arbol, entrada);
            }
        }
    }

    private static void traversalsMenu(BinaryTree arbol, Scanner entrada) {
        IO.println();
        IO.println(Ansi.header("--- RECORRIDOS ---"));
        IO.println(Ansi.value("1) Pre-orden"));
        IO.println(Ansi.value("2) In-orden"));
        IO.println(Ansi.value("3) Post-orden"));
        IO.println(Ansi.value("4) Amplitud"));
        IO.println(Ansi.value("0) Volver"));
        IO.print(Ansi.prompt("Elige una opción: "));

        int opcion = readInt(entrada);
        traversalsMenuOption(arbol, entrada, opcion);
    }

    private static void traversalsMenuOption(BinaryTree arbol, Scanner entrada, int opcion) {
        switch (opcion) {
            case 1 -> {
                IO.println(Ansi.section("Pre-orden:"));
                printTraversal(arbol.preOrderString());
                traversalsMenu(arbol, entrada);
            }
            case 2 -> {
                IO.println(Ansi.section("In-orden:"));
                printTraversal(arbol.inOrderString());
                traversalsMenu(arbol, entrada);
            }
            case 3 -> {
                IO.println(Ansi.section("Post-orden:"));
                printTraversal(arbol.postOrderString());
                traversalsMenu(arbol, entrada);
            }
            case 4 -> {
                IO.println(Ansi.section("Amplitud:"));
                printTraversal(arbol.breadthFirstString());
                traversalsMenu(arbol, entrada);
            }
            case 0 -> mainMenu(arbol, entrada);
            default -> {
                IO.println(Ansi.error("Opción inválida."));
                traversalsMenu(arbol, entrada);
            }
        }
    }

    private static void printTraversal(String recorrido) {
        if (recorrido == null || recorrido.isEmpty()) {
            IO.println(Ansi.warning("El árbol está vacío."));
            return;
        }
        IO.println(Ansi.value(recorrido));
    }

    private static void metricsMenu(BinaryTree arbol, Scanner entrada) {
        IO.println();
        IO.println(Ansi.header("--- MÉTRICAS ---"));
        IO.println(Ansi.value("1) Camino a un nodo"));
        IO.println(Ansi.value("2) Profundidad de un nodo"));
        IO.println(Ansi.value("3) Altura del árbol"));
        IO.println(Ansi.value("0) Volver"));
        IO.print(Ansi.prompt("Elige una opción: "));

        int opcion = readInt(entrada);
        metricsMenuOption(arbol, entrada, opcion);
    }

    private static void metricsMenuOption(BinaryTree arbol, Scanner entrada, int opcion) {
        switch (opcion) {
            case 1 -> {
                IO.print(Ansi.prompt("Ingrese el valor para mostrar el camino: "));
                int valor = readInt(entrada);

                String camino = arbol.pathToString(valor);
                IO.println(camino == null
                        ? Ansi.error("No se encontró el nodo: " + valor)
                        : Ansi.success("Camino a " + valor + ": " + camino));

                metricsMenu(arbol, entrada);
            }
            case 2 -> {
                IO.print(Ansi.prompt("Ingrese el valor para calcular profundidad: "));
                int valor = readInt(entrada);

                int prof = arbol.depth(valor);
                IO.println(prof < 0
                        ? Ansi.error("No se encontró el nodo: " + valor)
                        : Ansi.success("Profundidad: " + prof));

                metricsMenu(arbol, entrada);
            }
            case 3 -> {
                int altura = arbol.height();
                IO.println(altura < 0
                        ? Ansi.warning("El árbol está vacío (altura = -1).")
                        : Ansi.success("Altura del árbol: " + altura));

                metricsMenu(arbol, entrada);
            }
            case 0 -> mainMenu(arbol, entrada);
            default -> {
                IO.println(Ansi.error("Opción inválida."));
                metricsMenu(arbol, entrada);
            }
        }
    }

    private static int readInt(Scanner entrada) {
        if (entrada.hasNextInt()) {
            int valor = entrada.nextInt();
            entrada.nextLine();
            return valor;
        }
        entrada.nextLine();
        IO.print(Ansi.error("Entrada inválida, ingrese un entero: "));
        return readInt(entrada);
    }
}
