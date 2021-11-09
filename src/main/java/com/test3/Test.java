package com.test3;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

       List<Integer> newList = list.subList(4,8);
        System.out.println(newList);
    }
}
