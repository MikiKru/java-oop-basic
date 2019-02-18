import model.Auto;

public class Main {
    public static void main(String[] args) {
        // Utworzenie obiektu klasy
        Auto a1 = new Auto();
        // Odwołanie do pól klasowych -> obiekt.pole
        System.out.println("Brand: " + a1.brand);
        System.out.println("Model: " + a1.model);
        System.out.println("Production: " + a1.year);
        System.out.println("Color: " + a1.color);
        System.out.println("Fuel: " + a1.fuel_type);
        System.out.println("Price: " + a1.price);
        System.out.println("Segment: " + a1.segment);
        // Zmiana pól klasowych
        a1.brand = "BMW";
        a1.model = "X5";
        a1.year = 2010;
        a1.color = "BLACK";
        a1.fuel_type = "DIESEL";
        a1.price = 89_999;
        a1.segment = 'S';
        System.out.println("Brand: " + a1.brand);
        System.out.println("Model: " + a1.model);
        System.out.println("Production: " + a1.year);
        System.out.println("Color: " + a1.color);
        System.out.println("Fuel: " + a1.fuel_type);
        System.out.println("Price: " + a1.price);
        System.out.println("Segment: " + a1.segment);

        System.out.println(a1);

    }
}
