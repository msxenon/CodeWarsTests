package com.msa.appship;

public class HomeTask {
    public enum Method{
        Multiplication,Sum,Substraction,MultiplyByStaticNumber
    }
    public static int staticNumber = Integer.MIN_VALUE;
    public static void main(String[] args) throws Exception {
        double[][] x = new double[1][2];
        x[0][0] = 1;
        x[0][1] = 2;

        double[][] y = new double[1][2];
        y[0][0] = 3;
        y[0][1] = 4;
staticNumber = 2;
arrays(Method.MultiplyByStaticNumber,x,y );
    }
    public static double arrays(Method method, double[][] arr1,double[][] arr2 ) throws Exception {
         if(method.name().equals(Method.MultiplyByStaticNumber.name()) && staticNumber == Integer.MIN_VALUE){
             throw new Exception("Please set a static number to multiply with");
         }
        double result = 0;
        int twoarraysLength = arr1.length+arr2.length;
        //Inserting doubles
        double[][] array = new double[twoarraysLength][2];
        for (int i =0;i<arr1.length;i++) {
            for (int x = 0; x < arr1[i].length; x++) {
                array[i][x] = arr1[i][x];
            }
        }
        for (int i =0;i<arr2.length;i++) {
            for (int x = 0; x < arr2[i].length; x++) {
                array[i+arr1.length][x] = arr2[i][x];
            }
        }
        System.out.println(array[0][1]);
        for (int i =0;i<array.length;i++){
            for (int x = 0;x<array[i].length;x++){
                System.out.println(i +" "+array[i][x]);

                switch (method){

                    case Substraction:
                        result-=array[i][x];
                        break;
                    case Sum:
                        result+=array[i][x];
                        break;
                    case Multiplication:
                        if(i==0)
                            result = array[0][0];
                        result*=array[i][x];
                        break;
                    case MultiplyByStaticNumber:
                        if(i==0)
                            result = array[0][0];
                        result*=array[i][x];
                        break;
                        default:
                            break;
                }
            }
        }
        if(method.name().equals(Method.MultiplyByStaticNumber.name())){
            result*=staticNumber;
        }
        System.out.println("Result of "+method.name()+" is " + result);
        return result;
    }
}
