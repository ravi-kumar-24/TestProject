package coma.strings;

import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {
        String str1 = "uovwhqfaemqodyksjj", str2="swwhzsiowocjfyadvj";
        int k =18 ;
        System.out.println(areKAnagrams(str1,str2,k));
    }

   private static boolean areKAnagrams(String s1, String s2, int k) {
        if(s1.length() !=s2.length()){
            return false;
        }

        int[] arr1 = new int[26];
       //char[] arr2 = new char[256];

       for (char c: s1.toCharArray()) {
           arr1[c -97]++;
       }

       for (char c : s2.toCharArray()) {
           arr1[c -97]--;
       }


       int total = Arrays.stream(arr1 ).filter(s ->s >0)
               .sum();
      // System.out.println("total "+ total);
       if (total <=k){
           return true;
       }else {
           return false;
       }
        // code here
    }
}
