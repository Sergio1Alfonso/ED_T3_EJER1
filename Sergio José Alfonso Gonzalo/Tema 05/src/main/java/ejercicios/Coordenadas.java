package ejercicios;

import java.util.Scanner;

public class Coordenadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el radio: ");
        double radio = scanner.nextDouble();
        System.out.print("Introduce el ángulo: ");
        double angulo = scanner.nextDouble();

        double[] coords = pol2rec(radio, angulo);
        System.out.println(coords[0] + ", " + coords[1]);
    }

    public static double[] pol2rec(double radio, double angulo) {
        double x = radio * Math.cos(Math.toRadians(angulo));
        double y = radio * Math.sin(Math.toRadians(angulo));

        return new double[]{x, y};
    }
}
