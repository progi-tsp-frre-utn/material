package programacioni;

import java.util.Scanner;

public class Arreglos {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //declaro indice
        System.out.println("Ingresa la cantidad de ventas");

        int dimension = s.nextInt();
        double total = 0;

        // declaro arreglo
        double[] ventas = new double[dimension];
        String[] productos = new String[dimension];


        // cargo arreglo con valores
        for (int i = 0; i < dimension; i++) {
            System.out.println("Ingrese el producto");
            productos[i] = s.next();

            System.out.println("Ingrese el monto de la venta");
            ventas[i] = s.nextDouble();

            total = total + ventas[i];
        }


        /*
        ventas[0] = 100.0;
        ventas[1] = 200.0;
        ventas[2] = 300.0;
        ventas[3] = 350.0;
        ventas[4] = 900.0;

        productos[0] = "Leche";
        productos[1] = "Manteca";
        productos[2] = "Mermelada";
        productos[3] = "Te";
        productos[4] = "Azucar";
        */
        /*
        System.out.println(ventas[0]);
        System.out.println(ventas[1]);
        System.out.println(ventas[2]);
        System.out.println(ventas[3]);
        System.out.println(ventas[4]);
        */

        for (int i = 0; i < dimension; i++) {
            System.out.println("El producto: " + productos[i] + " se vendió: " + ventas[i]);
        }

        System.out.println("Total es: " + total);

    }
}
