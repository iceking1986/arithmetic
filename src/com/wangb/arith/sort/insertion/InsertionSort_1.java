package com.wangb.arith.sort.insertion;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author wangbin
 * @Date 2020/12/30
 */
public class InsertionSort_1 {
    public int[] insertionSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums;
        }
        for (int i = 1; i < nums.length; i++) {
            int currVal = nums[i];
            int j = i;
            while (j > 0 && nums[j] < nums[j - 1]) {
                int tmp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = tmp;
                j--;
            }
            nums[j] = currVal;
        }
        return nums;
    }

    @Test
    public void testInsertionSort() {
        int[] nums = {9, 98, 1, 3, 6, 54, 89, 2, 501, 5, 98, 12};
        System.out.println(Arrays.toString(insertionSort(nums)));
        int[] nums2 = {99, 98};
        System.out.println(Arrays.toString(insertionSort(nums2)));
    }
}
