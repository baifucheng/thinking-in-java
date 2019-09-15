package com.baifc.$1_simple.$2_tuple;

/**
 * projectName: thinkinginjava
 * packageName: com.baifc.$1_simple.$2_tuple
 * Created: 2019-09-15.
 * Auther: baifc
 * Description: 元组测试
 */
public class TupleTest {

    private static TwoTuple<String, Integer> f(){
        return new TwoTuple<>("hi", 47);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> twoTuple = f();
        System.out.println(twoTuple);
    }
}
