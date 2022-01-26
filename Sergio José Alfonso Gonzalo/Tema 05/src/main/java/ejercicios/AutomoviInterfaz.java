package ejercicios;

import java.util.Scanner;

/**
 * Clase que permite controlar un automovil y genera mensajes de error amigables
 */
public class AutomoviInterfaz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Automovil automovil = generarAutomovil();
        System.out.println(automovil + " " + automovil.getMatricula());

        while (true) {
            mostrarMenu();
            char orden = scanner.next().charAt(0);

            switch (orden) {
                case '1' -> {
                    if (automovil.arrancar()) System.out.println("Se ha arrancado el automovil");
                    else {
                        if (automovil.isArrancado()) System.err.println("No se ha podido arrancar el automovil porque ya esta arrancado");
                        if (automovil.getDeposito() <= 0) System.err.println("No se ha podido arrancar el automovil porque no tiene combustible");
                        if (automovil.getPersonas() <= 0) System.err.println("No se ha podido arrancar el automovil porque no hay nadie dentro");
                    }
                }
                case '2' -> {
                    if (automovil.parar()) System.out.println("Se ha apagado el automovil");
                    else {
                        if (!automovil.isArrancado()) System.err.println("No se ha podido apagar el automovil porque ya esta apagado");
                        if (automovil.getVelocidad() > 0) System.err.println("No se ha podido apagar el automovil porque no esta parado");
                    }
                }
                case '3' -> {
                    double litrosRepostados = automovil.repostar();

                    if (litrosRepostados > 0) System.out.println("Se han repostado " + litrosRepostados + " litros de combustible");
                    else {
                        if (automovil.isArrancado()) System.err.println("No se ha podido repostar porque el automovil esta arrancado");
                        if (automovil.getDeposito() == automovil.getCapacidadDeposito()) System.err.println("No se ha podido repostar porque el deposito ya esta lleno");
                    }
                }
                case '4' -> {
                    if (automovil.acelerar()) System.out.println("El automovil ha acelerado");
                    else {
                        if (!automovil.isArrancado()) System.err.println("No se ha podido acelerar porque el automovil esta apagado");
                        if (automovil.getDeposito() < 0.5) System.err.println("No se ha podido acelerar porque el automovil no tiene suficiente combustible");
                        if (automovil.getVelocidad() >= automovil.getVelocidadMaxima()) System.err.println("No se ha podido acelerar porque el automovil ya va a la velocidad maxima");
                    }
                }
                case '5' -> {
                    if (automovil.decelerar()) System.out.println("El automovil ha frenado");
                    else {
                        if (automovil.getVelocidad() == 0) System.err.println("No se ha podido frenar porque el automovil ya esta parado");
                    }
                }
                case '6' -> {
                    if (automovil.entrar()) System.out.println("Ha entrado una persona al automovil");
                    else {
                        if (automovil.getPersonas() >= 5) System.err.println("No ha podido entrar una persona porque el automovil ya esta lleno");
                        if (automovil.getVelocidad() > 0) System.err.println("No ha podido entrar una persona porque el automovil no esta parado");
                    }
                }
                case '7' -> {
                    if (automovil.salir()) System.out.println("Ha salido una persona del automovil");
                    else {

                        if (automovil.getPersonas() <= 0) System.err.println("No ha podido salir una persona porque el automovil ya esta vacio");
                        if (automovil.getVelocidad() > 0) System.err.println("No ha podido salir una persona porque el automovil no esta parado");
                    }
                }
            }

            System.out.println(automovil);
        }
    }

    /**
     * Genera un automovil
     *
     * @return el automovil generado
     */
    static Automovil generarAutomovil() {
        return new Automovil(generarMatricula(), 120, 50, 5);
    }

    /**
     * Genera una matricula para un automovil
     *
     * @return la matricula generada
     */
    static String generarMatricula() {
        String letrasValidas = "BCDFGHJKLMNPRSTVWXYZ";
        String matricula = "";

        // Generar el numero de la matricula
        matricula += (int) (Math.random() * 10);
        matricula += (int) (Math.random() * 10);
        matricula += (int) (Math.random() * 10);
        matricula += (int) (Math.random() * 10);
        matricula += " ";

        // Generar las letras de la matricula
        matricula += letrasValidas.charAt((int) (Math.random() * letrasValidas.length()));
        matricula += letrasValidas.charAt((int) (Math.random() * letrasValidas.length()));
        matricula += letrasValidas.charAt((int) (Math.random() * letrasValidas.length()));

        return matricula;
    }

    /**
     * Muestra el menu de interaccion del automovil
     */
    static void mostrarMenu() {
        System.out.println("Menu del automovil:");
        System.out.println("[1] Arrancar el automovil");
        System.out.println("[2] Parar el automovil");
        System.out.println("[3] Repostar el automovil");
        System.out.println("[4] Acelerar el automovil");
        System.out.println("[5] Decelerar el automovil");
        System.out.println("[6] Meter una persona al automovil");
        System.out.println("[7] Sacar una persona del automovil");
    }
}
