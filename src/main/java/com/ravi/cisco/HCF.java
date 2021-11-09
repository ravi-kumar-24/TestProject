package com.ravi.cisco;

public class HCF {

    public static int countProperFractions(int max_d) {
        int count = 0;
        for (int i = max_d; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                if (j < i) {
                    if (gcd(j, i) == 1) {
                        System.out.println(j+"/"+i);
                        count++;
                    }
                }
            }
        }
        //System.out.println(count);
        return count;
    }
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int count =countProperFractions(8);

        System.out.println(count);
    }
}
