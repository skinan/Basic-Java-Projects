package foodshops;

import java.util.ArrayList;

public class FoodShop {
    public String name;
    public String loaction;
    public ArrayList<Order> CurrentServingCustomerList;
    public ArrayList<Order> CustomersServedList;
    public FoodShop(String name, String location)
    {
        this.name = name;
        this.loaction = location;
        this.CustomersServedList = new ArrayList<>();
        this.CurrentServingCustomerList = new ArrayList<>();
    }



    public void placeOrder(Order O)
    {
        CurrentServingCustomerList.add(O);
    }
    public void completeOrder(Order O)
    {
        CustomersServedList.add(O);
    }

    public void ShowCurrentOrdersList()
    {
        System.out.println("Current Serving Customer List:");
        for (Order order: CurrentServingCustomerList
        ) {
            System.out.println("Order ID: "+order.Orderid + " Customer Name: " + order.customer.Name + " Customer ID: "
                    + order.customer.id + " Time Of Order:  " + order.timeOfOrder);
        }
    }


}
