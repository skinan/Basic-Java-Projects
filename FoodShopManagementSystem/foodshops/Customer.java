package foodshops;

import java.util.ArrayList;

public class Customer {
    public String Name;
    public static int idIterator;
    public int id;
    public ArrayList<Order> customersAllOrdersList = new ArrayList<Order>();
    public ArrayList<BookingInfo> customersBookingsList = new ArrayList<BookingInfo>();
    public Customer(String Name)
    {
        this.Name = Name;
        this.id = ++ idIterator;
    }





}
