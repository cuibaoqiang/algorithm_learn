package com.algorithm.nowcoder.BM21;

/**
 * @author cuibaoqiang
 * @date 2023-03-16 08:33:59
 * @desc BM21 旋转数组的最小数字
 */
public class Solution {

    public static void main(String[] args) {
        Solution code = new Solution();
        int[] nums = {3,100,200,1,3,3,3,3,3};
        System.out.println(code.minNumberInRotateArray(nums));

    }

    public int minNumberInRotateArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (array[mid] > array[right]) {
                left = mid + 1;
            } else if (array[mid] == array[right]){
                right--;
            } else {
                right = mid;
            }
        }
        return array[right];
    }
}
