// Felipe Hanitzsch
//Ironhack Backend Lab Week 1
public class Main {
    public static void main(String[] args) {

        int[] numbers = { 4, 2, 7, 9 };

        int grosser = numbers[0];
        int kleiner = numbers[0];
        // found that the variable needs to be redirected to the array "numbers[0]" but dint fully understood it.
        int rest;

        //for (int i = 0; i< numbers.length; i++){
        //    if (numbers[i] > grosser)
        //        grosser = numbers[i];
        //   else if (numbers[i] < kleiner)
        //       kleiner = numbers[i];
        //  Wrote first the code indicating the arguments and the IDE gave me the hint to the code above
            for (int number : numbers) {
                if (number > grosser)
                    grosser = number;
                else if (number < kleiner)
                    kleiner = number;
        }
        //System.out.println(grosser);
        //System.out.println(kleiner);
        //Printed that cause i was trying to find out why i got an error with the variables
        rest = grosser - kleiner;
        System.out.println("The difference between the largest and smallest values are " + rest);



        }
    }



