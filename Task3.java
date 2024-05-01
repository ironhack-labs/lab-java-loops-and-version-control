public class Task3 {
    public static void main(String[] args) {
        //Task number 3
        // solve x²+(4y/5-x)²
        double x = 6;
        double y = 9;
        double step1 = x*x;
        double step2 = 4*y;
        double step3 = step2/5;
        double step4 = step3-x;
        double step5 = step4*step4;
        double resolution = step1+step5;
        System.out.println("The resolution of the mathematical expression is: "+resolution);
    }
}
