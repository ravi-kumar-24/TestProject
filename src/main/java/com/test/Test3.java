package com.test;

import java.util.Arrays;
import java.util.TreeSet;

public class Test3 {

    public static void main(String args[] ) throws Exception {

        int Q = 3;
      /*  for(int i=0;i<Q;i++) {
            String[] inp1 = br.readLine().split(" ");
            int L = Integer.parseInt(inp1[0]);
            int R = Integer.parseInt(inp1[1]);
            int out_ = solve(N, A, L ,R);
            System.out.println(out_);
        }
        wr.close();
        br.close();*/
        int N = 6;
        int[] a = {-10, 1, 2 ,10};
        int  l= 3;
        int r  =3;


        System.out.println(solve(N, a, l ,r));
    }
    static int solve(int N, int[] A, int L, int R) {

        /*int mid = 0;
        int diff = R-L;

        int[] arr = new int[diff];
        int start =0;
        for (int i = L; i < R; i++) {
            arr[start++] =
        }*/
        int mid = 0;

        int[] arr = Arrays.copyOfRange(A, L -1,R);
        Arrays.sort(arr);
        int diff = arr.length %2 ==0 ? (arr.length/2) - 1: (arr.length/2);
        mid = arr[diff];
        return mid;
    }

    static int solve(int N,int[] A){
        TreeSet<Integer> ts  = new TreeSet<>();

        int res =0;

        for(int i=0;i< N; i++){

            ts.add(A[i]);
        }

        int l = ts.last();
        int f = ts.first();

        res = l;
        if(Math.abs(f) > l){
            res = f;
        }


        return res;
    }

}
