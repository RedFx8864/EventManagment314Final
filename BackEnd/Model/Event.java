package BackEnd.Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Event {
    private int id;
    private String title;
    private LocalDateTime dateTime;
    private EventHost host;
    private List<Booking> bookings = new ArrayList<>();

    public Event(Long id, String title, LocalDateTime dateTime, EventHost host) {
        this.id = id;
        this.title = title;
        this.dateTime = dateTime;
        this.host = host;
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public int getid(int id) {this.id = id;}

    // Getters and setters
}
