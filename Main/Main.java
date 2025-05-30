package main;

import BackEnd.Controller.BookingController;
import BackEnd.Controller.EventController;
import BackEnd.Model.Admin;
import BackEnd.Model.Customer;
import BackEnd.Model.Event;
import BackEnd.Model.EventHost;
import BackEnd.Repository.BookingRepository;
import BackEnd.Repository.EventRepository;
import BackEnd.Repository.UserRepository;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        // Initialize repositories and controllers
        UserRepository userRepository = new UserRepository();
        EventRepository eventRepository = new EventRepository();
        BookingRepository bookingRepository = new BookingRepository();

        EventController eventController = new EventController(eventRepository);
        BookingController bookingController = new BookingController(bookingRepository);

        // Sample users
        Admin admin = new Admin(1L, "admin1", "admin@example.com", "adminpass");
        EventHost host = new EventHost(2L, "host1", "host@example.com", "hostpass");
        Customer customer = new Customer(3L, "cust1", "cust@example.com", "custpass");

        userRepository.addUser(admin);
        userRepository.addUser(host);
        userRepository.addUser(customer);

    }
}

