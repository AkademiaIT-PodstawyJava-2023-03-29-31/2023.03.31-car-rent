package com.comarch.akademia.it.car.rent.model;

public class Car {
    private String brand;
    private String model;
    private double price;
    private int year;
    private String plate;
    private boolean rent;

    public Car(String brand, String model, double price,
               int year, String plate) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
        this.plate = plate;
        this.rent = false;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getPlate() {
        return plate;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }
}
