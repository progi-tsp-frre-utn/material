public class Ordenamiento {

    public static void main(String[] args) {
	
		// Creo un arreglo inicial para probar los algoritmos de búsqueda.
        int[] arreglo = { 5, 6, 99, 1, 0, 3 };

		// Imprime el arreglo original
        imprimirArreglo(arreglo);
        System.out.println("----");

		// Cada algoritmo es un método que recibe como parámetro el arreglo
		// y lo ordena, imprimiendo cada paso que realiza.
        burbuja(arreglo);
        insercion(arreglo);
        seleccion(arreglo);
    }

    static void burbuja(int[] arreglo) {

        int aux = -1;

        for (int i = 1; i <= arreglo.length; i++) {

            for (int j = 0; j< arreglo.length - 1; j++) {

                if (arreglo[j] > arreglo[j+1]) {

                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }

				// Imprimo el contenido del arreglo
                imprimirArreglo(arreglo);
            }
        }

    }

    static void insercion(int[] arreglo){

        int aux = -1;
        int j;

        // recorre el arreglo desordenado
        for (int i = 1; i < arreglo.length; i++)
        {
            aux = arreglo[i];

            j = i - 1;

            // Mueve los elementos del arreglo [0..i-1] que
            // sean mayores al 'aux', una posicion adelante
            // de su posicion actual.
            while (j >= 0 && arreglo[j] > aux)
            {
                arreglo[j + 1] = arreglo[j];
                j--;

				// Imprimo el contenido del arreglo
				// ya que se realizan cambios en sus valores
                imprimirArreglo(arreglo);
            }

            arreglo[j + 1] = aux;

			// Imprimo el contenido del arreglo
            imprimirArreglo(arreglo);
        }

    }

    static void seleccion(int[] arreglo){

        int aux1;
        int aux2;

        // recorre el arreglo desordenado
        for(int i = 0; i < arreglo.length - 1; i++)
        {
            aux1 = i;

            // encuentra el minimo valor dentro del arreglo desordenado
            for(int j = i + 1; j < arreglo.length; j++)
            {
                if(arreglo[j] < arreglo[aux1])
                {
                    aux1 = j;
                }
            }

            // intercambia el minimo valor encontrado
            // con el primer objeto de la lista
            if(aux1 != i)
            {
                aux2 = arreglo[aux1];
                arreglo[aux1] = arreglo[i];
                arreglo[i] = aux2;
            }

			// Imprimo el contenido del arreglo
            imprimirArreglo(arreglo);
        }
    }

    static void imprimirArreglo(int[] arreglo){
		// Método utilizado para imprimir los valores de los arreglos.

        for (int i = 0; i < arreglo.length; i++){

            System.out.print(arreglo[i] + " ");
        }

        System.out.println();
    }
}
