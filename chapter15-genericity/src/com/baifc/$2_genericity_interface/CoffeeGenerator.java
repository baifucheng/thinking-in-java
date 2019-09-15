package com.baifc.$2_genericity_interface;

import java.util.Iterator;
import java.util.Random;

/**
 * projectName: thinkinginjava
 * packageName: com.baifc.$2_genericity_interface
 * Created: 2019-09-15.
 * Auther: baifc
 * Description: 这个类实现了Generator<Coffee>接口，它可以随机生成不同类型的Coffee对象
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

    private int size = 0;

    private Class [] types = {Cappuccino.class, Latte.class, Mocha.class};

    private static Random rand = new Random(47);

    public CoffeeGenerator() {}

    public CoffeeGenerator(int size) {
        this.size = size;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[rand.nextInt(types.length)].newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }
    }

    public static void main(String[] args) {
        CoffeeGenerator generator = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(generator.next());
        }
        for (Coffee c : new CoffeeGenerator(5)) {
            System.out.println(c);
        }
    }
}
