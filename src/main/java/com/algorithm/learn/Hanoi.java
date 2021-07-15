package com.algorithm.learn;

/**
 * @author cuibaoqiang
 * @date 2021-07-14 17:49:04
 * @desc 汉诺塔游戏
 */
public class Hanoi {

    /**
     * @param n           盘子的数目
     * @param origin      源座
     * @param assist      辅助座
     * @param destination 目的座
     */
    private static void hanoi(int n, char origin, char assist, char destination) {
        if (n == 1) {
            System.out.println("Direction:" + origin + "--->" + destination);
        } else {
            hanoi(n - 1, origin, destination, assist);
            hanoi(1, origin, assist, destination);
            hanoi(n - 1, assist, origin, destination);
        }
    }

    public static void main(String[] args) {
        hanoi(3, 'A', 'B', 'C');
    }
}
