package com.comarch.akademia.it.car.rent.gui;

import com.comarch.akademia.it.car.rent.model.Car;

import java.util.Scanner;

public class GUI {
    private Scanner wczytywacz = new Scanner(System.in);
    public String showMenu() {
        //wyswietlanie menu
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Exit");
        System.out.print("Your choose: ");

        //wczytanie wyboru użytkownika i zwrócenie
        return this.wczytywacz.nextLine();
    }

    public void showCars(Car[] cars) {
        for(Car car : cars) {
            System.out.println(car.getBrand() + " " +
                    car.getModel() + " " + car.getPlate() +
                    " " + car.getPrice() + " " + car.getYear() +
                    " " + car.isRent());
        }
    }

    public String readPlate() {
        System.out.print("Write plate: ");
        //wczytujemy tablice
        return this.wczytywacz.nextLine();
    }

    public void showRentResult(boolean result) {
        if(result) {
            System.out.println("Success !!");
        } else {
            System.out.println("Error !!");
        }
    }
}
