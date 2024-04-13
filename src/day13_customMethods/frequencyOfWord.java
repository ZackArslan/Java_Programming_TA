package day13_customMethods;

public class frequencyOfWord {
    public static void main(String[] args) {
        String str = "I love tilbe tilbe tilbe tilbe tilbe";
        System.out.println(FrequencyOfWord(str, "TilBE"));

    }

    public static int FrequencyOfWord(String sentence, String word){

        sentence= sentence.toLowerCase();
        word=word.toLowerCase();

        int index = sentence.indexOf(word);

        if(index==-1){
            return 0;
        }

        return 1 +  FrequencyOfWord(sentence.substring(index + word.length()), word);

    }




}