package com.example.car_gen;

public class Toyota extends Car {
    private boolean greatGasMileage;
    public boolean isGreatGasMileage() {
        return greatGasMileage;
    }

    public void setGreatGasMileage(boolean greatGasMileage) {
        this.greatGasMileage = greatGasMileage;
    }

    public Toyota(String color, int year, int maxSpeed, boolean greatGasMileage){
        super(color, year, maxSpeed);
        this.greatGasMileage = greatGasMileage;
    }
}