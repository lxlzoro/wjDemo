package com.evan.wj.demo.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuxiaolei
 * @date 2023/1/30 14:54
 * @description：
 */
public class IDCardFactory extends Factory {

    List owners = new ArrayList();

    @Override
    public Product createProduct(String owner) {
        System.out.println("为 " + owner + " 创造产品成功...");
//        return new IDCardProduct(owner);
        return null;
    }

    @Override
    public void registerProduct(Product p) {
        String owner=((IDCardProduct)p).getOwner();
        owners.add(owner);
        System.out.println("注册 "+owner+" 的产品成功...");

    }

    @Override
    public void getAllProductOwner() {
        for (int i = 0; i < owners.size(); i++) {
            System.out.println("产品用户：" + owners.get(i));
        }

    }
}
