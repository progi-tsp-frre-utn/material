import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        // Matrz
        int[][] matriz = new int[5][5];

        // 5 x 5
        // 0,0 ........ 0,4
        // 0,1
        // 0,2
        // 0,3
        // 0,4 ........ 4,4

		// Asigno valores a la matriz.
        matriz[0][0] = 99;
        matriz[3][2] = 100;

        // Estructuras Repetitivas
        Scanner s = new Scanner(System.in);
       
        // carga valores en la matriz
        for(int y = 0; y < 5; y++){
            // filas
            for(int x = 0; x < 5; x++){
                // columnas
                System.out.println("Ingrese el valor para la posicion [" + y + "][" + x + "]");
                matriz[y][x] = s.nextInt();
            }
        }

        // imprime valores de la matriz
        for(int y = 0; y < 2; y++){
            // filas
            for(int x = 0; x < 2; x++){
                // columnas
                int v = matriz[y][x];

                System.out.print(v + " ");
                //System.out.println("Valor en [" + y + "][" + x + "] = " + v);
            }

            System.out.println();
        }
    }
}


















