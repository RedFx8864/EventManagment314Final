package BackEnd.Repository;

import BackEnd.Model.Booking;
import BackEnd.Model.Event;
import BackEnd.Model.User;

import java.io.*;
import java.util.*;

public class BookingRepository 
{
    private List<Booking> bookings = new ArrayList<>();
    private final String filePath = "Booking.txt";


    public BookingRepository() 
    {
        loadBookingsFromTxt();
    }

    public void save(Booking booking) 
    {
        bookings.add(booking);
        saveBookingsToTxt();
    }

    public List<Booking> getAllBookings() 
    {
        return bookings;
    }

    private void saveBookingsToTxt() 
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Booking b : bookings) {
                String line = b.getUser().getId() + "," + b.getUser().getUsername() + "," + b.getUser().getEmail()
                        + "," + b.getEvent().getId() + "," + b.getEvent().getName();
                writer.write(line);
                writer.newLine();
            }
        } 
        
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }

    private void loadBookingsFromTxt() 
    {
        bookings.clear();
        File file = new File(filePath);
        if (!file.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) 
        {
            String line;
            while ((line = reader.readLine()) != null) 
            {
                String[] parts = line.split(",");
                if (parts.length < 5) continue;

                User user = new User(Long.parseLong(parts[0]), parts[1], parts[2], "");
                Event event = new Event(Long.parseLong(parts[3]), parts[4], null);
                Booking booking = new Booking(user, event);
                bookings.add(booking);
            }
        } 

        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}