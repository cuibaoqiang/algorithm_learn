package com.algorithm.nowcoder.HJ2;

import java.util.Scanner;

/**
 * @author cuibaoqiang
 * @date 2022-01-28 16:11:36
 * @desc 牛客网华为机试 1
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine().toLowerCase();
        String str2 = in.nextLine().toLowerCase();
        System.out.println(str1.length() - str1.replaceAll(str2, "").length());
    }
}
