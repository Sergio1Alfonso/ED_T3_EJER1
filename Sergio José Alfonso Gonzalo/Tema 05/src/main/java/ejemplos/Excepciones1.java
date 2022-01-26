package ejemplos;

public class Excepciones1 {
    public static void main(String[] args) throws Exception {
        int x = (int) (Math.random() * 5);
        int y = (int) (Math.random() * 10);
        int[] z = new int[5];

        try {
            System.out.println("x/y da " + x / y);
            System.out.println("y es " + y + " z[y] es " + z[y]);
        } catch (ArithmeticException ae) {
            System.out.println("Problema aritmético: " + ae);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Problema de índice: " + aioobe);
        } finally {
            System.out.println("Bloque finally");
        }

        System.out.println("Continua la ejecución normalmente");
    }
}
