package ejercicios.movimiento;

import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jugador jugador = new Jugador(2, 2, 5, 5); // Empieza en (2,2) en un área de 5x5

        while (true) {
            jugador.mostrarPosicion();
            System.out.print("Introduce un movimiento (arriba, abajo, izquierda, derecha, salir): ");
            String movimiento = scanner.nextLine();

            if (movimiento.equalsIgnoreCase("salir")) {
                System.out.println("¡Juego terminado!");
                break;
            }

            jugador.mover(movimiento);
        }
        scanner.close();
    }
}