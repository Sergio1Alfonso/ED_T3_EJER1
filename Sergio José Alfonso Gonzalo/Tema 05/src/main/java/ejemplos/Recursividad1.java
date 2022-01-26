package ejemplos;

public class Recursividad1 {
    public static void main(String[] args) {
        imprimir(0);
    }

    /**
     * Muestra por consola números enteros hasta 1000
     *
     * @param i el primer número entero a mostrar por consola
     */
    public static void imprimir(int i) {
        if (i == 1000) return;

        System.out.println(i);
        imprimir(++i);
    }
}
