package ejemplos;

import java.util.Scanner;

public class Ejemplo3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Resultado de la suma: " + sumar(pedirNumero(), pedirNumero()));
    }

    static int pedirNumero() {
        System.out.print("Introduce un número: ");
        return scanner.nextInt();
    }

    static int sumar(int num1, int num2) {
        return num1 + num2;
    }
}
