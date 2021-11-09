package com.entity;

public class StringWordCount {

    public static void main(String[] args) {
      String s = "AAAABBBCDDDDDDM";//                A4B35M
        String s1 = "ABBAACCDDMMM";//                AB2A2C2D2M3

        System.out.println(get(s));
    }

    public static String get(String str){
        if(str == null){
            return "";
        }

        //char[] chars = str.toCharArray();
        char pre = str.charAt(0);
        int count =0;
        StringBuilder sb = new StringBuilder();
        int i=0;
        for( i=0; i< str.length() ; i++){
            if(str.charAt(i) == pre){
                count ++;
            }else{
                if(count >1){
                    sb.append(pre+""+count);
                }else{
                    sb.append(pre);
                }
                pre = str.charAt(i);
                count = 1;
            }

        }
        if(count >1){
            sb.append(pre+""+count);
        }else{
            sb.append(pre);
        }

        return sb.toString();

    }
}
