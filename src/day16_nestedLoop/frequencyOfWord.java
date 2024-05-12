package day16_nestedLoop;

public class frequencyOfWord {
    public static void main(String[] args) {

        String sentence="JaVa JAva JAvA JaVA";
        String word="Java";
        sentence=sentence.toLowerCase();
        word=word.toLowerCase();
        int count=0;
        while(sentence.contains(word)){
            count++;
            sentence=sentence.replaceFirst(word,""); //3 java remaining
            //we replace every java with empty string

        }
        System.out.println(count);



    }
}
