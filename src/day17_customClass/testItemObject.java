package day17_customClass;

public class testItemObject {
    public static void main(String[] args) {

        item item1=new item();
        item1.setInfo("Table",50,3);

        System.out.println(item1.calcCost());

        System.out.println(item1);

    }
}
