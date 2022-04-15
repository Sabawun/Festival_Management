import java.util.ArrayList;

/**
 * This is the class that keeps track of all Festivals.
 * This class is made using the Singleton Design Pattern.
 * The reason for that is, that we need only a single instance to keep track of all festivals.
 */

public class FestivalList {

    private ArrayList<Festival> Festival = new ArrayList<>();
    private static FestivalList instance;

    public ArrayList<Festival> getFestival() {
        return Festival;
    }

    public void setFestival(Festival festival) {
        Festival.add(festival);
    }

    public static void setInstance(FestivalList instance) {
        FestivalList.instance = instance;
    }


    private FestivalList() {

    }

    private FestivalList(Festival festival) {
        Festival.add(festival);
    }

    public static FestivalList getInstance(){
        if (instance == null) {
                instance = new FestivalList();
        }
        return instance;
    }
}
