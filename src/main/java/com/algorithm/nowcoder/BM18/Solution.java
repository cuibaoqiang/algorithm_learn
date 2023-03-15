package com.algorithm.nowcoder.BM18;

/**
 * @author cuibaoqiang
 * @date 2023-03-15 08:07:18
 * @desc BM18 二维数组中的查找
 */
public class Solution {

    public static void main(String[] args) {
        Solution code = new Solution();
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(code.Find(6, matrix));

    }

    public boolean Find(int target, int[][] array) {
        int i = 0, j = array.length - 1;
        while (i < array[0].length && j >= 0) {
            if (array[j][i] > target) {
                j--;
            } else if (array[j][i] < target) {
                i++;
            }else {
                return true;
            }
        }
        return false;
    }
}
