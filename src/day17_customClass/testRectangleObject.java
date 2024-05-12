package day17_customClass;

public class testRectangleObject {
    public static void main(String[] args) {

        rectangle rectangle1=new rectangle();
        rectangle1.setInfo(5,3);

        rectangle rectangle2= new rectangle();
        rectangle2.setInfo(10,20);

        System.out.println(rectangle1);
        System.out.println(rectangle2);

        rectangle1.area();
        rectangle1.perimeter();
        rectangle2.area();
        rectangle2.perimeter();


    }

}
