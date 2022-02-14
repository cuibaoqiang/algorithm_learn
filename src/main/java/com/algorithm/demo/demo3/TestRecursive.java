package com.algorithm.demo.demo3;

/**
 * @author cuibaoqiang
 * @date 2022-02-13 23:01:48
 * @desc 测试递归
 */
public class TestRecursive {

    public static void main(String[] args) {
        print(3);
    }

    //递归
    public static void print(int i) {
        if (i > 0) {
            System.out.println(i);
            print(i - 1);
        }
    }
}
