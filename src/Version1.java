/**
 * This interface uses the FestivalList to print the required information as per different versions mentioned in the
 * pdf document.
 *
 * Printing of versions is done using the Decorator Design Patterns
 *
 */

public class Version1 implements Version{
    @Override
    public void assemble() {
        for (int i = 0 ; i < FestivalList.getInstance().getFestival().size();i++) {
            for (int j = 0; j < FestivalList.getInstance().getFestival().get(i).getFestival_Run().size(); j++) {
                for (int k = 0; k < FestivalList.getInstance().getFestival().get(i).getFestival_Run().get(j).getEvents().size(); k++)
                System.out.println(FestivalList.getInstance().getFestival().get(i).getFestival_Run().get(j).getEvents().get(k).getName());
            }
        }
        }
}
