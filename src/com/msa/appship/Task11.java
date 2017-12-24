package com.msa.appship;
//Complete the solution so that it reverses all of the words within the string passed in.
//
//        Example:
//
//        ReverseWords.reverseWords("The greatest victory is that which requires no battle");
//// should return "battle no requires which that is victory greatest The"

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
      reverseWords("eating like I[ ]");
    }
    public static String reverseWords(String str){
        List<String> x1 = Arrays.asList( str.split("\\s+"));
        Collections.reverse(x1);
        StringBuilder s = new StringBuilder();
        x1.stream().forEach((v) -> {
            s.append(v).append(" ");
        });
        return s.toString();
    }
}
