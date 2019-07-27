package abstractclass;

public class Main {
    public static void main(String args[])
    {
        Cat cat1 = new Cat("Tom",40.0);
        cat1.sound();

        Cat cat2 = new Cat("Mike",11.5,20.0);
        cat2.sound();

        Dog dog1 = new Dog("Stark",55.0, 22.1);
        dog1.sound();

    }
}
