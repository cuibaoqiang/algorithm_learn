package com.algorithm.learn;

/**
 * @author cuibaoqiang
 * @date 2021-07-09 18:18:08
 * @desc 二分查找
 */
public class BinarySearch {

    public static int binarySearch(int x, int[] num, int begin, int end) {
        int mid;
        while (begin <= end) {
            mid = (begin + end + 1) / 2;
            if (x == num[mid]) {
                return mid;
            } else if (x > num[mid]) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 5, 6, 7};
        int x = 5;
        if (binarySearch(x, num, 0, num.length - 1) == -1) {
            System.out.println(Boolean.FALSE);
        } else {
            System.out.println(Boolean.TRUE);
        }
    }
}
