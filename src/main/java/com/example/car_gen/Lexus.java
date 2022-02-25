package com.example.car_gen;

public class Lexus extends Car {
    private boolean hasLeatherSeats;

    public boolean HasLeatherSeats() {
        return hasLeatherSeats;
    }

    public void setHasLeatherSeats(boolean hasLeatherSeats) {
        this.hasLeatherSeats = hasLeatherSeats;
    }

    public Lexus(String color, int year, int maxSpeed, boolean hasLeatherSeats){
        super(color, year, maxSpeed);
        this.hasLeatherSeats = hasLeatherSeats;
    }
}