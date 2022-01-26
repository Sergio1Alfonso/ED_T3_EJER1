package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Areas {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            mostrarMenu();

            switch (pedirEntero("Elige una opción: ")) {
                case 0 -> {
                    return;
                }

                case 1 -> {
                    // Círculo
                    int radio = pedirEntero("Introduce el radio: ");
                    System.out.println("Área es: " + areaCirculo(radio));
                }

                case 2 -> {
                    // Cuadrado
                    int lado = pedirEntero("Introduce el lado: ");
                    System.out.println("Área es: " + areaCuadrado(lado));
                }

                case 3 -> {
                    // Rectángulo
                    int base = pedirEntero("Introduce la base: ");
                    int altura = pedirEntero("Introduce la altura: ");
                    System.out.println("Área es: " + areaRectangulo(base, altura));
                }

                case 4 -> {
                    // Triángulo
                    int base = pedirEntero("Introduce la base: ");
                    int altura = pedirEntero("Introduce la altura: ");
                    System.out.println("Área es: " + areaTriangulo(base, altura));
                }

                default -> System.err.println("Opción no soportada");
            }

            System.out.println();
        }
    }

    public static int pedirEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);

            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                // Soltar un error y limpiar el los tokens no válidos del scanner
                System.err.println("Error, " + scanner.nextLine() + " no es un entero");
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("[1] Círculo");
        System.out.println("[2] Cuadrado");
        System.out.println("[3] Rectángulo");
        System.out.println("[4] Triángulo");
        System.out.println("[0] Salir");
    }

    public static double areaCirculo(int radio) {
        return Math.PI * radio * radio;
    }

    public static double areaCuadrado(int lado) {
        return lado * lado;
    }

    public static double areaRectangulo(int base, int altura) {
        return base * altura;
    }

    public static double areaTriangulo(int base, int altura) {
        return (base * altura) / 2.0;
    }
}
