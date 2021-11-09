package com.ravi.americal.express;

import java.util.Arrays;
import java.util.List;

public class MS_Concatenated_String_Length_with_unique_Characters {

    private static int max = 0;
    public int solution(String[] A) {
        List<String> arr = Arrays.asList(A);
                dfs(arr, 0, "");
        return max;
    }

    public void dfs(List<String> arr, int index, String concatenatStr) {
        //candidates for Maximum Length of a Concatenated String with Unique Characters
        if (isUnique(concatenatStr)) {
            max = Math.max(max, concatenatStr.length());
        }
        //invalid entry, just return
        if (index == arr.size() || !isUnique(concatenatStr)) {
            return;
        }
        for (int i = index; i < arr.size(); i++) {
            dfs(arr, i + 1, concatenatStr + arr.get(i));
        }
    }

    //method to check if all the char in s are unique
    public boolean isUnique(String s) {
        int[] alpha = new int[26];
        for (int i = 0; i < s.length(); i++) alpha[s.charAt(i) - 'a']++;
        for (int i = 0; i < alpha.length; i++) if (alpha[i] > 1) return false;
        return true;
    }
}
