package foodshops;

import java.util.ArrayList;

public class BiriyaniHouse extends FoodShop {

    public ArrayList<BulkOrder> bulkOrderArrayList = new ArrayList<>();
    public ArrayList<BulkOrder> servedBulkOrderList =  new ArrayList<>();
    public BiriyaniHouse(String name, String location)
    {
        super(name, location);
    }
    public void placeBulkOrder(BulkOrder bulkOrder)
    {
        this.bulkOrderArrayList.add(bulkOrder);
    }

    public void servedBulkOrder(BulkOrder bulkOrder)
    {
        this.servedBulkOrderList.add(bulkOrder);
    }

    public void toBeServedBulkOrders()
    {
        System.out.println("To be served bulk orders list:");
        for (BulkOrder b: bulkOrderArrayList
             ) {
            System.out.println("Order Id: " + b.Orderid + " Location: " + b.location +
                    " Customer Name : " + b.customer.Name
                    +  " Deadline: " + b.DeadlineOfOrder);

        }
    }

}
