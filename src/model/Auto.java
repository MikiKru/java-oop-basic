package model;

public class Auto {
    public String brand;
    public String model;
    public int year;
    public String color;
    public String fuel_type;
    public double price;
    public char segment;
    // ALT + Ins

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", fuel_type='" + fuel_type + '\'' +
                ", price=" + price +
                ", segment=" + segment +
                '}';
    }
}
