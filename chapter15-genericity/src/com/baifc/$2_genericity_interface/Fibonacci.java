package com.baifc.$2_genericity_interface;

/**
 * projectName: thinkinginjava
 * packageName: com.baifc.$2_genericity_interface
 * Created: 2019-09-15.
 * Auther: baifc
 * Description: 实现Generator接口，生成Fibonacci（斐波纳契）数列
 */
public class Fibonacci implements Generator<Integer> {
    private int count = 0;

    @Override
    public Integer next() {
        return fib(count++);
    }

    private int fib(int n) {
        if (n < 2)
            return 1;
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        Fibonacci gen = new Fibonacci();
        for (int i = 0; i < 18; i ++) {
            System.out.print(gen.next() + " ");
        }
    }
}
