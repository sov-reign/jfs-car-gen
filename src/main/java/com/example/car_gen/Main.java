package com.example.car_gen;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Honda civic = new Honda("white", 2019, 165, true);
        Lexus rx350 = new Lexus("silver", 2016, 130, true);
        Toyota supra = new Toyota("red", 1997, 175, false);

        System.out.println(civic.getColor());
        System.out.println(rx350.getColor());
        System.out.println(supra.getColor());

        ArrayList<Car> garage = new ArrayList<>();
        ArrayList<String> namesList = new ArrayList<>();
        addToGarage(garage, namesList, civic, "Civic");
        addToGarage(garage, namesList, rx350, "RX350");
        addToGarage(garage, namesList, supra, "Supra");

        accelTest(garage, namesList);
        decelTest(garage, namesList);
        isElectricTest(garage,namesList);

    }

    static public void addToGarage(ArrayList<Car> garage, ArrayList<String> names, Car car, String name){
        garage.add(car);
        names.add(name);
    }

    static public void accelTest(ArrayList<Car> garage, ArrayList<String> namesList){
        for (Car car : garage) {
            int cnt = (int) (Math.random() * 40);
            for(int i = 0; i <= cnt; i++){
                car.accelerateSpeed();
                System.out.println(namesList.get(garage.indexOf(car)) + " speed after throttle increase: " + car.getSpeed() + ".");
            }
        }
    }

    static public void decelTest(ArrayList<Car> garage, ArrayList<String> namesList){
        for (Car car : garage) {
            int cnt = (int) (Math.random() * 40);
            for(int i = 0; i <= cnt; i++){
                car.decelerateSpeed();
                System.out.println(namesList.get(garage.indexOf(car)) + " speed after throttle decrease: " + car.getSpeed() + ".");
            }
        }
    }
    static public void isElectricTest(ArrayList<Car> garage, ArrayList<String> namesList){
        for (Car car : garage) {
                System.out.println(namesList.get(garage.indexOf(car)) + " convertToElectric first return value: " + car.convertToElectric() + ".");
                System.out.println(namesList.get(garage.indexOf(car)) + " convertToElectric second return value: " + car.convertToElectric() + ".\n");
        }
    }
}