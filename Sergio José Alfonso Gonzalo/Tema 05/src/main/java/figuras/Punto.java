package figuras;

import java.awt.*;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void desplazar(double x, double y) {
        this.x += x;
        this.y += y;
    }

    void mover(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distancia(Punto punto) {
        return Math.sqrt(Math.pow(punto.x - x, 2) + Math.pow(punto.y - y, 2));
    }

    void moverAlCentro() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int ancho = toolkit.getScreenSize().width;
        int alto = toolkit.getScreenSize().height;
        x = ancho / 2.0;
        y = alto / 2.0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
