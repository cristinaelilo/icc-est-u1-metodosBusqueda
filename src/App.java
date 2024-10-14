import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();

        // Crear un arreglo del 1 al 100000
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        // Pedir al usuario que ingrese el valor a buscar
        System.out.print("Ingrese el valor que desea buscar: ");
        int valorBuscado = scanner.nextInt();

        // Realizar la búsqueda secuencial y medir el tiempo de ejecución
        long startTimeSecuencial = System.nanoTime();
        int posicionSecuencial = metodosBusqueda.busquedaSecuencial(arr, valorBuscado);
        long endTimeSecuencial = System.nanoTime();
        long tiempoSecuencial = endTimeSecuencial - startTimeSecuencial;

        if (posicionSecuencial != -1) {
            System.out.println("Búsqueda secuencial: El valor se encuentra en la posición " + posicionSecuencial);
        } else {
            System.out.println("Búsqueda secuencial: Valor no encontrado 404");
        }
        System.out.println("Tiempo de búsqueda secuencial: " + tiempoSecuencial + " nanosegundos");

        // Realizar la búsqueda binaria y medir el tiempo de ejecución
        long startTimeBinaria = System.nanoTime();
        int posicionBinaria = metodosBusqueda.busquedaBinaria(arr, valorBuscado);
        long endTimeBinaria = System.nanoTime();
        long tiempoBinaria = endTimeBinaria - startTimeBinaria;

        if (posicionBinaria != -1) {
            System.out.println("Búsqueda binaria: El valor se encuentra en la posición " + posicionBinaria);
        } else {
            System.out.println("Búsqueda binaria: Valor no encontrado 404");
        }
        System.out.println("Tiempo de búsqueda binaria: " + tiempoBinaria + " nanosegundos");

    }
}
