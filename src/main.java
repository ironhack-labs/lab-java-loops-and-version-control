public class main {
    public static void main(String[] args) {
        //Task 1
        int[] numeros = {1, 2, 3, 4, 10};
        task1(numeros);

        //Task 2
        task2(numeros);

        //Task 3
        task3();
    }

    public static void task1(int[] numeros) {
        int max = numeros[0];
        int min = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        int dif = max - min;
        System.out.println("Task 1: La diferencia entre el valor mayor "+max+" y el valor menor "+min+" es de "+dif);

    }

    public static void task2(int[] numeros) {
        int smallest = numeros[0];
        int secondSmallest = 2147483647;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > smallest && numeros[i] < secondSmallest) {
                secondSmallest = numeros[i];
            }
            if (numeros[i] < smallest) {
                smallest = numeros[i];
            }

        }
        System.out.println("Task 2: El valor más pequeño "+smallest+" y el seguno valor más pequeño es "+secondSmallest);
    }

    public static void task3() {
        float x = 6;
        float y = 4;
        float result = (x*x)+((((4*y)/5)-x)*(((4*y)/5)-x));
        System.out.println("Task 3: El resultado de la ecuación siendo X="+x+" e y="+y+" es de "+result);
    }
}