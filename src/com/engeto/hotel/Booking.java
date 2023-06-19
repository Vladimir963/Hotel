package com.engeto.hotel;

import java.time.LocalDate;
import java.util.List;

public class Booking {

    LocalDate startOfBooking;
    LocalDate endOfBooking;
    Room room;
    Guest guest;
    List<Guest> guestList;
    String typeOfBooking;

    @Override
    public String toString() {
        return "Booking{" +
                "startOfBooking=" + startOfBooking +
                ", endOfBooking=" + endOfBooking +
                ", room=" + room.numberOfRoom +
                ", guest=" + guest +
                ", guestList=" + guestList +
                ", typeOfBooking='" + typeOfBooking + '\'' +
                '}';
    }

    public String description(){
        return "Booking{" +
                "startOfBooking=" + startOfBooking +
                ", endOfBooking=" + endOfBooking +
                ", room=" + room.numberOfRoom +
                ", guest=" + guest +
                ", guestList=" + guestList +
                ", typeOfBooking='" + typeOfBooking + '\'' +
                '}';
    }


    public LocalDate getStartOfBooking() {
        return startOfBooking;
    }
    public void setStartOfBooking(LocalDate startOfBooking) {
        this.startOfBooking = startOfBooking;
    }
    public LocalDate getEndOfBooking() {
        return endOfBooking;
    }
    public void setEndOfBooking(LocalDate endOfBooking) {
        this.endOfBooking = endOfBooking;
    }

    public Booking(LocalDate startOfBooking, LocalDate endOfBooking, Room room, Guest guest, String typeOfBooking) {
        this.startOfBooking = startOfBooking;
        this.endOfBooking = endOfBooking;
        this.room = room;
        this.guest = guest;
        this.typeOfBooking = typeOfBooking;
    }

    public Booking(List<Guest> guestList) {
        this.guestList = guestList;
    }

    public Booking(LocalDate startOfBooking, LocalDate endOfBooking, Room room, Guest guest, List<Guest> guestList, String typeOfBooking) {
        this.startOfBooking = startOfBooking;
        this.endOfBooking = endOfBooking;
        this.room = room;
        this.guest = guest;
        this.guestList = guestList;
        this.typeOfBooking = typeOfBooking;
    }


}
