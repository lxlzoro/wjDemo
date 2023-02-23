package com.evan.wj.demo.factory;

/**
 * @author liuxiaolei
 * @date 2023/1/30 14:18
 * @description：产品-抽象类
 */
public abstract class Product extends Factory{
    /**
     * 使用者
     */
    protected abstract void use();
}
