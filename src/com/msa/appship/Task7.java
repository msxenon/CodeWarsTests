package com.msa.appship;

import java.util.*;

public class Task7 {

    public static void main(String[] args) {
//find number of unique duplicated chars in text
int cc = new Task7().duplicateCount("acaghma");
         System.out.println(cc);

     }
    public  int duplicateCount(String text) {
         HashMap<Character,Integer> dubs = new HashMap<>();
        char[] o = text.toCharArray();
        for (char x:o){
            if(dubs.containsKey(x)){
                int i = dubs.get(x);
                i+=1;
                dubs.put(x,i);
            }else{
                dubs.put(x,1);
            }
        }
        int c = 0;
        for (int h:dubs.values()){
            if(h >= 2){
                c++;
             }
        }
        return c;
    }
}
