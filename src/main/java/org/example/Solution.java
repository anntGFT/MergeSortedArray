package org.example;

import java.util.Arrays;

public class Solution {

    public Solution(){

    }


    public int[] mergeNewArray(int[] nums1, int m, int[] nums2, int n) {

        int[] result = new int[m + n];

        System.arraycopy(nums1, 0, result, 0, m);
        System.arraycopy(nums2, 0, result, m, n);

        Arrays.sort(result);

        return result;
    }

    public void mergeSameArray(int[] nums1, int m, int[] nums2, int n) {

        if (n >= 0){
            
            System.arraycopy(nums2, 0, nums1, m, n);
        }

        Arrays.sort(nums1);
    }
}