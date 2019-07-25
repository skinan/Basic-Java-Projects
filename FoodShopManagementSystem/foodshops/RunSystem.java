package foodshops;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;


public class RunSystem {
    public static void main(String[] args)
    {
        System.out.println("Assignment 2 : Food Shops Management System");
        System.out.println("Muhammad Sakib Khan Inan , ID: 182000112 \n");

        Restaurant Shangrila = new Restaurant("Shangrila", "Agrabad, Chittagong");
        // Create tables for Restaurant.
        Table tResA = new Table(4);
        Table tResB = new Table(5);
        Table tResC = new Table(3);
        Table tResD = new Table(2);
        Table tResE = new Table(10);
        Table tResF = new Table(7);
        Table tResG = new Table(4);

        // Add tables to Restaurant.
        Shangrila.TablesArrayList.add(tResA);
        Shangrila.TablesArrayList.add(tResB);
        Shangrila.TablesArrayList.add(tResC);
        Shangrila.TablesArrayList.add(tResD);
        Shangrila.TablesArrayList.add(tResE);
        Shangrila.TablesArrayList.add(tResF);
        Shangrila.TablesArrayList.add(tResG);
        // Book A Table (At first it checks availability of desired table by certain criteria.)
        Shangrila.BookATable(tResB, LocalDateTime.of(2019, Month.AUGUST, 31, 10, 20, 55),
                LocalDateTime.of(2019, Month.AUGUST, 31, 11, 20, 55));

        // Create Customer Objects.
        Customer customer1 =  new Customer("Inan");
        Customer customer2 = new Customer("Mahmud");
        Customer customer3 =  new Customer("Rizwan");
        Customer customer4 = new Customer("Riham");
        Customer customer5 = new Customer("Rahat");
        // If the table is available for booking , enter your booking infos.
        BookingInfo booking1 = new BookingInfo(customer1, tResB,
                LocalDateTime.of(2019, Month.AUGUST, 31, 10, 20, 55),
                LocalDateTime.of(2019, Month.AUGUST, 31, 11, 20, 55));

        // If a table is not available for booking on your given criteria, BookATable will response it.
        Shangrila.BookATable(tResB,
                LocalDateTime.of(2019, Month.AUGUST, 31, 10, 45, 55),
                LocalDateTime.of(2019, Month.AUGUST, 31, 11, 30, 55));

        // Book A Table By Required Number Of Seats.
        Shangrila.BookATable(5,
                LocalDateTime.of(2019, Month.AUGUST, 31, 8, 45, 55),
                LocalDateTime.of(2019, Month.AUGUST, 31, 9, 30, 55));
        BookingInfo booking2 = new BookingInfo(customer2, tResB, LocalDateTime.of(2019, Month.AUGUST, 31, 8, 45, 55),
                LocalDateTime.of(2019, Month.AUGUST, 31, 9, 30, 55));

        tResB.printAllBookingInfos();

        // Make an order list through hashmap.
        HashMap<FoodNames, Integer> orderlist1 = new HashMap<FoodNames, Integer>();
        orderlist1.put(FoodNames.Burger,2);
        orderlist1.put(FoodNames.ChickenFry,2);
        orderlist1.put(FoodNames.Doughnuts, 1);

        HashMap<FoodNames, Integer> orderlist2 = new HashMap<FoodNames, Integer>();
        orderlist2.put(FoodNames.Doughnuts,2);
        orderlist2.put(FoodNames.Sandwich,2);

        // Make an order.
        Order order1 = new Order(customer1, orderlist1);
        order1.CalculatePrice();
        Shangrila.placeOrder(order1);
        order1.printOrderDetails();

        // Make an order.
        Order order2 = new Order(customer3, orderlist2);
        order2.CalculatePrice();
        Shangrila.placeOrder(order2);
        order2.printOrderDetails();

        Shangrila.ShowCurrentOrdersList();
        Shangrila.completeOrder(order1);
        Shangrila.completeOrder(order2);


        // Create An Object Of Type Biriyani House.
        BiriyaniHouse ShahiBiriyani = new BiriyaniHouse("Shahi Biriyani", "Jamal Khan");
        // Employees
        Employee employee1 = new Employee("John", "Chef");
        Employee employee2 = new Employee("David", "Manager");
        Employee employee3 = new Employee("Johnson", "Delivery Man");

        ArrayList<Employee> assignedEmployees =  new ArrayList<>();
        assignedEmployees.add(employee1);
        assignedEmployees.add(employee2);
        assignedEmployees.add(employee3);

        // Bulk Orders Related Tasks.
        HashMap<FoodNames, Integer> bulkOrdersList = new HashMap<>();
        bulkOrdersList.put(FoodNames.BeefBiriyani, 50);
        bulkOrdersList.put(FoodNames.ChickenBiriyani, 35);

        BulkOrder bulkOrder1 = new BulkOrder("Laal Khan Bazar", assignedEmployees,
                                        customer5,bulkOrdersList, LocalDateTime.of(2019, Month.AUGUST, 18, 10, 30, 55));
        bulkOrder1.CalculatePrice();
        ShahiBiriyani.placeBulkOrder(bulkOrder1);
        ShahiBiriyani.toBeServedBulkOrders();
        ShahiBiriyani.servedBulkOrder(bulkOrder1);

        bulkOrder1.printBulkOrderDetails();

        // Fast Food shop object created below.
        FastFood KFC = new FastFood("KFC", "Probortok");

    }
}
