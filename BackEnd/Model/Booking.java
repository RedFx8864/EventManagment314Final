package BackEnd.Model;

import java.time.LocalDateTime;

public class Booking 
{
    private Customer customer;
    private Event event;
    private LocalDateTime bookingTime;

    public Booking(Customer customer, Event event) 
    {
        this.customer = customer;
        this.event = event;
        this.bookingTime = LocalDateTime.now();
    }

    // Getters
}
