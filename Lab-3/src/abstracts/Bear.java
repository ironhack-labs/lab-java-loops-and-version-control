package abstracts;

public class Bear extends Animal {

    public void stealTheHoney() {
        System.out.println("I am stealing the honey");
    }

    public Bear(String name, String age) {
        super(name, age);
    }
}
