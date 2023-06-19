package com.engeto.hotel;

public enum TypeOfBooking {
    WORKING("pracovní"), HOLIDAY("dovolená");

    public final String label;

    TypeOfBooking(String label) {this.label = label;}

}
