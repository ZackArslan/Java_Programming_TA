package day17_customClass;

public class TestCarObject {

    public static void main(String[] args) {

        car car1=new car();
        car1.setInfo("Mercedes","C300",2018,"White",55000,32000);

        car car2=new car();
        car2.setInfo("BMW","I8",2024,"Blue",1200,68000);

        car car3=new car();
        car3.setInfo("Audi","A5",2022,"Black",30000,28000);

        car1.speed();

        car3.brand="Toyoto";

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
