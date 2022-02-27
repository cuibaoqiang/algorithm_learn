package com.algorithm.leetcode.LeetCode0031;

import java.util.Arrays;

/**
 * @author cuibaoqiang
 * @date 2022-02-27 23:49:36
 * https://blog.csdn.net/weixin_39615182/article/details/120120825
 * @desc 下一个排列
 */
public class Solution {
    public static void main(String[] args) {
        Solution code = new Solution();
        int[] arr = new int[]{1, 2, 3, 8, 5, 7, 6, 4};
        code.nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void nextPermutation(int[] nums) {
        int len = nums.length;
        for (int i = len - 1; i > 0; i--) {
            //从后往前先找出第一个相邻的后一个大于前一个情况，此时的i-1位置就是需要交换的位置
            if (nums[i] > nums[i - 1]) {
                //对i自己和之后的元素排序，[i,len)从小到大，第一个大于i-1位置的进行交换，那么就是下一个排列
                Arrays.sort(nums, i, len);
                for (int j = i; j < len; j++) {
                    if (nums[j] > nums[i - 1]) {
                        int temp = nums[j];
                        nums[j] = nums[i - 1];
                        nums[i - 1] = temp;
                        return;
                    }
                }
            }
        }
        //最后3,2,1情况的下一个就是1,2,3要重新排列成最小的，这种情况上面的交换执行不了
        Arrays.sort(nums);
    }
}
