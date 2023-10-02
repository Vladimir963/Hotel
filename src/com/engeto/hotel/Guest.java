package com.engeto.hotel;

import java.time.LocalDate;

public class Guest {

    String firstName;
    String secondName;
    LocalDate birthDate;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Guest(String firstName, String secondName, LocalDate birthDate) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDate = birthDate;
    }


    public String descriptionOfGuest() {
        return firstName+" "+secondName+" ("+birthDate+")";
    }
/*
    @Override
    public String toString() {
        return firstName+" "+secondName+" ("+birthDate+")";
    }
*/



}
