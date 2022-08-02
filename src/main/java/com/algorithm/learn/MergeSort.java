package com.algorithm.learn;

/**
 * @author cuibaoqiang
 * @date 2021-07-14 11:25:43
 * @desc 归并排序
 */
public class MergeSort {
    static void mergesort(int[] nums, int start, int end) {
        int middle;
        if (start < end) {
            middle = (start + end) / 2;
            mergesort(nums, start, middle);
            mergesort(nums, middle + 1, end);
            merge(nums, start, middle, end);
        }
    }

    static void merge(int[] nums, int start, int middle, int end) {
        int n1 = middle - start + 1;
        int n2 = end - middle;
        // 新建两个临时数组保存 前后两部分数据
        int[] L = new int[n1];
        int[] R = new int[n2];
        int i, j = 0, k;
        for (i = 0; i < n1; i++) {
            L[i] = nums[start + i];
        }
        for (i = 0; i < n2; i++) {
            R[i] = nums[middle + i + 1];
        }
        // 开始排序 取两个数组中小的数放进原数组
        i = 0;
        for (k = start; k <= end; k++) {
            if (i < L.length && j < R.length) {
                if (L[i] <= R[j]) {
                    nums[k] = L[i];
                    i++;
                } else {
                    nums[k] = R[j];
                    j++;
                }
            } else if (i < L.length) {
                nums[k] = L[i];
                i++;
            } else if (j < R.length) {
                nums[k] = R[j];
                j++;
            }
        }
    }

    public static void main(String[] args) {
//        int[] nums = {1, 4, 7, 6, 8, 0, 123, 5, 9};
        int[] nums = {8, 0};
        mergesort(nums, 0, nums.length - 1);
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
