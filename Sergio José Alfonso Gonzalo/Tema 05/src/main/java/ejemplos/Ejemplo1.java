package ejemplos;

import java.util.Map;
import java.util.TreeMap;

public class Ejemplo1 {
    public static void main(String[] args) {
        Map<Integer, Integer> ocurrencias = new TreeMap<>();

        for (int i = 0; i < 1000; i++) {
            int n = doHickey(i);

            ocurrencias.putIfAbsent(n, 0);
            ocurrencias.put(n, ocurrencias.get(n) + 1);
        }

        for (int n : ocurrencias.keySet()) System.out.println(n + ": " + ocurrencias.get(n));
    }

    public static int doHickey(int n) {
        n += Math.random() * n;
        n -= Math.random() * n;
        n *= Math.random() * n;
        n /= Math.random() * n;
        n %= Math.random() * n;
        return n;
    }
}
