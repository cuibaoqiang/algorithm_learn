package com.algorithm.剑指offer.剑指offer03;

import java.util.HashSet;
import java.util.Set;

/**
 * @author cuibaoqiang
 * @date 2022-08-03 15:46:00
 * @desc 数组中重复的数字
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        Solution code = new Solution();
        System.out.println(code.findRepeatNumber(nums));
    }

    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }

}
