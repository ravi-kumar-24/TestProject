package com.ravi.cisco;

public class PerfectSubString {

    static int MAX_CHAR = 10;

    static boolean check(int freq[], int k) {
        for (int i = 0; i < MAX_CHAR; i++) {
            if (freq[i] != 0 && freq[i] != k) {
                return false;
            }
        }
        return true;
    }

    public static int perfectSubstring(String s, int k) {
        // Write your code here
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int freq[] = new int[MAX_CHAR];
            for (int j = i; j < s.length(); j++) {
                int index = s.charAt(j) - '0';
                freq[index]++;
                if (freq[index] > k){
                    break;
                }
                else if (freq[index] == k &&
                        check(freq, k) == true){
                    res++;
                }
            }
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        String s ="1102021222";
        int k =2;
        System.out.println(perfectSubstring(s,k));
    }
}
