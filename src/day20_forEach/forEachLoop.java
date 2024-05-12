package day20_forEach;

public class forEachLoop {
    public static void main(String[] args) {

        int[] numbers={10,20,30,40,50};

        for (int i = 0; i < numbers.length; i++) { //we can change i=2 than it will start running from second index
            System.out.println(numbers[i]);
        }

        System.out.println("-----------------------------");
        //for each loop

        for(int each : numbers){
            System.out.println(each);   //disadvantage is you cant change the order it has to start from beginning to end
        }
        //doesn't have index number , it accesses only elements
    }
}
