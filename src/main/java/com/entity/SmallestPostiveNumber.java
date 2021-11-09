package com.entity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SmallestPostiveNumber {

    public int solution(int[] A) {
              // Arrays.sort(A);

        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < A.length ; i++) {
            if(A[i]>0)
            set.add(A[i]);
        }

        boolean flag = false;
        int count = 1;

        for (Integer a: set ) {
            if(a == count){
                count ++;
                flag = true;
            }else  {
                break;
            }
        }


        if(count == A.length){
            return count +1 ;
        }
        return flag ? count:1;
    }

    public static void main(String[] args) {
        SmallestPostiveNumber smallestPostiveNumber = new SmallestPostiveNumber();
        int[] arr = {1, 3, 6, 4, 1, 2};
        int s =smallestPostiveNumber.solution(arr);
        System.out.println(s);
    }
}
