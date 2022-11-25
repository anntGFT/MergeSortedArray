package org.example;

import java.util.Arrays;

public class Solution {

    public Solution(){

    }


    public int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int[] result = new int[m + n];

        System.arraycopy(nums1, 0, result, 0, m);
        System.arraycopy(nums2, 0, result, m, n);

        Arrays.sort(result);

        return result;
    }
}