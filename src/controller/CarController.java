package controller;

import model.Car;

public class CarController {
    Car [] cars = new Car[100];
    public static int index = 0;

    public void purchaseCar(String brand, String model, double price, int year){
        Car c = new Car(brand,model,price,year);
        cars[index] = c;
        index++;
    }
    public void getCars(){
        for (int i = 0; i < index; i++){
            System.out.println(cars[i]);
        }
    }
}
