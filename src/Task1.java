import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] array = inputArray();

        System.out.println("Tu array:");
        printArray(array);

        int result = findMaxMinusMin(array);

        System.out.println("El resultado es: " + result);
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

    public static int findMaxMinusMin(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int number : array) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.println("El máximo es: " + max + " y el mínimo es: " + min);
        return max - min;
    }
}

