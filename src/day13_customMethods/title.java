package day13_customMethods;

public class title {
    public static void main(String[] args) {
        System.out.println(title("tIlBe"));
    }
    public static String title(String word){

        word=word.substring(0,1).toUpperCase()+word.substring(1,word.length()).toLowerCase();
        return word;
    }
}
