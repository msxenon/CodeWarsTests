package com.msa.appship;

import java.util.ArrayList;
import java.util.List;

//Description:
//        Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.
//
//        Rules for a smiling face:
//        -Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
//        -A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
//        -Every smiling face must have a smiling mouth that should be marked with either ) or D.
//        No additional characters are allowed except for those mentioned.
//        Valid smiley face examples:
//        :) :D ;-D :~)
//        Invalid smiley faces:
//        ;( :> :} :]
//
//        Example cases:
//
//        countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
//        countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
//        countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;
//
//
//        Note: In case of an empty array return 0. You will not be tested with invalid input (input will always be an array). Order of the face (eyes, nose, mouth) elements will always be the same
public class Task8 {

    public static void main(String[] args) {
        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
        System.out.println(countSmileys(a));
    }
    public static boolean hasEyes(String x){
        x = x.substring(0,1);
        return  x.equals(":")||x.equals(";");
    }
    public static boolean hasMouth(String x){
        x = x.substring(2,3);
        return  x.equals("D")||x.equals(")");
    }
    public static boolean hasNose(String x){
        x = x.substring(1,2);
        return  x.equals("-")||x.equals("~");
    }
    public static int countSmileys(List<String> arr) {
        // Just Smile :)
        String[] smiles = new String[]{":)",":D",";)",";D"};
        int smilesCount = 0;
        for (String str:arr){
            if(str.length()==2) {
                for (String smile : smiles) {
                    if (str.equals(smile)) {
                        smilesCount++;
                    }
                }
            }else if (str.length()==3){
                if(hasEyes(str)&&hasNose(str)&&hasMouth(str))
                    smilesCount++;
            }
        }

        return smilesCount;
    }
}
