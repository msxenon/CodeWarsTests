package com.msa.appship;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
//        System.out.println(Tickets(new int[]{25,50}));
//        System.out.println(Tickets(new int[]{255,50}));
//
//        System.out.println(Tickets(new int[]{25,25}));
//
//        System.out.println(Tickets(new int[]{25,75}));
        System.out.println(Tickets(new int[]{25,25,100}));
//
//        System.out.println(Tickets(new int[]{25,25,50}));
//        System.out.println(Tickets(new int[]{25,50}));




    }
    public static String Tickets(int[] peopleInLine)
    {
        System.out.println(Arrays.toString(peopleInLine));

        String x = "NO";
        int clerekMoney = 0;
        for (int i:peopleInLine){
            int change = i - 25;
            if(change==0) {
                x = "YES";
                clerekMoney+=i;
            } else if (change<=clerekMoney){
                x = "YES";
                clerekMoney = clerekMoney - change;
                clerekMoney+=i;
            }else if (change>clerekMoney){
                x = "NO";
                break;
            }
            System.out.println(change +" "+clerekMoney);

        }
return x;
    }
}
