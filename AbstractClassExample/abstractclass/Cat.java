package abstractclass;

public class Cat extends Animal {


    public Cat(String AnimalName, Double Weight, Double Height)
    {
        super(AnimalName, Weight, Height);

    }

    public Cat(String AnimalName, Double Weight)
    {
        super(AnimalName, Weight);

    }
    public void sound()
    {
        System.out.println("Meawww");
    }

}
