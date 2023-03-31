package com.comarch.akademia.it.car.rent;

import com.comarch.akademia.it.car.rent.database.CarRepository;
import com.comarch.akademia.it.car.rent.gui.GUI;

public class App {
    public static void main(String[] args) {
        // tworzymy baze danych i wczytywacz
        // (chcemy miec po jednym egzemplarzy w aplikacji)
        CarRepository baza = new CarRepository();
        GUI gui = new GUI();

        //petla programu (menu wyswietla sie ponownie po wykonaniu akcji
        boolean run = true;
        while(run) {
            String choose = gui.showMenu();
            //decyzja co robimy
            switch (choose) {
                //1 przypadek - wyswietlamu samochody
                case "1":
                    //pobieramy z bazy liste aut i podajemy do metody w GUI
                    gui.showCars(baza.getCars());
                    break;
                //2 przypadek - odpalamy mechanizm do wypozyczenia auta
                case "2":
                    //GUI pobiera nam tablice od użytkownika
                    String plate = gui.readPlate();
                    //prosimy baze żeby wypożyczyłą auto
                    boolean success = baza.rentCar(plate);
                    //proisimy gui żeby wyświetliło wynik wypożyczania
                    gui.showRentResult(success);
                    break;
                //3 przypadek - wyjście z programu
                //wystarczy zmenić zmienną run na false
                case "3":
                    run = false;
                    System.out.println("Exit !!");
                    break;
                //jesli zostanie wpisany niepoprawny wybor to wyswietlamy komunikat
                default:
                    System.out.println("Wrong choose !!!");
                    break;
            }
        }
    }
}
