import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] array = inputArray();

        System.out.println("Tu array:");
        printArray(array);

        findTwoMins(array);
    }

    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);

        int size;
        do {
            size = validInt(scanner, "Ingrese el tamaño del array (mínimo 1): ");
        } while (size < 1);

        int[] array = new int[size];

        System.out.println("Ingrese los elementos del array:");

        for (int i = 0; i < size; i++) {
            array[i] = validInt(scanner, "Elemento " + (i + 1) + ": ");
        }

        scanner.close();
        return array;
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " , ");
        }
        System.out.println();
    }

    public static int validInt(Scanner scanner, String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero válido.");
            }
        }
    }

    public static void findTwoMins(int[] array) {
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int number : array) {
            if (number < min) {
                min2 = min;
                min = number;

            }
            else if (number < min2 && number != min) {
                min2 = number;
            }
        }

        System.out.println("El numero mas pequeno es: " + min + " y el siguiente es: " + min2);
    }
}