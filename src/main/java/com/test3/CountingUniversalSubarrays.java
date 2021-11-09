package com.test3;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CountingUniversalSubarrays {


    public static int countingUniversalSubarrays(List<Integer> arr) {

        return countUniversal(2, arr) + countUniversal(4, arr);
    }

    public static int countUniversal(int left, List<Integer> A) {
        Stack<Integer> stack = new Stack<>();
        int cnt = 0;
        int n = A.size();

        for (int i = 0; i < n; i++) {
            if (left == A.get(i)) {
                stack.add(i);
            } else {
                if (!stack.isEmpty()) {
                    cnt++;
                    stack.pop();
                }
                if (i < n - 1 && A.get(i + 1) == left) {
                    stack.clear();
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        List<Integer> lits= Arrays.asList(4,4,2,2,4,2);
        int result = countingUniversalSubarrays(lits);
        System.out.println(result);
    }
}