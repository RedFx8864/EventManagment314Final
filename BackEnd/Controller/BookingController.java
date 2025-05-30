package BackEnd.Controller;

import BackEnd.Model.*;
import BackEnd.Repository.BookingRepository;

public class BookingController {
    private BookingRepository bookingRepository;

    public BookingController(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public void createBooking(Customer customer, Event event) {
        Booking booking = new Booking(customer, event);
        customer.requestBooking(event);
        bookingRepository.save(booking);
    }
}
