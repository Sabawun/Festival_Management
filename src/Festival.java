import java.util.ArrayList;

/**
 * This class keeps track of any Festival that is planned. This class has a list of Festival Runs
 * which means that a Festival can occur more than once.
 */
public class Festival {

    private String Name;
    private String Place;
    private ArrayList<Festival_Run> Festival_Run = new ArrayList<>();

    public Festival(String name, String place) {
        Name = name;
        Place = place;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }

    public ArrayList<Festival_Run> getFestival_Run() {
        return Festival_Run;
    }

    public void setFestival_Run(Festival_Run festival_Run) {
        Festival_Run.add(festival_Run);
    }

}
