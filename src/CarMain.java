import controller.CarController;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        // GUI
        Scanner sc = new Scanner(System.in);
        System.out.println("AUTO FACTORY");
        boolean flag = true;

        // utworzenie obiektu kontrolera
        CarController cc = new CarController();
        while (flag) {
            System.out.println("1.Zamówienie auta \n2.Lista zamówień \n0.Wyjście");
            // odczyt wartości ze skanera
            int decision = sc.nextInt();
            // konsumpcja \n
            sc.nextLine();
            switch (decision){
                case 1:
                    // wczytanie brand, model, price, year ze skanera
                    System.out.println("Podaj markę");
                    String brand = sc.nextLine();
                    System.out.println("Podaj model");
                    String model = sc.nextLine();
                    System.out.println("Podaj cenę");
                    double price = sc.nextDouble();
                    System.out.println("Podaj rok");
                    int year = sc.nextInt();
                    sc.nextLine();
                    cc.purchaseCar(brand, model, price, year);
                    break;
                case 2:
                    // odwołanie się do składowej statycznej
                    System.out.println(CarController.index);
                    cc.getCars();
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Błędny wybór!");
            }
        }
    }
}
