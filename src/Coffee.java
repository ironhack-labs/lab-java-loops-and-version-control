public class Coffee {
    public static void main(String[] args) {
        String coffeeType = "Latte";
        if (coffeeType.equalsIgnoreCase("Espresso")) {
            System.out.println("It's strong.");
        } else if (coffeeType.equalsIgnoreCase("Americano")) {
            System.out.println("It's a classic choice.");
        } else if (coffeeType.equalsIgnoreCase("Latte")) {
            System.out.println("It's creamy and delicious.");
        } else {
            System.out.println("We don't have information about this type of coffee.");
        }
        int coffeeBaseGrams = 30;
        int waterRatio = 250;
        double strength = (double) coffeeBaseGrams / waterRatio;
        System.out.println("The strength of the coffee is: " + strength);
        int CoffeeTemperature = 60;
        if (CoffeeTemperature > 60) {
            System.out.println("Warning this coffee is to hot");
        } else {
            System.out.println("The coffee temperature is suitable for drinking. Enjoy your coffee!");
        }
        int numberOfCoffeesOrdered = 5;
        double pricePerCup = 3.5;
        double totalCost = numberOfCoffeesOrdered * pricePerCup;
        System.out.println("The total cost for " + numberOfCoffeesOrdered + " coffees is: $" + totalCost);
        String[] coffeeOrders = {"Espresso", "Latte", "Americano", "Espresso", "Latte", "Latte"};
        int espressoCount = 0;
        int latteCount = 0;
        int americanoCount = 0;
        for (String order : coffeeOrders) {
            if (order.equals("Espresso")) {
                espressoCount++;
            } else if (order.equals("Latte")) {
                latteCount++;
            } else if (order.equals("Americano")) {
                americanoCount++;
            }
        }
        System.out.println("Espresso count: " + espressoCount);
        System.out.println("Latte count: " + latteCount);
        System.out.println("Americano count: " + americanoCount);
    }
}
// Not Finished