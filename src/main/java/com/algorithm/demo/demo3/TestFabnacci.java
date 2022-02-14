package com.algorithm.demo.demo3;

/**
 * @author cuibaoqiang
 * @date 2022-02-13 23:05:05
 * @desc 斐波那契数列
 */
public class TestFabnacci {
    public static void main(String[] args) {
        //斐波那契数列：1 1 2 3 5 8 13
        int i = fabnacci(7);
        System.out.println(i);
    }

    //打印第n项斐波那契数列
    public static int fabnacci(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return fabnacci(i - 1) + fabnacci(i - 2);
        }
    }
}
