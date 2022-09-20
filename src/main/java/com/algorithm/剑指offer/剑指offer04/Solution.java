package com.algorithm.剑指offer.剑指offer04;

/**
 * @author cuibaoqiang
 * @date 2022-09-20 14:37:23
 * @desc 二维数组中的查找
 */
public class Solution {


    public static void main(String[] args) {

//        int[][] matrix = {
//                {1, 4, 7, 11, 15},
//                {2, 5, 8, 12, 19},
//                {3, 6, 9, 16, 22},
//                {10, 13, 14, 17, 24},
//                {18, 21, 23, 26, 30}
//        };
        int[][] matrix = {
                {1},
                {1}
        };
        Solution code = new Solution();
        System.out.println(code.findNumberIn2DArray(matrix, 5));
        System.out.println(code.findNumberIn2DArray(matrix, 20));
        System.out.println(code.findNumberIn2DArray(matrix, 0));
    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0;
        while (i >= 0 && j < matrix[0].length) {
            if (matrix[i][j] > target) {
                i--;
            } else if (matrix[i][j] < target) {
                j++;
            } else {
                return true;
            }
        }
        return false;
    }
}
