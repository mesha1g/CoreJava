package Nine.Inheritance.Animal;


import Nine.Inheritance.Flyable;
import Nine.Inheritance.Runnable;

public class Bird extends Animal implements Flyable, Runnable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("Ćiu Ćiu Ćiu");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying over screen..");
    }

    @Override
    public void run() {
        System.out.println("Bird is running..");
    }
}
