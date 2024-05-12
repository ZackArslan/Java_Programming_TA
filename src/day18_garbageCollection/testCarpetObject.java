package day18_garbageCollection;

public class testCarpetObject {
    public static void main(String[] args) {

        carpet carpet1=new carpet();
        carpet1.setInfo(5,6,10,true);
        System.out.println(carpet1);
        System.out.println(carpet1.calcCost());
    }
}
