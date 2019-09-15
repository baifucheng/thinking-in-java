package com.baifc.$1_simple.$1_demo;

/**
 * projectName: thinkinginjava
 * packageName: com.baifc.simple
 * Created: 2019-09-15.
 * Auther: baifc
 * Description: 简单泛型
 */
public class Holder<T> {

    private T a;

    public Holder(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {
        Holder<Automobile> holder = new Holder<>(new Automobile());
        System.out.println(holder.get());
    }

    private static class Automobile{}
}
