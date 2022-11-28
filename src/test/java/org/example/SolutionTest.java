package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    static Solution solution;

    static int[] nums1, nums2, result;
    static int n,m;

    @BeforeAll
    static void setup(){

        solution = new Solution();
        nums1 = new int[m];
        nums2 = new int[n];

    }

    @Test
    public void mergeTwoArraysWith0ElementsEachIntoNewArray(){

        n = 0;
        m = 0;

        result = new int[] {};

        assertEquals(Arrays.toString(result), Arrays.toString(solution.mergeNewArray(nums1, m, nums2, n)));

    }

    @Test
    public void mergeTwoArraysWith3ElementsEachIntoNewArray(){

        n = 3;
        m = 3;

        nums1 = new int[] {2,4,6};
        nums2 = new int[] {1,3,9};


        result = new int[] {1,2,3,4,6,9};

        assertEquals(Arrays.toString(result), Arrays.toString(solution.mergeNewArray(nums1, m, nums2, n)));
    }

    @Test
    public void mergeTwoArraysWith5ElementsFirstAnd2TheOtherIntoNewArray(){

        n = 2;
        m = 5;

        nums1 = new int[] {2,4,6,8,11};
        nums2 = new int[] {1,9};


        result = new int[] {1,2,4,6,8,9,11};

        assertEquals(Arrays.toString(result), Arrays.toString(solution.mergeNewArray(nums1, m, nums2, n)));
    }

    @Test
    public void mergeTwoArraysWith0ElementsEachIntoSameArray(){

        n = 0;
        m = 0;

        result = new int[] {};

        solution.mergeSameArray(nums1, m, nums2, n);

        assertEquals(Arrays.toString(result), Arrays.toString(nums1));

    }

    @Test
    public void mergeTwoArraysWith3ElementsEachIntoSameArray(){

        n = 3;
        m = 3;

        nums1 = new int[] {2,4,6,0,0,0};
        nums2 = new int[] {1,3,9};


        result = new int[] {1,2,3,4,6,9};

        solution.mergeSameArray(nums1, m, nums2, n);

        assertEquals(Arrays.toString(result), Arrays.toString(nums1));
    }

    @Test
    public void mergeTwoArraysWith5ElementsFirstAnd2TheOtherIntoSameArray(){

        n = 2;
        m = 5;

        nums1 = new int[] {2,4,6,8,11,0,0};
        nums2 = new int[] {1,9};


        result = new int[] {1,2,4,6,8,9,11};

        solution.mergeSameArray(nums1, m, nums2, n);

        assertEquals(Arrays.toString(result), Arrays.toString(nums1));
    }
}
