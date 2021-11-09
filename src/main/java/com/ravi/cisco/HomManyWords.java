package com.ravi.cisco;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomManyWords {

    public static int howMany(String sentence) {
        // Write your code here
        int count = 0;
        String[] words = sentence.split("\\s+");
        Pattern letter = Pattern.compile("[a-zA-z]");
        Pattern digit = Pattern.compile("[0-9]");
        Pattern special = Pattern.compile("[~`@#$%^&*()_+={}\\[\\]|;:'/\"'<>/]");
        for (String w : words) {
            Matcher hasLetter = letter.matcher(w);
            Matcher hasDigit = digit.matcher(w);
            Matcher hasSpecial = special.matcher(w);
            if (!hasDigit.find() && hasLetter.find() && !hasSpecial.find()) {
                count++;
            }
        }
        //System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        String s = "he is a good programmer, he won 865 competitions, but sometimes he dont. What do you think? All test-cases should pass. Done-done?";
     int count =   howMany(s);
        System.out.println(count);
    }
}
