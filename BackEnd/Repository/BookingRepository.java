package BackEnd.Repository;

import BackEnd.Model.Booking;
import java.util.*;

public class BookingRepository {
    private List<Booking> bookings = new ArrayList<>();

    public void save(Booking booking) {
        bookings.add(booking);
    }

    public List<Booking> getAllBookings() {
        return bookings;
    }
}
