package coma.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShortestDistance {

    public static void main(String[] args) {
        List<String> s = Arrays.asList("geeks", "for", "geeks", "contribute",
                "practice");
        String word1 = "geeks";
        String word2 = "practice";
        System.out.println(shortestDistance(s, word1, word2));

        String A = "abcd";
        String B = "cdabcdabc";
        System.out.println(minRepeats(A,B));
    }

    static int minRepeats(String A, String B) {
        // code here
        int c= ( int )Math.ceil( ( float ) B.length() / A.length() );
        String newStr = String.join("", Collections.nCopies(c, A));
        if( newStr.contains(B) ){
            return c;
        }
        String newStr1 = String.join("", Collections.nCopies(c+1, A));
        if( newStr1.contains(B) ){
            return c+1;
        }
        return -1;
    }
    static int shortestDistance(List<String> s, String word1, String word2) {
        int diff = -1;
        int maxdiff =Integer.MAX_VALUE;
        int strPos1 =0;
        int strPos2 =0;

        boolean changed = false;

        for (int i = 0; i < s.size() ; i++) {
            if (word1.equals(s.get(i))) {
                strPos1 =i;
               // changed = true;
            }else if (word2.equals(s.get(i))) {
                strPos2 =i;
                changed = true;
            }

            if( changed ){
               /* diff = strPos1 > strPos2 ? strPos1 - strPos2: strPos2 - strPos1;
                if(diff < maxdiff){
                    maxdiff= diff;
                }*/

                maxdiff = strPos2 -strPos1;
                return maxdiff +1;
            }
        }

        return maxdiff;
    }
}
