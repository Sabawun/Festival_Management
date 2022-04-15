import java.text.ParseException;
import java.util.Scanner;
/**
 * @author Abdullah 2243533, Sabawun 2328284, Onur 2243459
 * @description This is the main class which acts as the driver of this code
 *
 */
public class Track {

    public static void main(String[] args) throws ParseException {
        FestivalList Fest_list = FestivalList.getInstance();

      /*  int Press;
        do {
            System.out.println("Welcome to Festival Management!");
            System.out.println("Press 1 to create a festival (Press 0 to exit): ");
            Scanner sc = new Scanner(System.in);
            Press = Integer.parseInt(sc.nextLine());
            if (Press > 1) {
                do {
                    System.out.println("Please enter either 1 to continue or 0 to exit");
                    Press = Integer.parseInt(sc.nextLine());
                } while (Press > 1);
            }
            if (Press == 1) {
                Festival Fest = create_festival();
                Fest_list.setFestival(Fest);
            }
        } while (Press != 0);
*/

        Festival GOF = new Festival("Guzelyurt Orange Festival", "Guzelyurt");
        Fest_list.setFestival(GOF);
        Festival TTP = new Festival("Tepebaşı Tulip Festiva", "Tepebaşı");
        Fest_list.setFestival(TTP);

        Festival_Run GOF_First = new Festival_Run("25/06/2019", "15 days");
        GOF.setFestival_Run(GOF_First);
        Festival_Run TTP_First = new Festival_Run("24/03/2019", "5 days");
        GOF.setFestival_Run(TTP_First);


        Organizers GOF_Org = new Organizers();
        GOF_Org.setFirst_Name("Mete");
        GOF_Org.setLast_Name("Kaan");
        GOF_Org.setEmail("metekaan@metu.edu.tr");
        GOF_Org.setPhone("054282xxxxx");

        GOF_First.setOrganizers(GOF_Org);

        GOF_Org.setFirst_Name("Sezin");
        GOF_Org.setLast_Name("Seven");
        GOF_Org.setEmail("sezinseven@metu.edu.tr");
        GOF_Org.setPhone("054252xxxxx");

        GOF_First.setOrganizers(GOF_Org);

        Organizers TTP_Org = new Organizers();
        TTP_Org.setFirst_Name("Kenan");
        TTP_Org.setLast_Name("Soylu");
        TTP_Org.setEmail("kenansoy@metu.edu.tr");
        TTP_Org.setPhone("054236xxxxx");

        TTP_First.setOrganizers(TTP_Org);

        TTP_Org.setFirst_Name("Selma");
        TTP_Org.setLast_Name("Yarin");
        TTP_Org.setEmail("selmayar@metu.edu.tr");
        TTP_Org.setPhone("054269xxxxx");

        TTP_First.setOrganizers(TTP_Org);

        Concert OpenCon = new Events("Opening Concert", "25/06/2019", "Kick off with a popular\n" +
                "pop singer");
        OpenCon.addConcertDetails("Murat Boz");


        GOF_First.setEvents((Events) OpenCon);
        GOF_First.Notify((Events) OpenCon);

        Other Tulips = new Events("Walking to see Tulips", "24/03/2019", "2-hours walk as a group");
        Tulips.addOtherDetails("10 o clock starting time");

        TTP_First.setEvents((Events) Tulips);
        TTP_First.Notify((Events) Tulips);


        Show Dancing = new Events("Folk Dancing Show", "26/06/2019", "Popular folk dancers in\n" +
                "Güzelyurt");
        Dancing.addShowDetails("Ali Hakan");
        Dancing.addShowDetails("Ferda Say");
        Dancing.addShowDetails("Hale Anil");
        Dancing.addShowDetails("Ahmet Yilmaz Say");

        GOF_First.setEvents((Events) Dancing);
        GOF_First.Notify((Events) Dancing);

        Concert OpenCon2 = new Events("Opening Concert", "25/04/2012", "A Concert by a national singer");
        OpenCon2.addConcertDetails("Fikri Karayel");

        GOF_First.setEvents((Events) OpenCon2);
        GOF_First.Notify((Events) OpenCon2);

        int choice;
        int quit=0;
        do {
            System.out.println("Please choose which version you want to print (0) Version 1 (1) Version 2 (2) Version 3");
            Scanner sc = new Scanner(System.in);
            choice = Integer.parseInt(sc.next());
            while (choice > 2) {
                System.out.println("Wrong Input. Try again");
                System.out.println("Please choose which version you want to print (0) Version 1 (1) Version 2 (2) Version 3");
                choice = Integer.parseInt(sc.next());
            }

            if (choice == 0) {
                Version version1 = new Version1();
                version1.assemble();
                System.out.println();
            }
            if (choice == 1) {
                Version version2 = new Version2(new Version1());
                version2.assemble();
                System.out.println();
            }
            if (choice == 2) {
                Version version3 = new Version3(new Version2(new Version1()));
                version3.assemble();
                System.out.println();
            }
            System.out.println("Do you want to quit?(Press 1 to quit//(Any other integer to continue in the program)");
            quit = Integer.parseInt(sc.next());
            if (quit != 1) {
                quit = 0;
            }
        } while (quit==0);
    }
}

    /* private static Festival create_festival() throws ParseException {

        String name,place,date,duration,description, singer, performer;
        int organizers, events, type, num;
        String first_name, last_name, email, phone;

        System.out.println("Enter Name of Festival: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Enter Place of Festival: ");
        place = sc.nextLine();

        Festival Fest = new Festival(name, place);
        System.out.println("Enter Starting date of Festival: ");
        date = sc.nextLine();
        System.out.println("Enter Duration of Festival: ");
        duration = sc.nextLine();

        Festival_Run Fest_run = new Festival_Run(date,duration);
        Fest.setFestival_Run(Fest_run);

        do {
            System.out.println("How many organizers are there for this festival?: ");
            organizers = Integer.parseInt(sc.nextLine());
        } while (organizers==0);

        Organizers Org = new Organizers();

        for (int i = 0; i < organizers; i++) {
            System.out.println("Enter First Name of Organizer: ");
            first_name = sc.nextLine();
            System.out.println("Enter Last Name of Organizer: ");
            last_name = sc.nextLine();
            System.out.println("Enter Email of Organizer: ");
            email = sc.nextLine();
            System.out.println("Enter Phone Number of Organizer: ");
            phone = sc.nextLine();

            Org.setFirst_Name(first_name);
            Org.setLast_Name(last_name);
            Org.setEmail(email);
            Org.setPhone(phone);
        }

        Fest_run.setOrganizers(Org);

        do {
            System.out.println("How many events are there for this festival?: ");
            events = Integer.parseInt(sc.nextLine());
        } while (events==0);



        for(int i = 0 ; i < events; i++) {
            Events eve = new Events();

            if (i==0) {
                System.out.println("Enter Name of First Event: ");
            }
            else {
                System.out.println("Enter Name of  Event: ");
            }
            name = sc.nextLine();
            System.out.println("Enter Date of Event: ");
            date = sc.nextLine();
            System.out.println("Enter description of Event: ");
            description =sc.nextLine();

            eve.setName(name);
            eve.setDate(date);
            eve.setDescription(description);

            System.out.println("Is this (1) Concert (2) Show or (0,3-9) Other Activity? (Enter an Integer):  ");
            type = Integer.parseInt(sc.nextLine());

            if (type == 1) {
                System.out.println("Enter name of Singer: ");
                singer = sc.nextLine();
                eve.addConcertDetails(singer);
            }
            else if (type == 2 ){
                do {
                    System.out.println("How many performers are part of this? ");
                    num = Integer.parseInt(sc.nextLine());
                } while (num==0);

                for (int j = 0; j<num ; j++ ){
                    System.out.println("Enter Full Name of Performer: ");
                    performer = sc.nextLine();
                    eve.addShowDetails(performer);
                }

            }
            else {
                System.out.println("Enter Further description regarding this event: ");
                description=sc.nextLine();
                eve.addOtherDetails(description);
            }

        Fest_run.setEvents(eve);
        Fest_run.Notify(eve);
        }
        return Fest;
    }
} */