package com.baifc.$1_simple.$2_tuple;

/**
 * projectName: thinkinginjava
 * packageName: com.baifc.$1_simple.$2_tuple
 * Created: 2019-09-15.
 * Auther: baifc
 * Description: 元组类库，将一组元素直接打包，存储于其中一个单一对象中
 */
public class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public TwoTuple(A a, B b) {
        this.first = a;
        this.second = b;
    }

    public String toString() {
        return "(" + first + "," + second + ")";
    }
}
