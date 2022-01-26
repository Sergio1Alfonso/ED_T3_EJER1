package ejercicios;

public class Primos {
    public static void main(String[] args) {
        int primosTotales = 0;
        int i = 0;

        while (primosTotales < 100) {
            if (Primo.esPrimo(i)) {
                System.out.println(primosTotales + 1 + ": " + i);
                primosTotales++;
            }

            i++;
        }
    }
}
