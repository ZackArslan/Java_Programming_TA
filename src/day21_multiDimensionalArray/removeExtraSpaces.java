package day21_multiDimensionalArray;

public class removeExtraSpaces {
    public static void main(String[] args) {

        String str="   Hello world     I      love    java  ";

        String[] words= str.split(" ");  //we split by spaces first
        //System.out.println(Arrays.toString(words));

        str="";

        for (String each : words) {
            if(!each.isEmpty()){
                str+=each+" ";
            }
        }
        str=str.trim(); //to remove the last space
        System.out.println(str);
    }
}
