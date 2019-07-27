package abstractclass;

public abstract class Animal {
    String AnimalName;
    Double Weight;
    Double Height;
    public Animal(String AnimalName, Double Weight, Double Height)
    {
        this.AnimalName = AnimalName;
        this.Weight = Weight;
        this.Height = Height;
    }
    public Animal(String AnimalName, Double Weight)
    {
        this.AnimalName = AnimalName;
        this.Weight = Weight;
    }

    public abstract void sound();
}
