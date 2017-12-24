package com.msa.appship;
//Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)
//
//        HH = hours, padded to 2 digits, range: 00 - 99
//        MM = minutes, padded to 2 digits, range: 00 - 59
//        SS = seconds, padded to 2 digits, range: 00 - 59
//
//        The maximum time never exceeds 359999 (99:59:59)
//
//        You can find some examples in the test fixtures.

public class Task10 {
    public static void main(String[] args) {
        System.out.println(makeReadable(86399));
    }
    public static String makeReadable(int seconds) {
        String zHours="00",zMinutes="00",zSeconds ="00";
        int h=0,m=0,s=seconds;
        if(seconds>0){
            if (seconds>59){
                s = (seconds % 60)  ;
                if(seconds >= 3600){
                    m = seconds % 3600;
                    m = m / 60;
                    h = seconds / 3600;
                }else{
                    m = seconds/60;
                }

            }
            zSeconds = String.format("%02d",s);
            zMinutes = String.format("%02d",m);
            zHours = String.format("%02d",h);

        }
        return new StringBuilder().append(zHours).append(":").append(zMinutes).append(":").append(zSeconds).toString();
    }
}
