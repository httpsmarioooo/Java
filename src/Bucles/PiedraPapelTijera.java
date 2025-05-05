package Bucles;
import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera {

    public static void juego(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int puntosJugador = 0;
        int puntosComputadora = 0;

        while (puntosJugador <= 3 && puntosComputadora <= 3){
            System.out.println("¡Bienvenido a Piedra, Papel o Tijera!");
            String jugador = scanner.nextLine().toLowerCase();

            if (!jugador.equals("piedra") && !jugador.equals("papel") && !jugador.equals("tijera")) {
                System.out.println("Opción no válida.");
                return;
            }

            String[] opciones = {"piedra", "papel", "tijera"};
            String computadora = opciones[random.nextInt(3)];
            System.out.println("La computadora eligió: " + computadora);

            if (jugador.equals(computadora)) {
                System.out.println("¡Empate!");
            } else if (
                    (jugador.equals("piedra") && computadora.equals("tijera")) ||
                            (jugador.equals("papel") && computadora.equals("piedra")) ||
                            (jugador.equals("tijera") && computadora.equals("papel"))
            ) {
                System.out.println("¡Ganaste!");
                puntosJugador ++;
            } else {
                System.out.println("¡Perdiste!");
                puntosComputadora ++;
            }

            System.out.println("¡Puntaje tuyo: !" + puntosJugador + "Puntos computadora: " +puntosComputadora);
        }

        if(puntosJugador == 3){
            System.out.println("Felicidades");
        } else {
            System.out.print("Lo siento");
        }
    }

}
