import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Festival_Run class is the representation of an actual festival happening.
 */
public class Festival_Run implements Subject{
    private Date Date;
    private String Duration;
    private ArrayList<Organizers> Organizers = new ArrayList<>();
    private ArrayList<Events> Events = new ArrayList<>();

    public Festival_Run(String date, String duration) throws ParseException {
        Date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        Duration = duration;
    }

    public Festival_Run(String date, String duration,Organizers organizer, Events event) throws ParseException {
        Date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        Duration = duration;
        Organizers.add(organizer);
        Events.add(event);
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date date) {
        this.Date = date;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public ArrayList<Organizers> getOrganizers() {
        return Organizers;
    }

    public void setOrganizers(Organizers organizer) {
        Organizers.add(organizer);
    }

    public ArrayList<Events> getEvents() {
        return Events;
    }

    public void setEvents(Events events) {
        Events.add(events);
    }

    @Override
    public void Notify(Events event) {
        for (Organizers organizer : Organizers) {
            organizer.update(organizer,event);
         //   System.out.println("Notified!");
        }
    }

}
