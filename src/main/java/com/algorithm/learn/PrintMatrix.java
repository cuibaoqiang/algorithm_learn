package com.algorithm.learn;

import java.util.Arrays;

/**
 * @author cuibaoqiang
 * @date 2022-03-22 21:22:21
 * @desc 逆时针打印矩阵
 */
public class PrintMatrix {
    public static void main(String[] args) {
        printNum(5, 5);
    }

    private static void printNum(int row, int column) {

        // 构建数组
        int[][] intArr = new int[row][column];
        for (int i = 0; i < row * column; i++) {
            intArr[i / column][i % column] = i + 1;
        }
        System.out.println(Arrays.deepToString(intArr));

        // 遍历起始行
        int r = 0;
        // 遍历起始列
        int c = column - 1;
        // 计数
        int count = 0;
        // 方向 1 ← 2 ↓ 3 → 4 ↑
        int direction = 1;
        while (count < row * column) {
            if (intArr[r][c] != 0) {
                System.out.print(intArr[r][c]);
                System.out.print(" ");
                intArr[r][c] = 0;
                count++;
            }
            switch (direction) {
                case 1:
                    if (c > 0 && intArr[r][c-1] != 0) {
                        c--;
                    } else {
                        direction = 2;
                    }
                    break;
                case 2:
                    if (r < row-1 && intArr[r+1][c] != 0) {
                        r++;
                    } else {
                        direction = 3;
                    }
                    break;
                case 3:
                    if (c < column -1 && intArr[r][c+1] != 0) {
                        c++;
                    } else {
                        direction = 4;
                    }
                    break;
                case 4:
                    if (r > 0 && intArr[r-1][c] != 0)  {
                        r--;
                    } else {
                        direction =1;
                    }
                default:
                    break;
            }
        }
    }
}
