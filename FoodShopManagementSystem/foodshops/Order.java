package foodshops;

import java.security.PublicKey;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Order {
    public Customer customer;
    public int Orderid;
    public static int iditerator;
    public Map<FoodNames, Integer> OrderList;
    public LocalTime timeOfOrder;
    public int totalPrice = 0;


    public Order(Customer customer, HashMap<FoodNames, Integer> OrderList)
    {
        this.customer = customer;
        this.Orderid = ++ Order.iditerator;
        this.OrderList = OrderList;
        this.timeOfOrder = LocalTime.now();
        customer.customersAllOrdersList.add(this);
    }


    public void CalculatePrice()
    {

        for (FoodNames f: this.OrderList.keySet()
             )
        {
            totalPrice += ((FoodsPriceList.FoodMenu(f))*(this.OrderList.get(f)));

        }
        System.out.println("Your total cost for this order will be : " + totalPrice + " BDT");

    }
    public void printOrderDetails()
    {
        System.out.println("Order ID: " + Orderid + " Customer Id: " + customer.id + " Total price: " + totalPrice
        + "BDT" + " Time Of Order : " + timeOfOrder);
    }
}
