package abstractclass;

public class Dog extends Animal {

    public Dog(String AnimalName, Double Weight, Double Height)
    {
        super(AnimalName, Weight, Height);

    }
    public Dog(String AnimalName, Double Weight)
    {
        super(AnimalName, Weight);

    }
    public void sound()
    {
        System.out.println("Vau Vau");
    }

}
