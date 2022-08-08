package com.algorithm.剑指offer.剑指offer53I;

/**
 * @author cuibaoqiang
 * @date 2022-08-08 16:22:40
 * @desc 统计一个数字在排序数组中出现的次数
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        Solution code = new Solution();
        System.out.println(code.search(nums, 8));
    }

    public int search(int[] nums, int target) {
        int leftIdx = binarySearch(nums, target, true);
        int rightIdx = binarySearch(nums, target, false) - 1;
        if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
            return rightIdx - leftIdx + 1;
        }
        return 0;
    }

    public int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}

