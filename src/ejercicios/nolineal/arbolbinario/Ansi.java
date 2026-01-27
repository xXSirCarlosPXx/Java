package ejercicios.nolineal.arbolbinario;

public class Ansi {
    private static final String ESC = "\u001B[";
    public static final String RESET = ESC + "0m";
    public static final String BOLD  = ESC + "1m";

    public static String fg256(int n) {
        return ESC + "38;5;" + n + "m";
    }

    public static String bg256(int n) {
        return ESC + "48;5;" + n + "m";
    }

    private static String paint(String prefix, String text) {
        return prefix + text + RESET;
    }

    public static String title(String text) {
        return paint(BOLD + bg256(17) + fg256(231), text);
    }

    public static String header(String text) {
        return paint(BOLD + bg256(53) + fg256(231), text);
    }

    public static String section(String text) {
        return paint(BOLD + bg256(24) + fg256(231), text);
    }

    public static String prompt(String text) {
        return paint(BOLD + bg256(236) + fg256(214), text);
    }

    public static String success(String text) {
        return paint(BOLD + bg256(22) + fg256(231), text);
    }

    public static String error(String text) {
        return paint(BOLD + bg256(52) + fg256(231), text);
    }

    public static String warning(String text) {
        return paint(BOLD + bg256(94) + fg256(232), text);
    }

    public static String value(String text) {
        return paint(bg256(235) + fg256(231), text);
    }
}
