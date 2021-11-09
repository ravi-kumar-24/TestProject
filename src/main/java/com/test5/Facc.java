package com.test5;

public class Facc {

    public static void main(String[] args) {
      int x =  fibonacciRecursion(7);
        System.out.println(x);
    }

    public static  int getNth(int n){
        int sum = 1 ;
        System.out.println("start "+n);
        while(n==1){
           return  sum;
        }
            n =n -1;
            sum = sum + getNth (n);


        return sum;

    }
    public static int fibonacciRecursion(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
    }

    public static int getNth1(int n){
        int first = 0;
        int sec = 1;
        int sum = 0;

        if(n ==1 || n==2){
            return 1;
        }
        for(int i=1; i<n ; i++){
            sum = first + sec;
            first = sec;
            sec = sum;

        }
        return sum;

    }

}


