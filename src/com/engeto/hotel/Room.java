package com.engeto.hotel;

import java.math.BigDecimal;

public class Room {

    Integer numberOfRoom;
    Integer numberOfBad;
    BigDecimal priceOfRoom;
    Boolean balcony;
    Boolean seaView;

    public Room(Integer numberOfRoom, Integer numberOfBad, BigDecimal priceOfRoom, Boolean balcony, Boolean seaView) {
        this.numberOfRoom = numberOfRoom;
        this.numberOfBad = numberOfBad;
        this.priceOfRoom = priceOfRoom;
        this.balcony = balcony;
        this.seaView = seaView;
    }

    public Integer getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(Integer numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public Integer getNumberOfBad() {
        return numberOfBad;
    }

    public void setNumberOfBad(Integer numberOfBad) {
        this.numberOfBad = numberOfBad;
    }

    public BigDecimal getPriceOfRoom() {
        return priceOfRoom;
    }

    public void setPriceOfRoom(BigDecimal priceOfRoom) {
        this.priceOfRoom = priceOfRoom;
    }

    public Boolean getBalcony() {
        return balcony;
    }

    public void setBalcony(Boolean balcony) {
        this.balcony = balcony;
    }

    public Boolean getSeaView() {
        return seaView;
    }

    public void setSeaView(Boolean seaView) {
        this.seaView = seaView;
    }

}


