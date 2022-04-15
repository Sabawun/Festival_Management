import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * This class encompasses an event that is specific to a festival_run object.
 * This class is implemented using the Strategy design pattern since we have three different types
 * of Events that can occur, but only one at a time.
 */
public class Events implements Concert,Show,Other {
    private String Name;
    private java.util.Date Date;
    private String Description;
    private String Performer;
    private ArrayList<String> Performers = new ArrayList<>();
    private String Other;

    public Events(String name, String date, String description) throws ParseException {
        Name = name;
        Date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        Description = description;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(String date) throws ParseException {
        Date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void type(){
        if (this.singer()==null){
            if (this.Performer==null){
                System.out.println(other());
            }
            else {
                System.out.println(showstars());
            }
        }
        else {
            System.out.println(singer());
        }
    }
    @Override
    public void addConcertDetails(String Perf) {
        Performer = Perf;
    }

    @Override
    public String singer() {
        return this.Performer;
    }

    @Override
    public void addOtherDetails(String other){
        Other = other;
    }

    @Override
    public String other() {
        return this.Other;
    }

    @Override
    public void addShowDetails(String Perf) {
        Performers.add(Perf);
    }

    @Override
    public ArrayList<String> showstars() {
        return Performers;
    }
}
