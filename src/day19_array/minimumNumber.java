package day19_array;

public class minimumNumber {
    public static void main(String[] args) {

        int[] numbers={10,20,-10,90,30};

        int min=numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println("Min= "+min);

    }
}
