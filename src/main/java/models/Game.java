package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
    public String findAndReplce(String sentence, String wordToReplace, String replacementWord) {

        if(sentence.equals(wordToReplace)){
            return replacementWord;
        } else {
            return sentence;
        }


//        List<String> words = new ArrayList<String>(Arrays.asList(sentence.split(" ")));
//        for (int i = 0; i < words.size() ; i++) {
//            if(words.get(i).equals(wordToReplace)) {
//                words.set(i, replacementWord);
//            }
//        }
//        return ;
    }
}
