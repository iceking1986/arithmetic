package com.wangb.arith.sort.merge;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author wangbin
 * @Date 2020/12/30
 */
public class MergeSort_1 {

    public void mergeSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);
        merge(nums, start, mid, end);
    }

    private void merge(int[] nums, int start, int mid, int end) {
        int[] mergeArray = new int[end + 1];
        int low = start;
        int left = start;
        int center = mid + 1;
        while (start <= mid && center <= end) {
            mergeArray[low++] = nums[start] > nums[center] ? nums[center++] : nums[start++];
        }

        while (start <= mid) {
            mergeArray[low++] = nums[start++];
        }
        while (center <= end) {
            mergeArray[low++] = nums[center++];
        }
        for (int i = left; i <= end; i++) {
            nums[i] = mergeArray[i];
        }
    }

    @Test
    public void testMergeSort() {
        int[] array = {58, 48, 69, 87, 49, 59, 25, 35, 68, 48};
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

}
