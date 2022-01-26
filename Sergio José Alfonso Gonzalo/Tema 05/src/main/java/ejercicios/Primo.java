package ejercicios;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();

        if (esPrimo(n)) System.out.println(n + " es primo");
        else System.out.println(n + " no es primo");
    }

    public static boolean esPrimo(int num) {
        if (num < 2) return false;

        for (int i = 2; i < num; i++)  {
            if (num % i == 0) return false;
        }

        return true;
    }
}
