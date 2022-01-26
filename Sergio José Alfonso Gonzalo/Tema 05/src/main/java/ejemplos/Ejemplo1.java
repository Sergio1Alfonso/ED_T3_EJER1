package ejemplos;

import java.util.Map;
import java.util.TreeMap;

/**
 * Primer ejemplo del uso de map
 */
public class Ejemplo1 {
    public static void main(String[] args) {
        // Crear un TreeMap con clave y dato de tipo Integer
        Map<Integer, Integer> ocurrencias = new TreeMap<>();

        // Añadir 1000 números aleatorios con la función doHickey y añadirlo al mapa
        for (int i = 0; i < 1000; i++) {
            int n = doHickey(i);

            ocurrencias.putIfAbsent(n, 0);
            ocurrencias.put(n, ocurrencias.get(n) + 1);
        }

        // Contar el número de veces que aparece cada número y mostrarlo por consola
        for (int n : ocurrencias.keySet()) System.out.println(n + ": " + ocurrencias.get(n));
    }

    /**
     * Generar un número pseudo-aleatorio positivo con una distribución
     * cercana a 0 dado otro número preferiblemente de forma secuencial
     *
     * @param n parametro que recibe como número (da igual el número que sea pero se recomienda que sea secuencial)
     * @return un número pseudo-aleatorio positivo con una distribución cercana a 0
     */
    public static int doHickey(int n) {
        n += Math.random() * n;
        n -= Math.random() * n;
        n *= Math.random() * n;
        n /= Math.random() * n;
        n %= Math.random() * n;
        return n;
    }
}
