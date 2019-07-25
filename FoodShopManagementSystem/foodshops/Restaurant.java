package foodshops;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Restaurant extends FoodShop {
    public  ArrayList<Table> TablesArrayList = new ArrayList<Table>();

    public Restaurant(String name, String location)
    {
        super(name, location);
    }

    public void BookATable(Table t, LocalDateTime startingTime, LocalDateTime endingTime)
    {
        if((t.CheckTableAvailabilty(startingTime, endingTime)))
        {
            System.out.println("This Table Available for booking.Enter Your Booking Infos For This Table!");
        }
        else
        {
            System.out.println("Sorry,this table is not available for booking.");
        }

    }
    public void BookATable(int required_number_of_seats, LocalDateTime startingTime, LocalDateTime endingTime)
    {
        int check = 0;
        for (Table t:TablesArrayList
             ) {
            if ((t.NumberOfSeats == required_number_of_seats) && t.CheckTableAvailabilty(startingTime, endingTime))
            {
                System.out.println("Table No. "+ t.tableId + " is available for booking according to your choices. " +
                            "Enter Your Booking Infos to confirm your booking.");
                check =  1;
                break;
            }
        }
        if (check == 0)
            System.out.println("No Table Is Available According To Your Demand!");


    }

}
