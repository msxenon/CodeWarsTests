package com.msa.appship;

public class Task5 {
//    Given the triangle of consecutive odd numbers:
//
//            1
//            3     5
//            7     9    11
//            13    15    17    19
//            21    23    25    27    29
//            ...
//
//    Calculate the row sums of this triangle from the row index (starting at index 1) e.g.:
//
//    rowSumOddNumbers(1); // 1
//    rowSumOddNumbers(2); // 3 + 5 = 8

    public static void main(String[] args){
        System.out.println(rowSumOddNumbers(42));
    }
    public static int rowSumOddNumbers(int n) {
        int total=0;
        for (int i=0;i<n;i++){
            total+=i;
        }
        int firstNum=2*total+1;
        System.out.println(firstNum);
        int sum=0;
        for (int j=0;j<n;j++){
            sum+=firstNum;
            firstNum+=2;
         }
        return sum;
    }
}
