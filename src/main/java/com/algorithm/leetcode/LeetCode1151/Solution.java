package com.algorithm.leetcode.LeetCode1151;

/**
 * @author cuibaoqiang
 * @date 2022-03-13 02:00:52
 * @desc 最小交换次数
 */
class Solution {
    public static void main(String[] args) {
        Solution code = new Solution();
        System.out.println(code.minSwaps(new int[]{1,1,0,0,0,0,1,1,1}));
    }
    public int minSwaps(int[] data) {
        // 一共有多少个1
        int sum = getNum(data, 0, data.length);
        int min = sum;
        // 全是0 或 只有一个1 或全是1 不需要交换
        if (sum == 0 || sum == 1 || sum == data.length) {
            return 0;
        }
        // 计算每个从1开始后sum个元素内1的个数与sum的差（即0的个数），取最小
        for (int index = 0; index < data.length; index++) {
            if (index + sum <= data.length) {
                min = Math.min(min, sum - getNum(data, index, index + sum));
                System.out.println(index + "\t" + min);
            }
        }
        return min;
    }

    private int getNum(int[] data, int begin, int end) {
        int sum = 0;
        for (int i = begin; i < end; i++) {
            if (data[i] == 1) {
                sum++;
            }
        }
        return sum;
    }
}
