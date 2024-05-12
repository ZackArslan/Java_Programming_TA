package day17_customClass;

public class car {

    public String brand;
    public String model;
    public int year;
    public String color;
    public int mile;
    public double price;

    public void setInfo(String brand, String model, int year, String color, int mile, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.mile = mile;
        this.price = price;
    }

    public String toString() {
        return "car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", mile=" + mile +
                ", price=" + price +
                '}';
    }
    public void speed(){
        System.out.println(brand+" is going fast");
    }
}
