package foodshops;


import java.time.LocalDateTime;
import java.util.ArrayList;

public class Table {
    public  int tableId;
    public static int id;
    public int NumberOfSeats;
    public ArrayList<BookingInfo> bookingInfos = new ArrayList<BookingInfo>();

    public Table(int NumberSeats)
    {
        this.tableId = ++ id;
        this.NumberOfSeats = NumberSeats;
    }

    // This method below will check if this table can be booked for certain timings provided by the customer.
    public boolean CheckTableAvailabilty(LocalDateTime startingTime, LocalDateTime endingTime)
    {

        if (bookingInfos.isEmpty())
        {
            return true;
        }

        for (BookingInfo bookingInfo: this.bookingInfos)
        {
            if (!((startingTime.isBefore(bookingInfo.endingTime)
                    && (endingTime.isAfter(bookingInfo.startingTime)))))  // Condition to check whether timings are clashing with previously booked timings or not.
            {
                return true;

            }
        }

        return false;
    }

    // This method below will print all the booking lists for a particular table.
    public void printAllBookingInfos()
    {
        System.out.println("Bookings List for Table " + this.tableId + "\n"
                + "Booking Id ---- Customer Name ---- Duration ---- Starting Time ---- Ending Time");
        for (BookingInfo b:bookingInfos
             ) {
            System.out.println(b.bookingId +" ---- " + b.customer.Name +
                    " ---- " + b.duration + " ---- " + b.startingTime + " ---- " + b.endingTime);

        }
        System.out.println("\n");
    }


}
