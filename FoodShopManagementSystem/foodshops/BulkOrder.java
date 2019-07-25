package foodshops;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class BulkOrder extends Order {
    public String location;
    public ArrayList<Employee> employeeArrayList;
    public LocalDateTime DeadlineOfOrder;
    public BulkOrder(String location, ArrayList<Employee> employeesArrayList,
                     Customer customer,
                     HashMap<FoodNames, Integer> OrderList, LocalDateTime DeadlineOfOrder)
    {
        super(customer, OrderList);
        this.location = location;
        this.employeeArrayList = new ArrayList<Employee>();
        this.employeeArrayList = employeesArrayList;
        this.DeadlineOfOrder = DeadlineOfOrder;
    }

    public void printBulkOrderDetails()
    {
        System.out.println("Bulk Order Details: ");
        System.out.println("Order ID: " + Orderid + " Customer Id: " + customer.id + " Total price: " + totalPrice
                + "BDT" + " Deadline : " + DeadlineOfOrder);
        System.out.println("Employee List Of This Bulk Order:");
        for (Employee e: employeeArrayList
             ) {
            System.out.println("Employee Name: " + e.name + " Designation: " + e.designation);

        }
        System.out.println("\n");
    }


}
