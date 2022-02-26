package com.algorithm.demo.demo14;

/**
 * @author cuibaoqiang
 * @date 2022-02-26 13:34:29
 * @desc 顶点
 */
public class Vertex {
    private String value;
    public boolean visited;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Vertex(String value) {
        super();
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
