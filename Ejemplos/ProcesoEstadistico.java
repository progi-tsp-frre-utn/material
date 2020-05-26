import java.util.Scanner;

public class ProcesoEstadistico {

    public static void main(String[] args) {

		// Declaro las variables del problema.
        int locales = 4;
        int dias = 5;

		// Creo la matrix y agrego una fila y columna extra
		// para acumular los totales.
        int[][] ventas = new int[dias + 1][locales + 1];

        Scanner s = new Scanner(System.in);

		// Comienzo a iterar solicitando al usuario que especifique
		// el Local, día y monto que quiere acumular.
        for (int i = 0; i < 3; i++) {

            System.out.println("Ingrese el Local");
            int l = s.nextInt();

            System.out.println("Ingrese el dia");
            int d = s.nextInt();

            System.out.println("Ingrese el monto");
            int monto = s.nextInt();

			// Realizo las 4 operaciones para acumular los resultados
			// diarios y los acumuladores.
            ventas[d - 1][l - 1] += monto;
            ventas[d -1][4] += monto;
            ventas[5][l - 1] += monto;
            ventas[5][4] += monto;
        }

		// Imprimo el resultado de la matriz
        for (int y = 0; y < ventas.length; y++) {

            for (int x = 0; x < ventas[y].length; x++) {

                System.out.print(ventas[y][x] + " ");
            }

            System.out.println();
        }
    }
}
