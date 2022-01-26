package ejercicios;

public class PruebaMetodos {
    public static void main(String[] args) {
        System.out.println("toFarenheit:");
        System.out.println(toFarenheit(0.0)); // 32.0
        System.out.println(toFarenheit(25.0)); // 77.0
        System.out.println(toFarenheit(50.0)); // 122.0

        System.out.println("\ndivisorMasGrande:");
        System.out.println(divisorMasGrande(25)); // 5
        System.out.println(divisorMasGrande(39)); // 13
        System.out.println(divisorMasGrande(123)); // 41

        System.out.println("\npar");
        System.out.println(par(43)); // false
        System.out.println(par(58)); // true
        System.out.println(par(2)); // true
    }

    public static double toFarenheit(double c) {
        return 1.8 * c + 32; // 9 / 5 = 1,8
    }

    public static int divisorMasGrande(int n) {
        for (int i = n - 1; i > 0; i--) {
            if (n % i == 0) return i;
        }

        return 1;
    }

    public static boolean par(int n) {
        return n % 2 == 0;
    }
}
