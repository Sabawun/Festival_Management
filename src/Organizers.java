import java.util.ArrayList;

/**
 * Organizer class is used to instantiate objects of organizers for specific festival runs.
 * The organizer class also by using the Observer design pattern notifies festival_run specific observers
 * whenever a new event is added.
 */
public class Organizers implements Observer {
    private ArrayList<String> First_Name = new ArrayList<>();
    private ArrayList<String> Last_Name = new ArrayList<>();
    private ArrayList<String> Email = new ArrayList<>();
    private ArrayList<String> Phone = new ArrayList<>();


    public Organizers(String first_Name, String last_Name, String email, String phone) {
        First_Name.add(first_Name);
        Last_Name.add(last_Name);
        Email.add(email);
        Phone.add(phone);
    }

    public Organizers() {

    }

    public String getFirst_Name() {
        return First_Name.get(First_Name.size()-1);
    }

    public ArrayList<String> First_Name() {
        return First_Name ;
    }

    public ArrayList<String> Last_Name() {
        return Last_Name ;
    }

    public ArrayList<String> Email() {
        return Email ;
    }

    public ArrayList<String> Phone() {
        return Phone ;
    }


    public void setFirst_Name(String first_Name) {
        First_Name.add(first_Name);
    }

    public String getLast_Name() {
        return Last_Name.get(Last_Name.size() - 1);
    }

    public void setLast_Name(String last_Name) {
        Last_Name.add(last_Name);
    }

    public String getEmail() {
        return Email.get(Last_Name.size()-1);
    }

    public void setEmail(String email) {
        Email.add(email);
    }

    public String getPhone() {
        return Phone.get(Phone.size()-1);
    }

    public void setPhone(String phone) {
        Phone.add(phone);
    }


    @Override
    public void update(Object organizer,Events i) {
     /*
        System.out.println(this.First_Name);
        System.out.println(i.getName());
     */
    }
}
