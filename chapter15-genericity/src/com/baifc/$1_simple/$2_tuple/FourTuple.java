package com.baifc.$1_simple.$2_tuple;

/**
 * projectName: thinkinginjava
 * packageName: com.baifc.$1_simple.$2_tuple
 * Created: 2019-09-15.
 * Auther: baifc
 * Description: 利用继承实现长度更长的元组
 */
public class FourTuple<A, B, C, D> extends TwoTuple<A, B> {
    public final C third;
    public final D fourth;

    public FourTuple(A a, B b, C c, D d) {
        super(a, b);
        this.third = c;
        this.fourth = d;
    }
}
