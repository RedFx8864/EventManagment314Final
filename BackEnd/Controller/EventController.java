package BackEnd.Controller;

import BackEnd.Model.*;
import BackEnd.Repository.EventRepository;

import java.time.LocalDateTime;

public class EventController {
    private EventRepository eventRepository;

    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public void createEvent(int id, String title, EventHost host) {
        Event event = new Event(id, title, LocalDateTime.now().plusDays(1), host);
        host.hostEvent(event);
        eventRepository.addEvent(event);
    }
}
