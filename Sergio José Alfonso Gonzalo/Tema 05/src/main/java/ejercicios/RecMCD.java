package ejercicios;

public class RecMCD {
    public static void main(String[] args) {
        System.out.println("Bucle: " + mcdBuc(123, 456));
        System.out.println("Recur: " + mcdRec(123, 456));
    }

    public static int mcdBuc(int a, int b) {
        int resto = a % b;

        while (resto != 0) {
            a = b;
            b = resto;

            resto = a % b;
        }

        return b;
    }

    public static int mcdRec(int a, int b) {
        int resto = a % b;
        if (resto == 0) return b;
        return mcdRec(b, resto);
    }
}
