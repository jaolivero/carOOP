package com.carObject;

public class Car {
    public String model;
    public String make;
    public int year;
    public String engine;

    public Car(String model, String make, int year, String engine) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.engine = engine;
    }

    public void startUp() {
        System.out.println(engine == "gas" ? "VROOM!!!" : ".........");
    }

    public void engineStop() {
        System.out.println("Vehicle is off!!!...");
    }
}

class Toyota extends Car
{
    public Toyota (String model, int year, String engine) {
        super(model, "Toyota", year, engine);
    }
    int price = 20_000;
}

class Tesla extends Car {
    public Tesla (String model, int year, String selfDriving) {
        super(model, "Tesla", year, "electric");
        this.selfDriving = selfDriving;
    }

    public String selfDriving;
}