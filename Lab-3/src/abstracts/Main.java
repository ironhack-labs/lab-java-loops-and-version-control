package abstracts;

public class Main {
    public static void main(String[] args) {

        Lion animal = new Lion("Tiger", "5 years");
        animal.hunt();
        System.out.println(animal);

        Bat bat = new Bat("Bruce", "4 years");
        bat.fly();

        Bear bear = new Bear("Winnie", "5 years");
        bear.stealTheHoney();
    }
}
