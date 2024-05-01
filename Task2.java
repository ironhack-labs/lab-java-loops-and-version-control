public class Task2 {
    public static void main(String[] args) {
        // Task number 1
        int[] numbers = {69, 100, 88, 24, 2024};
        int minValue = numbers[0]; //69
        for (int i = 1; i < numbers.length; i++) { //100
            if (numbers[i] < minValue) {  //28<69
                minValue = numbers[i]; //69,28
            }
        }
        System.out.println("Smallest Value of this array is: " + minValue);

        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        System.out.println("Highest Value of this array is: " + maxValue);
        System.out.println("The difference between the minimum and maximum values: " + (maxValue - minValue));


        int secondminValue = numbers[0];//69
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                secondminValue = minValue;
                minValue = numbers[i];
                if (numbers[i] < secondminValue && numbers[i] != minValue) {
                    secondminValue = numbers[i];
                }
            }
        }
        System.out.println(("The lowest value is " + minValue) + (" and the second lowest value in this array is " + secondminValue));
    }
    }