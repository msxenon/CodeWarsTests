package com.msa.appship;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task9 {
//    Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.
//
//    Examples:
//
//    spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
//    spinWords( "This is a test") => returns "This is a test"
//    spinWords( "This is another test" )=> returns "This is rehtona test"

    public static void main(String[] args) {
        System.out.println(new Task9().spinWords("Hey wollef sroirraw"));
    }
    public String spinWords(String sentence) {
        //TODO: Code stuff here
        String[] words = sentence.split("\\s+");
        for (String word:words){
            if(word.length()>=5){
                sentence = sentence.replace(word,reversedWord(word));
            }
        }
        return sentence;
    }
    private String reversedWord(String word){
        List<String> letters = new ArrayList<>();

        for (int i =0;i<word.length();i++){
           letters.add(String.valueOf(word.charAt(i)));
        }
        Collections.reverse(letters);
        StringBuilder revWord = new StringBuilder();
        for (String x : letters){
            revWord.append(x);
        }
        return revWord.toString();
    }
}
