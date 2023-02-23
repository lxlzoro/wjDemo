package com.evan.wj.demo.factory;

/**
 * @author liuxiaolei
 * @date 2023/1/30 15:11
 * @description：
 */
public class IDCardProduct extends Product {

    String owner;

    public IDCardProduct(String owner) {
        this.owner = owner;
    }



    public String getOwner() {
        return owner;
    }

    @Override
    public void use() {

    }

    @Override
    public Product createProduct(String owner) {
        return null;
    }

    @Override
    public void registerProduct(Product p) {

    }

    @Override
    public void getAllProductOwner() {

    }
}
