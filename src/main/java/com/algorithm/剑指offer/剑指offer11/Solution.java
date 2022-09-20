package com.algorithm.剑指offer.剑指offer11;

/**
 * @author cuibaoqiang
 * @date 2022-09-20 18:40:23
 * @desc 旋转数组的最小数字
 */
public class Solution {

    public static void main(String[] args) {
        Solution code = new Solution();

        System.out.println(code.minArray(new int[]{4, 5, 6, 7, 0, 1, 2}));
    }

    public int minArray(int[] numbers) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j]) {
                i = m + 1;
            } else if (numbers[m] < numbers[j]) {
                j = m;
            } else {
                j--;
            }
        }
        return numbers[i];
    }
}
