package com.msa.appship;

import sun.applet.Main;

public class Task2 {
//    Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013). Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter, he is known for almost always capitalizing every word.
//
//    Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
//
//    Example:
//
//    Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
//    Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
//
//    Note that the Java version expects a return value of null for an empty string or null.
    public static void main(String[] args){
        System.out.print(toJadenCase("heelo maya[  ]"));
    }
public static String toJadenCase(String phrase) {
    if(phrase!=null && !phrase.isEmpty()){
         String[] words = phrase.split("\\s+");
         for (String word: words){
            System.out.println(word + word.length() + words.length );
            if(word.length()==1)
                continue;
             if(Character.isLetter(word.charAt(0))) {
                 String capWORD = Character.toUpperCase(word.charAt(0)) +  (word.length()>1?word.substring(1):"");
                 phrase = phrase.replace(word, capWORD);
             }
        }
        return phrase;
    }

    return null;
}
}
