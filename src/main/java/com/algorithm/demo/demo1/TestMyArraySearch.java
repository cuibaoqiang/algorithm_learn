package com.algorithm.demo.demo1;

import com.algorithm.demo.demo1.util.MyArray;

/**
 * @author cuibaoqiang
 * @date 2022-02-09 22:35:47
 * @desc
 */
public class TestMyArraySearch {
    public static void main(String[] args) {
        MyArray ma = new MyArray();
        ma.add(1);
        ma.add(2);
        ma.add(3);
        ma.add(4);
        ma.add(5);
        //调用线性查找方法
//		int index = ma.search(0);
//		System.out.println("index:"+index);
        //调用二分法查找
        int index2 = ma.binarySearch(6);
        System.out.println("index2:" + index2);
    }
}
