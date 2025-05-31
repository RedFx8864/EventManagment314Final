package BackEnd.Controller;

import BackEnd.Model.*;
import BackEnd.Repository.EventRepository;

import java.time.LocalDateTime;

public class EventController 
{
    private EventRepository eventRepository;

    public EventController(EventRepository eventRepository) 
    {
        this.eventRepository = eventRepository;
    }

    public void createEvent(int id, String title, LocalDateTime dateTime, EventHost host) 
    {
        Event event = new Event(id, title, dateTime, host);
        host.hostEvent(event);
        eventRepository.addEvent(event);
    }
}
