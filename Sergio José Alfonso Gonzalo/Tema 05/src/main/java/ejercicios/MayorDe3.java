package ejercicios;

import java.util.Scanner;

public class MayorDe3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = pedirEntero();
        int b = pedirEntero();
        int c = pedirEntero();

        System.out.println("El mayor de " + a + ", " + b + ", " + c + " es " + elMayor(a, b, c));
    }

    public static int pedirEntero() {
        System.out.print("Introduce un número entero: ");
        return scanner.nextInt();
    }

    public static int elMayor(int a, int b, int c) {
        int maxAB = elMayor(a, b);
        int maxBC = elMayor(b, c);

        return elMayor(maxAB, maxBC);
    }

    public static int elMayor(int a, int b) {
        return Math.max(a, b);
    }
}
