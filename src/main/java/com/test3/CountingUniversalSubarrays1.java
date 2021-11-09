package com.test3;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class CountingUniversalSubarrays1 {

    public static int countingUniversalSubarrays(List<Integer> array) {
        int n = array.size();
        if (n <= 1) return 0;
        int result = 0;

        Vector<Integer> freqs = new Vector<>();
        int count = 1;

        for (int i = 1; i < n; ++i) {
            if (array.get(i) == array.get(i - 1)) {
                count++;
            } else {
                freqs.add(count);
                count = 1;
            }
        }
        freqs.add(count);

        n = freqs.size() - 1;
        for (int i = 0; i < n; ++i) {
            result += Math.min(freqs.get(i), freqs.get(i + 1));
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(4,4,2,2,4,2);
      int a =  countingUniversalSubarrays(arr);
        System.out.println(a);
    }
}
