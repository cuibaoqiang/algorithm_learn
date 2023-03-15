package com.algorithm.nowcoder.BM19;

/**
 * @author cuibaoqiang
 * @date 2023-03-15 08:13:12
 * @desc BM19 寻找峰值
 */
public class Solution {

    public static void main(String[] args) {
        Solution code = new Solution();
        int[] nums = {1, 4, 7, 11, 15};
        System.out.println(code.findPeakElement(nums));

    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param nums int整型一维数组
     * @return int整型
     */
    public int findPeakElement (int[] nums) {
        // write code here
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid + 1] > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }
}
