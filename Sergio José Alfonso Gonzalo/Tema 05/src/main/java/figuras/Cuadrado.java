package figuras;

public class Cuadrado {
    private Punto posicion;
    private double lado;

    public Cuadrado(double lado) {
        this.posicion = new Punto(0, 0);
        this.lado = lado;
    }

    void desplazar(double x, double y) {
        posicion.desplazar(x, y);
    }

    void mover(Punto punto) {
        posicion.mover(punto.getX(), punto.getY());
    }

    double perimetro() {
        return 4 * lado;
    }

    double area() {
        return lado * lado;
    }

    double diagonal() {
        return Math.sqrt(2 * lado * lado);
    }

    public Punto getPosicion() {
        return posicion;
    }

    public void setPosicion(Punto posicion) {
        this.posicion = posicion;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "posicion=" + posicion +
                ", lado=" + lado +
                '}';
    }
}
