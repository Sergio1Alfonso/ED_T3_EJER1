package figuras;

public class Rectangulo {
    private Punto posicion;
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.posicion = new Punto(0, 0);
        this.base = base;
        this.altura = altura;
    }

    void desplazar(double x, double y) {
        posicion.desplazar(x, y);
    }

    void mover(Punto punto) {
        posicion.mover(punto.getX(), punto.getY());
    }

    double perimetro() {
        return 2 * base + 2 * altura;
    }

    double area() {
        return base * altura;
    }

    double diagonal() {
        return Math.sqrt(base * base + altura * altura);
    }

    public Punto getPosicion() {
        return posicion;
    }

    public void setPosicion(Punto posicion) {
        this.posicion = posicion;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "posicion=" + posicion +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}
