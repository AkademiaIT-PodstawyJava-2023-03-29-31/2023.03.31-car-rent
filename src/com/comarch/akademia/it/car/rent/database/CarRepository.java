package com.comarch.akademia.it.car.rent.database;

import com.comarch.akademia.it.car.rent.model.Car;

public class CarRepository {
    private Car[] cars = new Car[5];

    public CarRepository() {
        this.cars[0] = new Car("Kia", "Ceed",
                200.00, 2015, "KR11");
        this.cars[1] = new Car("BMW", "5",
                400.00, 2017, "KR22");
        this.cars[2] = new Car("Toyota", "Corolla",
                300.00, 2018, "KR33");
        this.cars[3] = new Car("Audi", "A6",
                500.00, 2021, "KR44");
        this.cars[4] = new Car("Volvo", "V50",
                350.00, 2019, "KR55");
    }

    public Car[] getCars() {
        return cars;
    }

    public boolean rentCar(String plate) {
        for(Car car : this.cars) {
            if(car.getPlate().equals(plate) && !car.isRent()) {
                car.setRent(true);
                return true;
            }
        }

        return false;
    }
}
