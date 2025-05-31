package BackEnd.Repository;

import BackEnd.Model.Event;
import java.util.*;

public class EventRepository 
{
    private Map<Long, Event> events = new HashMap<>();

    public void addEvent(Event event) 
    {

    }

    public Event findById(Long id) 
    {
        return events.get(id);
    }

    public List<Event> getAllEvents() 
    {
        return new ArrayList<>(events.values());
    }
}
