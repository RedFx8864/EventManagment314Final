package BackEnd.Model;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private List<Booking> bookings = new ArrayList<>();

    public Customer(int id, String username, String email, String password) {
        super(id, username, email, password);
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void requestBooking(Event event) {
        Booking booking = new Booking(this, event);
        bookings.add(booking);
        event.addBooking(booking);
    }
}
