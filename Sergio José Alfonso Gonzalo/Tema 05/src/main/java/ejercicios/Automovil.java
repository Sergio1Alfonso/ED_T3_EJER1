package ejercicios;

/**
 * Clase automovil con varios datos y funciones
 */
public class Automovil {
    private final String matricula;
    private final int velocidadMaxima;
    private final double capacidadDeposito;
    private final int capacidad;
    private String marca;
    private String modelo;
    private int potencia;
    private double deposito;
    private boolean arrancado;
    private int velocidad;
    private int personas;

    /**
     * Construye un automovil dados los siguientes datos
     *
     * @param matricula         la matricula que tendra el automovil
     * @param velocidadMaxima   la velocidad maxima que tendra el automovil
     * @param capacidadDeposito la capacidad maxima del depsito que tendra el automovil
     * @param capacidad         la capacidad maxima de personas que tendra el automovil
     */
    public Automovil(String matricula, int velocidadMaxima, double capacidadDeposito, int capacidad) {
        this.matricula = matricula;
        this.velocidadMaxima = velocidadMaxima;
        this.capacidadDeposito = capacidadDeposito;
        this.capacidad = capacidad;
    }

    /**
     * Arranca el automovil si tiene combustible, esta arrancado y hay alguien dentro
     *
     * @return true si ha arrancado el automovil, false si no ha arrancado
     */
    boolean arrancar() {
        if (!arrancado && deposito > 0 && personas > 0) {
            arrancado = true;
            return true;
        }

        return false;
    }

    /**
     * Para el automovil si esta arrancado y parado
     *
     * @return true si ha parado el automovil, false si no ha parado
     */
    boolean parar() {
        if (arrancado && velocidad == 0) {
            arrancado = false;
            return true;
        }

        return false;
    }

    /**
     * Reposta el automovil si no esta arrancado
     *
     * @return la cantidad de combustible repostada
     */
    double repostar() {
        if (!arrancado) {
            double cantidad = capacidadDeposito - deposito;
            deposito = capacidadDeposito;
            return cantidad;
        } else {
            return 0;
        }
    }

    /**
     * Acelera el automovil si esta arrancado, tiene sificiente combustible y no vaya a la velocidad maxima
     *
     * @return true si ha acelerado el automovil, false si no ha acelerado
     */
    boolean acelerar() {
        if (arrancado && deposito >= 0.5 && velocidad < velocidadMaxima) {
            deposito -= 0.5;
            velocidad = Math.min(velocidad + 10, velocidadMaxima);
            return true;
        }

        return false;
    }

    /**
     * Decelera el automovil si no esta quieto
     *
     * @return true si ha decelerado el autmovil, false si no ha decelerado
     */
    boolean decelerar() {
        if (velocidad > 0) {
            velocidad = Math.max(velocidad - 5, 0);
            return true;
        }

        return false;
    }

    /**
     * Mete a una persona en el automovil si no esta lleno y esta parado
     *
     * @return true si ha metido a una persona, false si no la ha metido
     */
    boolean entrar() {
        if (personas < capacidad && velocidad == 0) {
            personas++;
            return true;
        }

        return false;
    }

    /**
     * Saca a una persona del automovil si no esta vacio y esta parado.
     * Si el automovil esta arrancado y sale la ultima persona, por seguridad el automovil se apagara automaticamente
     *
     * @return true si ha sacado a una persona, false si no la ha sacado
     */
    boolean salir() {
        if (personas > 0 && velocidad == 0) {
            personas--;

            if (personas == 0) parar();

            return true;
        }

        return false;
    }

    /**
     * Devuelve la matricula del automovil
     *
     * @return la matricula del automovil
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Devuelve la velocidad maxima del automovil
     *
     * @return la velocidad maxima del automovil
     */
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    /**
     * Devuelve la capacidad maxima del deposito del automovil
     *
     * @return la capacidad maxima del deposito del automovil
     */
    public double getCapacidadDeposito() {
        return capacidadDeposito;
    }

    /**
     * Devuelve la capacidad maxima del automovil
     *
     * @return la capacidad maxima del automovil
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Devuelve la marca del automovil
     *
     * @return la marca del automovil
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Devuelve el modelo del automovil
     *
     * @return el modelo del automovil
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Devuelve la potencia del automovil
     *
     * @return la potencia del automovil
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * Devuelve el deposito del automovil
     *
     * @return el deposito del automovil
     */
    public double getDeposito() {
        return deposito;
    }

    /**
     * Devuelve si el automovil esta arrancado
     *
     * @return si el automovil esta arrancado
     */
    public boolean isArrancado() {
        return arrancado;
    }

    /**
     * Devuelve la velocidad del automovil
     *
     * @return la velocidad del automovil
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * Devuelve las personas que hay en el automovil
     *
     * @return las personas que hay en el automovil
     */
    public int getPersonas() {
        return personas;
    }

    /**
     * Devuelve el automovil en foroma de {@link String} con los datos del deposito, velocidad y capadidad actuales
     *
     * @return una {@link String} con los datos del automovil
     */
    @Override
    public String toString() {
        return "Automovil{" +
                "deposito=" + deposito +
                ", velocidad=" + velocidad +
                ", personas=" + personas +
                '}';
    }
}
