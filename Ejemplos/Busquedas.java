import java.util.Scanner;

public class Busquedas {

    public static void main(String[] args) {

        // define un arreglo
        int[] arregloDesordenado = new int[] { 1, 12, 44, 56, 3, 67, 5, 7, 0, 99};
        int[] arregloOrdenado = new int[] { 0, 1, 3, 5, 7, 12, 44, 56, 67, 99};
        int valorBuscado = 7;

        System.out.println("------");

        //// Búsqueda Secuencial o Lineal
        imprimirArreglo(arregloDesordenado);
        int resultadoBusquedaLineal = busquedaLineal(arregloDesordenado, valorBuscado);
        imprimirResultadoBusqueda(resultadoBusquedaLineal);
        System.out.println("--- fin búsqueda lineal ---");

        //// Búsqueda Secuencial o Lineal con Centinela
        imprimirArreglo(arregloDesordenado);
        int resultadoBusquedaConCentinela = busquedaLinealCentinela(arregloDesordenado, valorBuscado);
        imprimirResultadoBusqueda(resultadoBusquedaConCentinela);
        System.out.println("--- fin búsqueda lineal con centinela ---");

        //// Búsqueda Binaria
        imprimirArreglo(arregloOrdenado);
        int resultadoBusquedaBinaria = busquedaBinaria(arregloOrdenado, valorBuscado);
        imprimirResultadoBusqueda(resultadoBusquedaBinaria);
        System.out.println("--- fin búsqueda binaria ---");

        //// Búsqueda Secuencial o Lineal de Strings
        Scanner sc = new Scanner(System.in);
        String[] arregloString = new String[] { "hola", "mundo", "como", "estas", "hoy" };
        imprimirArreglo(arregloString);
        System.out.println("Ingrese el valor a buscar");
        String valorBuscadoString = sc.next();
        int resultadoBusquedaLinealString = busquedaLinealStrings(arregloString, valorBuscadoString);
        imprimirResultadoBusqueda(resultadoBusquedaLinealString);
    }

    /* Método de Búsqueda Secuencial o Lineal */
    private static int busquedaLineal(int[] arreglo, int valor) {

        int i = 0;
        int pos = -1;

        while(i < arreglo.length) {
            if (arreglo[i] == valor) {
                pos = i;
                System.out.println("Se encuentra en: " + pos);
            }
            i++;
            System.out.println("Nro iteraciones: " + i);
        }

        return pos;
    }

    /* Método de Búsqueda Secuencial o Lineal con Centinela */
    private static int busquedaLinealCentinela(int[] arreglo, int valor) {

        int i = 0;

        while(i < arreglo.length && arreglo[i] != valor) {
            i++;
            System.out.println("Nro iteraciones: " + i);
        }

        if (i < arreglo.length)
            return i;

        return -1;
    }

    /* Ejemplo de Método de Búsqueda Secuencial o Lineal adaptado con For y Return */
    private static int busquedaLinealCustom(int[] arreglo, int valor){

        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] == valor){
                System.out.println("nro iteraciones: " + i);
                return i;
            }
        }

        return -1;
    }

    /* Método de Búsqueda Binaria */
    private static int busquedaBinaria(int[] arreglo, int valor) {
        int min = 0;
        int max = arreglo.length - 1;
        int medio = 0;

        boolean encontrado = false;

        while (min <= max && !encontrado)
        {
            medio = (min + max) / 2;
            if (arreglo[medio] == valor)
                encontrado = true;
            else
            {
                if (arreglo[medio] > valor)
                    max = medio - 1;
                else
                    min = medio + 1;
            }
        }
        if (!encontrado)
            return -1;

        return medio;
    }

    /* Método de Búsqueda Secuencial o Lineal con Strings */
    private static int busquedaLinealStrings(String[] arreglo, String valor) {

        int i = 0;
        int pos = -1;

        while(i < arreglo.length) {

            String valorArreglo = arreglo[i];

            // utilizo .equals para comparar strings
            if (valorArreglo.equals(valor)) {
                pos = i;
                System.out.println("Se encuentra en: " + pos);
            }
            i++;
        }

        return pos;
    }

    /* Método de ayuda para imprimir resultado de las búsquedas */
    public static void imprimirResultadoBusqueda(int resultado){

        if (resultado != -1){
            System.out.println("El valor buscado se encuentra en la posición: " + resultado);
        }
        else {
            System.out.println("No se encontró el valor");
        }
    }

    /* Método de ayuda para imprimir resultado de las búsquedas con strings */
    public static void imprimirArreglo(String[] arreglo){

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    /* Método de ayuda para imprimir resultado de las búsquedas con enteros */
    public static void imprimirArreglo(int[] arreglo){

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}