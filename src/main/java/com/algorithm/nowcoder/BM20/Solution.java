package com.algorithm.nowcoder.BM20;

/**
 * @author cuibaoqiang
 * @date 2023-03-15 23:31:07
 * @desc BM20 数组中的逆序对
 */
public class Solution {

    public static void main(String[] args) {
        Solution code = new Solution();
        int[] nums = {1,2,3,4,5,6,7,0};
        System.out.println(code.InversePairs(nums));

    }

    long count = 0;

    public int InversePairs(int [] array) {
        if (array.length == 0) {
            return 0;
        }
        mergesort(array, 0, array.length - 1);
        return (int) (count % 1000000007);
    }

    public void mergesort(int[] nums, int start, int end) {
        int middle;
        if (start < end) {
            middle = (start + end) / 2;
            mergesort(nums, start, middle);
            mergesort(nums, middle + 1, end);
            merge(nums, start, middle, end);
        }
    }

    public void merge(int[] nums, int start, int middle, int end) {
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
                    count += L.length - i ;
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
}
