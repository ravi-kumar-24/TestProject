package com.ravi.americal.express;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FisrtNonRepeatedChar {

    public static void main(String[] args) {

        String str = "togetheor";
       char s = findFirstNonRepeatedCharacter(str);
        System.out.println(s);
    }


    public static Character findFirstNonRepeatedCharacter(String text) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] chars = text.toCharArray();
        List<Character> out = new LinkedList<>();

        for(Character c: chars ){

            if(map.containsKey(c)){
                if(map.get(c) ==1){
                    out.remove(c);
                }
                map.put(c, map.get(c) + 1);

            }else{
                map.put(c, 1);  //map  t , o, g,e,h, o,r
                out.add(c);    // out   g,h, r
            }

        }

        return out.get(0);
       /* for(Map.Entry<Character, Integer> entry : map.entrySet()){

            if(entry.getValue() == 1){
                return entry.getKey();

            }
        }

        return '';*/

    }

}

