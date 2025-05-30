package BackEnd.Model;

import java.util.ArrayList;
import java.util.List;

public class EventHost extends User {
    private List<Event> hostedEvents = new ArrayList<>();

    public EventHost(Long id, String username, String email, String password) {
        super(id, username, email, password);
    }

    public List<Event> getHostedEvents() {
        return hostedEvents;
    }

    public void hostEvent(Event event) {
        hostedEvents.add(event);
    }
}
