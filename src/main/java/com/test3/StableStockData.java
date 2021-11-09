package com.test3;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StableStockData {

    public static void main(String[] args) {

       List<Integer> arr = Arrays.asList(1,2,1,2,2,1,3,1,1,2,2,2,2);
      //  int[] arr = {2,4,3,6,6,3};
        int value = 1;

       List<Integer> a = getStableStockData(arr, value);

        for (int i = 0; i <a.size() ; i++) {
            System.out.print(a.get(i) +", ");
        }


        
    }

   static  List<Integer> getStableStockData(List<Integer> data, int x){

        int count =0;
        int startInt =0;

        int maxLength =0;
        int maxStartInt =0;

        for (int i = 0; i < data.size() -1; i++) {
            if(Math.abs(data.get(i) -data.get(i+1)) <=x) {
                if(count==0) {
                    startInt = i;
                }
                count++;
                if(count > maxLength){
                    maxLength =count  ;
                    maxStartInt = startInt;
                }
            }else {
               count =0;
               startInt =0;
            }
        }
       // System.out.println(maxLength +1 +" "+ maxStartInt);

        int max = maxStartInt+maxLength+1;

        return data.subList(maxStartInt, max);
       // return Arrays.copyOfRange(arr, maxStartInt, maxStartInt+maxLength+1);
    }
}
