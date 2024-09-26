package abstracts;

public class Lion extends Animal {

    public void hunt() {
        System.out.println("I am hunting");
    }

    public Lion(String name, String age) {
        super(name, age);
    }
}
