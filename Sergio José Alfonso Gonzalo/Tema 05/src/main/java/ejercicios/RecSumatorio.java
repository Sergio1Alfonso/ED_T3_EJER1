package ejercicios;

public class RecSumatorio {
    public static void main(String[] args) {
        System.out.println("Bucle: " + sumatorioBuc(5));
        System.out.println("Recur: " + sumatorioRec(5));
    }

    public static int sumatorioBuc(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) sum += i;
        return sum;
    }

    public static int sumatorioRec(int n) {
        if (n == 0) return 0;
        return n + sumatorioRec(n - 1);
    }
}
