package com.algorithm.剑指offer.剑指offer53II;

/**
 * @author cuibaoqiang
 * @date 2022-08-08 16:22:40
 * @desc 0 - n-1中缺少的数字
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5,6,7,9};
        Solution code = new Solution();
        System.out.println(code.missingNumber(nums));
    }

    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return nums.length * (1 + nums.length) / 2 - sum;
    }
}

