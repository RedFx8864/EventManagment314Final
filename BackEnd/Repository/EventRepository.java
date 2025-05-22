package BackEnd.Repository;

import BackEnd.Model.Event;
import java.util.ArrayList;
import java.util.List;

public class EventRepository {
    private List<Event> events = new ArrayList<>();

    public void addEvent(Event event) {
        events.add(event);
    }

    public List<Event> getAllEvents() {
        return events;
    }
}
