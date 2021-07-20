package com.algorithm.learn;

import java.util.Arrays;

/**
 * @author cuibaoqiang
 * @date 2021-07-14 17:47:12
 * @desc
 */
public class QuickSort {

    static void quickSort(int[] nums, int low, int high) {

        int i, j, t, temp;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        temp = nums[low];
        while (i < j) {
            // 看右边
            while (temp <= nums[j] && i < j) {
                j--;
            }
            // 看左边
            while (temp >= nums[i] && i < j) {
                i++;
            }
            // 交换
            t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }

        nums[low] = nums[i];
        nums[i] = temp;

        quickSort(nums, low, j - 1);
        quickSort(nums, j + 1, high);
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 8, 9, 5, 2, 0, 7, 3};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
