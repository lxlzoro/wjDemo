package com.evan.wj.demo.factory;

/**
 * @author liuxiaolei
 * @date 2023/1/31 16:35
 * @description：
 */
public class TestAbstract {
    /**
     * 仅返回值类型不同，不能称为是方法的重载
     * 方法名相同，参数类型、参数个数、参数类型排序不同均可称为方法的重载
     */
    private TestAbstract() {

    }

//    private void TestAbstract(String a, int b) {
//
//    }
//
//    private Object TestAbstract(String a, int b) {
//        return a;
//    }

    private void TestAbstract(int b, String a) {

    }


}
