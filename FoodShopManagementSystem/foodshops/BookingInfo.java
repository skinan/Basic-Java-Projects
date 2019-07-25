package foodshops;

import java.time.Duration;
import java.time.LocalDateTime;

public class BookingInfo {
    public Customer customer;
    public Table table;
    public static int id;
    public int bookingId;
    public LocalDateTime startingTime;
    public LocalDateTime endingTime;
    public Duration duration;

    public BookingInfo(Customer customer , Table table, LocalDateTime startingTime, LocalDateTime endingTime)
    {
        this.bookingId = ++id;
        this.customer = customer;
        this.table = table;
        this.startingTime = startingTime;
        this.endingTime = endingTime;
        this.duration = Duration.between(startingTime, endingTime);
        table.bookingInfos.add(this);
        customer.customersBookingsList.add(this);
    }

}
