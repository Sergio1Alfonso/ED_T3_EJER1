package ejercicios;

public class RecProducto {
    public static void main(String[] args) {
        System.out.println("Bucle: " + prodBuc(5, 4));
        System.out.println("Recur: " + prodRec(5, 4));
    }

    public static int prodBuc(int a, int b) {
        int sum = 0;
        for (int i = 0; i < b; i++) sum += a;
        return sum;
    }

    public static int prodRec(int a, int b) {
        if (b == 0) return 0;
        return a + prodRec(a, b - 1);
    }
}
