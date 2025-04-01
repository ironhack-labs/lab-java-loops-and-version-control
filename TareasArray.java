import java.util.Arrays;

public class TareasArray {

    public static int diferenciaEntreMaxMin(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return max - min;
    }

    public static void encontrarMenorYPenultimo(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Menor: " + arr[0] + ", Penúltimo: " + arr[arr.length - 2]);
    }

    public static double calcularExpresion(double x, double y) {
        return x * x + Math.pow((4.0 * y / 5) - x, 2);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        System.out.println("Diferencia: " + diferenciaEntreMaxMin(arr));
        encontrarMenorYPenultimo(arr);

        double x = 5, y = 2;
        System.out.println("Resultado de la expresión: " + calcularExpresion(x, y));
    }
}
