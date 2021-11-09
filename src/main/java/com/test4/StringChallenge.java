package com.test4;

import java.util.HashSet;
import java.util.Set;
/*Have the function CommandLine(str) take the str parameter being passed which represents the parameters given to a command in an old PDP system. The parameters are alphanumeric tokens (without spaces) followed by an equal sign and by their corresponding value. Multiple parameters/value pairs can be placed on the command line with a single space between each pair. Parameter tokens and values cannot contain equal signs but values can contain spaces. The purpose of the function is to isolate the parameters and values to return a list of parameter and value lengths. It must provide its result in the same format and in the same order by replacing each entry (tokens and values) by its corresponding length.

        For example, if str is: "SampleNumber=3234 provider=Dr. M. Welby patient=John Smith priority=High" then your function should return the string "12=4 8=12 7=10 8=4" because "SampleNumber" is a 12 character token with a 4 character value ("3234") followed by "provider" which is an 8 character token followed by a 12 character value ("Dr. M. Welby"), etc.

        Use the Parameter Testing feature in the box below to test your code with different arguments.*/
public class StringChallenge {

    public static void main(String args[]) {

       // 1. For input "origin=2;3 destination=7;9 stops= 3;6 8;9 12;17" the output was incorrect. The correct output is 6=3 11=3 5=14

     //   2. For input "BNF=number :: (0..9){0..9}; variable :: {A..Z}" the output was incorrect. The correct output is 3=42

      //  3. For input "code=3320 date=2017/09/19 value=42 name=H G T T G" the output was incorrect. The correct output is 4=4 4=10 5=2 4=9
        String str ="code=3320 date=2017/09/19 value=42 name=H G T T G";
        String str1 ="origin=2;3 destination=7;9 stops= 3;6 8;9 12;17";
        System.out.println(StringChallenge(str));
        // mmmerme
        // abccdefghi
    }
    public static String StringChallenge(String str) {
        String[] partial = str.split("=");
        String result = "";
        for (String arg : partial) {

            if (arg.contains(" ")) {
                int par = arg.lastIndexOf(" ");
                String sub = arg.substring(0, par);
                String rem = arg.substring(par);

                result = result + "=" + String.valueOf(sub.length()) + " " + String.valueOf(rem.length() - 1);
            } else if (result.equals("")) {
                result = result + String.valueOf(arg.length());
            } else if (!result.endsWith("=")) {
                result = result + "=" + String.valueOf(arg.length());
            }

        }
        if (str.endsWith("=")) {
            result = result + "=" + "0";
        }
        return result;
    }


}
