package com.ravi;

import java.util.ArrayList;
import java.util.List;

    public class WholeMinuteDelima {

        public static void main(String a[]) {
            List i = new ArrayList();
            i.add(60);
            i.add(60);
            i.add(60);
           // i.add(180);
            System.out.println(playlist(i));
        }

        public static long playlist(List<Integer> songs) {
            long count = 0;
            long [] a = new long[60];
            if(songs.size() == 0){
                return 0;
            }
            for(int i = 0 ; i < songs.size() ; i++){
                a[songs.get(i)%60]++;
            }
            for(int i = 1 ; i < 30 ; i++){
                count = count + (a[i]*a[60-i]);
            }
            count = count + ((a[30] * (a[30] - 1))/2) + ((a[0] * (a[0] - 1))/2);
            return count;
        }
        /**
         *
         */

        public static long playlist1(List<Integer> songs) {
            long count =0;
            for (int i =0; i<songs.size()-1; i++) {
                for(int j = i+1; j<songs.size(); j++) {

                    if( (songs.get(i) + songs.get(j)) %60 == 0) {
                        System.out.println(songs.get(i) +":::"+ songs.get(j));
                        count ++;
                    }


                }
            }
            return count;
        }
    }
