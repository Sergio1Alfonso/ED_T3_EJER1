package ejercicios;

import java.util.Scanner;

public class MCD {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = pedirEnteroPositivo();
        int num2 = pedirEnteroPositivo();

        if (num2 > num1) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("MCD(" + num1 + ", " + num2 + ") = " + mcd(num1, num2));
    }

    /**
     * Pide un número entero positivo por consola
     *
     * @return un número entero positivo
     */
    public static int pedirEnteroPositivo() {
        int n;

        do {
            System.out.print("Introduce un entero positivo: ");
            n = scanner.nextInt();
        } while (n < 0);

        return n;
    }

    /**
     * Calcula el máximo común divisor de dos números enteros positivos
     *
     * @param num1 el primer número entero positivo
     * @param num2 el segundo número entero positivo
     * @return el máximo común divisor
     */
    public static int mcd(int num1, int num2) {
        int a = num1;
        int b = num2;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
