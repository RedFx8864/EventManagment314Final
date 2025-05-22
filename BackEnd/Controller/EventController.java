package BackEnd.Controller;

import BackEnd.Model.Event;
import BackEnd.Repository.EventRepository;

import java.util.List;

public class EventController {
    private EventRepository repository;

    public EventController() {
        this.repository = new EventRepository();
    }

    public void createEvent(String name, String date, String location) {
        repository.addEvent(new Event(name, date, location));
    }

    public List<Event> getEvents() {
        return repository.getAllEvents();
    }
}
