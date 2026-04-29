package APP;

import model.Event;

import java.util.Comparator;

public class EventComparator implements Comparator<Event> {
    @Override
    public int compare(Event o1, Event o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
