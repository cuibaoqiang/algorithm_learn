package com.algorithm.leetcode;

import java.util.Arrays;

/**
 * @author cuibaoqiang
 * @date 2022-02-08 16:56:09
 * @desc 删除有序数组中重复项
 */
public class LeetCode0026 {
    public static void main(String[] args) {
        LeetCode0026 code = new LeetCode0026();
        int[] arr = new int[]{1, 1, 2, 3, 4, 5, 5, 6};
        int count = code.removeDuplicates(arr);
        System.out.println(count);
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, count)));
    }

    public int removeDuplicates(int[] nums) {
        int count = 0;
        for(int n : nums) {
            if (count < 1 || n > nums[count - 1]){
                nums[count++] = n;
            }
        }
        return count;
    }
}
