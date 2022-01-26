package ejemplos;

import java.util.Scanner;

public class Ejemplo2 {
    // Programa que muestre por consola un mensaje de bienvenida
    // introducido por el usuario usando para ello metodos

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        bienvenida1();
        mostrarMensaje(bienvenida2());
    }

    public static void bienvenida1() {
        System.out.print("Introduce el mensaje de bienvenida: ");
        String mensaje = scanner.nextLine();

        System.out.println(mensaje);
    }

    public static String bienvenida2() {
        System.out.print("Introduce el mensaje de bienvenida: ");
        return scanner.nextLine();
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
