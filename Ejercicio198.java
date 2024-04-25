import java.util.Random;
import java.util.Scanner;


public class Ejercicio198 {
    private static final int TAMANO = 9;
    private static final int SUBTAMANO = 3;
    private static final int VACIO = 0;
    private static int[][] tablero = new int[TAMANO][TAMANO];

    public static void main(String[] args) {
        generarSudoku();
        imprimirTablero();

        Scanner scanner = new Scanner(System.in);
        while (!sudokuResuelto()) {
            System.out.print("Ingrese la fila (1-9): ");
            int fila = scanner.nextInt() - 1;
            System.out.print("Ingrese la columna (1-9): ");
            int columna = scanner.nextInt() - 1;
            System.out.print("Ingrese el número (1-9): ");
            int numero = scanner.nextInt();

            if (validarMovimiento(fila, columna, numero)) {
                tablero[fila][columna] = numero;
                imprimirTablero();
            } else {
                System.out.println("Movimiento inválido. Intente de nuevo.");
            }
        }
        System.out.println("¡Felicidades! Has completado el Sudoku.");
        scanner.close();
    }

    private static void generarSudoku() {
        Random random = new Random();
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                tablero[i][j] = random.nextInt(9) + 1;
            }
        }
    }

    private static void imprimirTablero() {
        System.out.println("-------------------------");
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                System.out.print(tablero[i][j] + " ");
                if ((j + 1) % SUBTAMANO == 0) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if ((i + 1) % SUBTAMANO == 0) {
                System.out.println("-------------------------");
            }
        }
    }

    private static boolean validarMovimiento(int fila, int columna, int numero) {
        return validarFila(fila, numero) && validarColumna(columna, numero) && validarSector(fila, columna, numero);
    }

    private static boolean validarFila(int fila, int numero) {
        for (int j = 0; j < TAMANO; j++) {
            if (tablero[fila][j] == numero) {
                return false;
            }
        }
        return true;
    }

    private static boolean validarColumna(int columna, int numero) {
        for (int i = 0; i < TAMANO; i++) {
            if (tablero[i][columna] == numero) {
                return false;
            }
        }
        return true;
    }

    private static boolean validarSector(int fila, int columna, int numero) {
        int filaInicio = fila - fila % SUBTAMANO;
        int columnaInicio = columna - columna % SUBTAMANO;
        for (int i = filaInicio; i < filaInicio + SUBTAMANO; i++) {
            for (int j = columnaInicio; j < columnaInicio + SUBTAMANO; j++) {
                if (tablero[i][j] == numero) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean sudokuResuelto() {
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                if (tablero[i][j] == VACIO) {
                    return false;
                }
            }
        }
        return true;
    }
}

