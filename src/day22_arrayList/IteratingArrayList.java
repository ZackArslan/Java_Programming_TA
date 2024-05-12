package day22_arrayList;

import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3,255); //we add 255 to index 3

        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
           int each= numbers.get(i);
            System.out.println(each);
        }
        System.out.println("---------reverse-----------");
        for (int i = numbers.size() - 1; i >= 0; i--) {
            int reverse= numbers.get(i);
            System.out.println(reverse);
        }

        System.out.println("-----------forEachLoop---------");

        for (Integer eachElement : numbers) {
            System.out.println(eachElement);
        }

    }
}
