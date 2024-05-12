package day18_garbageCollection;

class Car{

    public String brand;
    public String model;
    public String color;
    public int year;


}

public class memoryAllocation {
    public static void main(String[] args) {

        int a =100;  //local variable, "allocation in stack "

        Car car = new Car();
        // stack     heap
    }

    public  static void method1(){
        int b =200; //local variable ," allocation in stack"
    }

    public static void method2(){
        String c="Hello world";  //because hello world is an object
        //stack     heap (String pool)
    }
}
