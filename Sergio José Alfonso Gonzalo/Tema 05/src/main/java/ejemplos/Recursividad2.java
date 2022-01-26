package ejemplos;

public class Recursividad2 {
    public static void main(String[] args) {
        System.out.println("Bucle: " + factorialBuc(16));
        System.out.println("Recur: " + factorialRec(16));
    }

    public static int factorialBuc(int n) {
        int fac = 1;
        for (int i = 2; i <= n; i++) fac *= i;
        return fac;
    }

    public static int factorialRec(int n) {
        if (n == 0) return 1;
        return n * factorialRec(n - 1);
    }
}
