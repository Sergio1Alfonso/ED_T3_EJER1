package figuras;

public class Triangulo {
    private Punto posicion;
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
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
        double hipotenusa = Math.sqrt(altura * altura + Math.pow(base / 2.0, 2));
        return base + 2 * hipotenusa;
    }

    double area() {
        return (base * altura) / 2;
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
        return "Triangulo{" +
                "posicion=" + posicion +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}
