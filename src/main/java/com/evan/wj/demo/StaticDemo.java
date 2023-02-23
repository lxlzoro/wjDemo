package com.evan.wj.demo;

/**
 * @author liuxiaolei
 * @date 2023/2/1 10:27
 * @description：
 */
public class StaticDemo {

    //静态属性初始化
    private static String staticField = getStaticField();

    static {
        System.out.println(staticField);
        System.out.println("静态方法初始化");
    }
    //普通属性初始化
    private String field = getField();

    {
        //普通方法代码块
        System.out.println(field+"---");
    }

    public StaticDemo() {
        System.out.println("构造函数初始化");
    }
    public static String getStaticField() {
        String statiFiled = "Static Field Initial （静态属性初始化）";
        return statiFiled;
    }
    public static String getField() {
        String filed = "Field Initial（普通属性初始化）";

        return filed;
    }

    private int num;
    public StaticDemo(int  num){
        this.num=num;
    }



    public static void main(String[] argc) {
//        new StaticDemo();

        int ap[];
        int[] a;
    }
}
