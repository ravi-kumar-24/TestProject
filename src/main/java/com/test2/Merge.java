package com.test2;

public class Merge {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int mIndex = m- 1;
        int nIndex = n -1;

        for (  int totalIndex = nums1.length-1 ; totalIndex >= 0; totalIndex--) {

            if(mIndex >-1 && nIndex>-1) {
                if (nums1[mIndex] >= nums2[nIndex]) {
                    nums1[totalIndex] = nums1[mIndex--];

                } else {
                    nums1[totalIndex] = nums2[nIndex--];
                }
            }

           else if(mIndex >-1 && ! (nIndex>-1)){
                nums1[totalIndex] = nums1[mIndex--];
            }
           else if(!(mIndex >-1) &&  nIndex>-1){
               nums1[totalIndex] = nums2[nIndex--];
            }

        }

    }

    public static void main(String[] args) {
       int[] nums1 =  {0};
       int m = 0, n = 1;
        int[] nums2 = {1};

        merge(nums1, m, nums2,n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }


    }
}
