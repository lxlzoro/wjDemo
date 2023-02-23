package com.evan.wj.demo.factory;

/**
 * @author liuxiaolei
 * @date 2023/1/30 15:33
 * @description：
 */
public class FactoryMain {
    public static void main(String[] args) {
        Factory f = new IDCardFactory();
        Product p = f.create("江疏影");
        p.use();
        System.out.println("----------------");

        f.create("邱淑贞");
        p.use();
        System.out.println("----------------");
        f.getAllProductOwner();
    }
}
