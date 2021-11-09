package com.test3;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class PaymentPairs {

    public static  long test(List<Integer> payments){
        int count = 0; // Initialize result
        int sum = 100;
        // Consider all possible pairs and check their sums
        for (int i = 0; i < payments.size() ; i++) {
            if(payments.get(i) + payments.get(i+1) >=100){


            for (int j = i + 1; j < payments.size(); j++) {
                if ((payments.get(i) + payments.get(j)) % sum == 0) {
                    count++;
                }
            }
        }
        }
        return count;
    }



    public static long distinctPaymentPairs(List<Integer> payments) {

        int sum = 100;
        int count = 0;

        Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
        for (int i : payments) {
            int temp =i;
            i = i % 100;
            if (pairs.containsKey(i)) {
                if(temp>99 && i==0){
                    count++;
                }else  if (pairs.get(i) != null) {
                    count++;
                    pairs.put((sum - i) , null);
                }
            } else if (!pairs.containsValue(i)) {
                pairs.put((sum - i), i);
            }
        }
         return count;

    /*    Map<Integer, Integer> pairsss = new HashMap();
        List<Integer> intList = new ArrayList<>();
        IntStream.range(0, payments.size()).forEach(i -> {
            if (pairsss.containsKey(payments.get(i))) {
                if (pairsss.get(payments.get(i)) != null) {
                    intList.add(1);
                    // count++;
                }
                pairsss.put(sum - payments.get(i), null);
            } else if (!pairsss.containsValue(payments.get(i))) {
                pairsss.put(sum - payments.get(i), payments.get(i));
            }
        });
        return intList.size();*/

    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(100,200,300);
        System.out.println( distinctPaymentPairs(arr));
    }

}
