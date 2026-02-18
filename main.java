public class Main {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};
        System.out.println(maxMinusMin(array));
        twoSmallestNumbers(array);
        System.out.println(mathExpression(10,10));
    }


    public static int maxMinusMin(int[] arrays){
        int max=0;
        for (int i=0; i<arrays.length; i++){
            if(arrays[i]>max){
                max=arrays[i];
            }
        }
        int min=arrays[0];
        for (int i=0; i<arrays.length; i++){
            if(arrays[i]<min){
                min=arrays[i];
            }
        }
        return max-min;
    }

    public static void twoSmallestNumbers(int[] array){
        int min=array[0];
        for (int i=0; i<array.length; i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        int secondMin= array[0];
        for (int i=0; i<array.length; i++){
            if(array[i]<secondMin && array[i] != min){
                secondMin=array[i];
            }
        }
        System.out.println(min + "," + secondMin);
    }
    public static int mathExpression(int x, int y){
        int firstPart = (int) Math.pow(x, 2);
        int secondPart = 4*y/5;
        int powSecondPart = (int) Math.pow(secondPart, 2);
        return firstPart + powSecondPart;
    }
}