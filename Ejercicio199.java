import java.util.Scanner;

public class Ejercicio199 {
    private static final int TAMANO_TABLERO = 8;
    private static char[][] tablero = new char[TAMANO_TABLERO][TAMANO_TABLERO];
    private static int puntosJugador1 = 0;
    private static int puntosJugador2 = 0;

    public static void main(String[] args) {
        inicializarTablero();
        imprimirTablero();

        Scanner scanner = new Scanner(System.in);
        int jugadorActual = 1;

        while (true) {
            System.out.println("Turno del jugador " + jugadorActual);
            System.out.print("Ingrese la fila (1-8): ");
            int fila = scanner.nextInt() - 1;
            System.out.print("Ingrese la columna (1-8): ");
            int columna = scanner.nextInt() - 1;

            if (movimientoValido(fila, columna, jugadorActual)) {
                mover(fila, columna, jugadorActual);
                imprimirTablero();
                cambiarTurno();
            } else {
                System.out.println("Movimiento inválido. Intente de nuevo.");
            }

            if (finDelJuego()) {
                break;
            }
        }

        scanner.close();
        System.out.println("Fin del juego. Puntos del jugador 1: " + puntosJugador1 + ", Puntos del jugador 2: " + puntosJugador2);
    }

    private static void inicializarTablero() {
        for (int i = 0; i < TAMANO_TABLERO; i++) {
            for (int j = 0; j < TAMANO_TABLERO; j++) {
                tablero[i][j] = '-';
            }
        }
        // Inicializar peones
        for (int i = 0; i < TAMANO_TABLERO; i++) {
            tablero[1][i] = 'P';
            tablero[TAMANO_TABLERO - 2][i] = 'p';
        }
    }

    private static void imprimirTablero() {
        System.out.println("  a b c d e f g h");
        for (int i = 0; i < TAMANO_TABLERO; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < TAMANO_TABLERO; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean movimientoValido(int fila, int columna, int jugadorActual) {
        if (fila < 0 || fila >= TAMANO_TABLERO || columna < 0 || columna >= TAMANO_TABLERO) {
            return false;
        }
        char pieza = tablero[fila][columna];
        if (jugadorActual == 1 && (pieza != 'P')) {
            return false;
        }
        if (jugadorActual == 2 && (pieza != 'p')) {
            return false;
        }
        return true;
    }

    private static void mover(int fila, int columna, int jugadorActual) {
        char pieza = tablero[fila][columna];
        tablero[fila][columna] = '-';
        if (jugadorActual == 1) {
            if (fila + 1 < TAMANO_TABLERO) {
                if (tablero[fila + 1][columna] == 'p') {
                    puntosJugador1++;
                }
            }
            tablero[fila + 1][columna] = pieza;
        } else {
            if (fila - 1 >= 0) {
                if (tablero[fila - 1][columna] == 'P') {
                    puntosJugador2++;
                }
            }
            tablero[fila - 1][columna] = pieza;
        }
    }

    private static void cambiarTurno() {
        if (puntosJugador1 >= 8 || puntosJugador2 >= 8) {
            return;
        }
        if (puntosJugador1 > puntosJugador2) {
            System.out.println("Turno del jugador 2");
        } else {
            System.out.println("Turno del jugador 1");
        }
    }

    private static boolean finDelJuego() {
        return puntosJugador1 >= 8 || puntosJugador2 >= 8;
    }
}

