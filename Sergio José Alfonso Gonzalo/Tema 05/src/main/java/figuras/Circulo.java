package figuras;

public class Circulo {
    private Punto posicion;
    private double radio;

    public Circulo(double radio) {
        this.posicion = new Punto(0, 0);
        this.radio = radio;
    }

    void desplazar(double x, double y) {
        posicion.desplazar(x, y);
    }

    void mover(Punto punto) {
        posicion.mover(punto.getX(), punto.getY());
    }

    double perimetro() {
        return 2 * Math.PI * radio;
    }

    double area() {
        return Math.PI * radio * radio;
    }

    public Punto getPosicion() {
        return posicion;
    }

    public void setPosicion(Punto posicion) {
        this.posicion = posicion;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "posicion=" + posicion +
                ", radio=" + radio +
                '}';
    }
}
