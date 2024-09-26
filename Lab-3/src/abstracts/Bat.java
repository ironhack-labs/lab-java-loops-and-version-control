package abstracts;

public class Bat extends Animal {

    public void fly() {
        System.out.println("I can fly");
    }

    public Bat(String name, String age) {
        super(name, age);
    }
}
