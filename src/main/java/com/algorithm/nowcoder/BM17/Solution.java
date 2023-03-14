package com.algorithm.nowcoder.BM17;

/**
 * @author cuibaoqiang
 * @date 2023-03-14 08:25:59
 * @desc BM17 二分查找-I
 */
public class Solution {

    public static void main(String[] args) {
        Solution code = new Solution();
        int[] num = {1};
        System.out.println(code.search(num, 1));

    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param nums   int整型一维数组
     * @param target int整型
     * @return int整型
     */
    public int search(int[] nums, int target) {
        // write code here
        int begin = 0, end = nums.length - 1, mid = (begin + end) / 2;
        while (begin <= end) {
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                begin = mid + 1;
                mid = (begin + end) / 2;
            } else {
                end = mid - 1;
                mid = (begin + end) / 2;
            }
        }
        return -1;

    }
}
