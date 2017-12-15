package com.msa.appship;

public class Main {

//    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//
//    Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
//
//            Note: If the number is a multiple of both 3 and 5, only count it once.

    public static void main(String[] args) {
	  System.out.print(solution(23));
    }
    public static int solution(int number) {
        int sum =0;
        for (int i=3;i<number;i++){
           int mThree = i % 3;
           int mFive = i % 5;
           if (mFive == 0 || mThree == 0){
               sum+=i;
           }
        }
        return sum;
    }
}
