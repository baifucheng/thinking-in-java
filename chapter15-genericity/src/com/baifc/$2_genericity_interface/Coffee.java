package com.baifc.$2_genericity_interface;

/**
 * projectName: thinkinginjava
 * packageName: com.baifc.$2_genericity_interface
 * Created: 2019-09-15.
 * Auther: baifc
 * Description:
 */
public class Coffee {

    private static long counter = 8;

    private final long id = counter++;

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
