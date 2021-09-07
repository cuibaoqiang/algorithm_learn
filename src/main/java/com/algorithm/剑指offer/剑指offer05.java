package com.algorithm.剑指offer;

/**
 * @author cuibaoqiang
 * @date 2021-09-07 10:41:36
 * @desc 替换空格
 */
public class 剑指offer05 {
    public static void main(String[] args) {
        剑指offer05 code = new 剑指offer05();
        System.out.println(code.replaceSpace("We are happy."));
    }

    public String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }
}
