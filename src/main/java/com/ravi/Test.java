package com.ravi;

public class Test {

    public static void main(String[] args) {
        System.out.println(Solve("abdc"));
        System.out.println(Solve("abczd"));
        System.out.println(Solve("abcda"));
        System.out.println(Solve("aab"));
        System.out.println(Solve("aaaaaaa"));
    }

    public static String Solve(String str)
    {
        if (str.length() == 0 || str.length() == 1)
            return "";

        String result = "";
        boolean replacedChar = false;

        // Iterate through string, from beginning to end
        for (int currStrIndex = 1; currStrIndex < str.length(); currStrIndex++)
        {
            // Check for conflict if we have yet to replace a char
            if (!replacedChar && str.charAt(currStrIndex) < str.charAt(currStrIndex - 1))
            {
                // Add the current char to result
                result = result + str.charAt(currStrIndex);
                replacedChar = true;
            }
            // Otherwise simply add the previous char to result
            else
                result = result + str.charAt(currStrIndex - 1);
        }

        return result;
    }
}
