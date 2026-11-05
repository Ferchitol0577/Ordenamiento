
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numeros = {34, 12, 25, 8, 19};

        bubbleSort(numeros);
    }

    public static void bubbleSort(int[] arreglo) {

        int n = arreglo.length;
        int i, j, auxiliar;
        int comparaciones = 0;
        int intercambios = 0;
        int pasadas = 0;
        boolean intercambio = true;

        // Inicializamos las variables
        i = 0;

        // Repetimos mientras haya números por ordenar
        while (i < n - 1 && intercambio == true) {

            // Indicar que todavía no hubo intercambios
            intercambio = false;

            // Compararamos los números del arreglo
            for (j = 0; j < n - 1 - i; j++) {

                comparaciones++;

                // Verificamos si el número actual es mayor al siguiente
                if (arreglo[j] > arreglo[j + 1]) {

                    // Intercambia los números de posición
                    auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;

                    intercambios++;

                    // Indicamos que se realizó un intercambio
                    intercambio = true;
                }
            }

            // Pasa a la siguiente vuelta
            i++;
            pasadas++;

            System.out.println("Pasada " + pasadas + ": " + Arrays.toString(arreglo));
        }

        System.out.println("\nArreglo ordenado:");
        System.out.println(Arrays.toString(arreglo));

        System.out.println("\nTotal de comparaciones: " + comparaciones);
        System.out.println("Total de intercambios: " + intercambios);
        System.out.println("Total de pasadas: " + pasadas);
    }
}

