package foodshops;

public class Employee {
    public String name;
    public static int idIterator;
    public int employeeId;
    public String designation;
    public Employee(String name, String designation)
    {
        this.employeeId = ++idIterator;
        this.name = name;
        this.designation = designation;
    }
}
