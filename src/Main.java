import com.engeto.hotel.Booking;
import com.engeto.hotel.Guest;
import com.engeto.hotel.Room;
import com.engeto.hotel.TypeOfBooking;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Úkol Hotel");
        System.out.println("                                           ");


        //===GuestList===
        Guest guest1 = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan","Dvořáček", LocalDate.of(1995,5,5));
        List<Guest> guestList = new ArrayList<>();
        guestList.add(guest1);
        guestList.add(guest2);
        guestList.get(0);
        guestList.get(1);

        //===Room===
        Room room1 = new Room(1, 1, BigDecimal.valueOf(1000), true, true);
        Room room2 = new Room(2, 1, BigDecimal.valueOf(1000), true, true);
        Room room3 = new Room(3, 3, BigDecimal.valueOf(2400), false, true);

        //===typeOfBooking===

        //===Booking===
        // kniha rezervací
        Booking booking1 = new Booking(LocalDate.of(2021,7,19),LocalDate.of(2021,7,26),room1,guest1,"pracovní");
        Booking booking2 = new Booking(LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), room3, guest2,"dovolená");

        List<Booking> bookingList = new ArrayList<>();
        bookingList.add(booking1);
        bookingList.add(booking2);
        bookingList.get(0);
        bookingList.get(1);

        /*
        //druhý způsob
        bookingList.add(new Booking(LocalDate.of(2021,7,19),LocalDate.of(2021,7,26),room1,guest1,"pracovní"));
        bookingList.add(new Booking(LocalDate.of(2021,7,19),LocalDate.of(2021,7,26),room2,guest1,"pracovní"));
        bookingList.get(0);
        bookingList.get(1);
        */

        //=== Tisk guests obyčejný===
        System.out.println("Hosté: ");
        System.out.println(guest1.getFirstName()+" "+ guest1.getSecondName()+" " + "("+guest1.getBirthDate()+")");
        System.out.println(guest2.getFirstName()+" "+ guest2.getSecondName()+" " + "("+guest2.getBirthDate()+")");
        System.out.println("                                           ");
        System.out.println("                                           ");

        //Udělat lid guests


        //=== Tisk pomocí metody descriptionOfGuest ===
        System.out.println("================== Tisk pomocí metody descriptionOfGuest =====================");
        System.out.println(guest1.descriptionOfGuest());
        System.out.println(guest2.descriptionOfGuest());


/*
        //pomocí tostring
        System.out.println("==============pomocí tostring====================");
        System.out.println(guest1);
        System.out.println(guest2);
*/


        System.out.println("                                           ");
        System.out.println("                                           ");
        System.out.println("                                           ");
        System.out.println("================== Tisk rezervací =====================");
        System.out.println("Rezervace: " + booking1.description());
        System.out.println("Rezervace: " + booking2.description());

    }
}