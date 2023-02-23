package com.evan.wj.demo.factory;

import lombok.Data;

/**
 * @author liuxiaolei
 * @date 2023/1/30 14:08
 * @description：工厂类
 */
@Data
public abstract class Factory {

    /**
     * 抽象类中可以没有抽象方法，但是抽象方法必须在抽象类中
     */


    /**
     * 创建产品
     * @param owner
     * @return
     */
    public abstract Product createProduct(String owner);

    /**
     * 注册产品
     * @param p
     */
    public abstract void registerProduct(Product p);

    /**
     * 获取所有产品责任人
     */
    public abstract void getAllProductOwner();

    public Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

}
