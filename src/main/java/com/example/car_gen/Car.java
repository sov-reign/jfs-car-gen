package com.example.car_gen;

public class Car {
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private String color;
    private boolean isElectric;

    public Car(String color, int year, int maxSpeed){
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int accelerateSpeed(){
        int newSpeed = speed + 5;
        speed = newSpeed > maxSpeed ? maxSpeed : newSpeed;
        return speed;
    }
    public int decelerateSpeed(){
        int newSpeed = speed - 5;
        speed = newSpeed < 0 ? 0 : newSpeed;
        return speed;
    }

    public boolean convertToElectric(){
        if(this.isElectric)
        {
            System.out.println("This vehicle is already electrically powered.");
            return true;
        }
        else{
            this.isElectric = true;
            System.out.println("This vehicle was not electrically powered, but it is now.");
            return false;
        }
    }
}