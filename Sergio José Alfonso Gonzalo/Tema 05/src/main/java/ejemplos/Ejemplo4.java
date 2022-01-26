package ejemplos;

import java.util.Scanner;

public class Ejemplo4 {
    static Scanner scanner = new Scanner(System.in);
    static final String MENSAJE_ERROR = "Error: opción no soportada";

    public static void main(String[] args) {
        while (true) {
            mostrarMenu();
            char opcion = pedirOpcion();

            if (!validar(opcion)) {
                System.err.println(MENSAJE_ERROR);
                continue;
            }

            if (opcion == '0') {
                System.out.println("Adios");
                return;
            }

            mostrarMensaje(opcion);
        }
    }

    static void mostrarMenu() {
        System.out.println("[1] Opción A");
        System.out.println("[2] Opción B");
        System.out.println("[3] Opción C");
        System.out.println("[0] Salir");
    }

    static char pedirOpcion() {
        System.out.print("Elige: ");
        return scanner.next().charAt(0);
    }

    static boolean validar(char opcion) {
        return String.valueOf(opcion).matches("[0123]");
    }

    static void mostrarMensaje(char opcion) {
        System.out.println("Has introducido la opción: " + opcion);
    }
}
