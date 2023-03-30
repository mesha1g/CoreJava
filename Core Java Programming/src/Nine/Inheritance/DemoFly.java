package Nine.Inheritance;


import Nine.Inheritance.Animal.Bird;

public class DemoFly {
    public static void main(String[] args) {
        Plane plane = new Plane();
        FlyableDemo flyableDemo = new FlyableDemo(plane);
        flyableDemo.executeFlying();
        flyableDemo.setFlyable(new Bird("Pticko"));
        flyableDemo.executeFlying();
    }
}
