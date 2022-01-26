package figuras;

public class Figuras {
    static Circulo circulo = new Circulo(Math.random() * 10 + 1);
    static Rectangulo rectangulo = new Rectangulo(Math.random() * 10 + 1, Math.random() * 10 + 1);
    static Cuadrado cuadrado = new Cuadrado(Math.random() * 10 + 1);
    static Triangulo triangulo = new Triangulo(Math.random() * 10 + 1, Math.random() * 10 + 1);
    static Punto punto = new Punto(Math.random() * 10 + 1, Math.random() * 10 + 1);

    public static void main(String[] args) {
        System.out.println(circulo);
        System.out.println("Perímetro: " + circulo.perimetro());
        System.out.println("Área: " + circulo.area());
        System.out.println();

        System.out.println(rectangulo);
        System.out.println("Perímetro: " + rectangulo.perimetro());
        System.out.println("Área: " + rectangulo.area());
        System.out.println("Diagonal: " + rectangulo.diagonal());
        System.out.println();

        System.out.println(cuadrado);
        System.out.println("Perímetro: " + cuadrado.perimetro());
        System.out.println("Área: " + cuadrado.area());
        System.out.println("Diagonal: " + cuadrado.diagonal());
        System.out.println();

        System.out.println(triangulo);
        System.out.println("Perímetro: " + triangulo.perimetro());
        System.out.println("Área: " + triangulo.area());
        System.out.println();

        System.out.println(punto);
        punto.moverAlCentro();
        System.out.println(punto);
    }
}
