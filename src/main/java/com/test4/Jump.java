package com.test4;

import java.util.Scanner;

/*
Have the function TrappingWater(arr) take the array of non-negative integers stored in arr, and determine the largest amount of water that can be trapped. The numbers in the array represent the height of a building (where the width of each building is 1) and if you imagine it raining, water will be trapped between the two tallest buildings. For example: if arr is [3, 0, 0, 2, 0, 4] then this array of building heights looks like the following picture if we draw it out:



        Now if you imagine it rains and water gets trapped in this picture, then it'll look like the following (the x's represent water):



        This is the most water that can be trapped in this picture, and if you calculate the area you get 10, so your program should return 10.

        Use the Parameter Testing feature in the box below to test your code with different arguments.

*/
public class Jump {
    public static int ArrayChallenge(int[] arr) {
        int n = arr.length;
        int res = 0;
        for (int i = 1; i < n - 1; i++) {
            int left = arr[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }
            int right = arr[i];
            for (int j = i + 1; j < n; j++) {
                right = Math.max(right, arr[j]);
            }
            res += Math.min(left, right) - arr[i];
        }
        return res;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
     //   System.out.print(ArrayChallenge(s.nextLine()));
    }
}