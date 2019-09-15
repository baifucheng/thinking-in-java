package com.baifc.$2_genericity_interface;

/**
 * projectName: thinkinginjava
 * packageName: com.baifc.$2_genericity_interface
 * Created: 2019-09-15.
 * Auther: baifc
 * Description: 泛型接口
 *      这里创建一个生成器接口，用于专门创建对象
 */
public interface Generator<T> {

    T next();
}
