package com.evan.wj.demo;

import javax.swing.plaf.IconUIResource;
import javax.swing.text.Segment;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import static java.lang.Math.sin;

/**
 * @author liuxiaolei
 * @date 2023/2/2 9:35
 * @description：
 */
public class IteratorDemo {

    public static void list() throws ClassNotFoundException {
        List list = new ArrayList();
      list.add(0,"0");
        list.add(1, "1");
        list.add(2, "2");
        list.add(3, "3");
        for (Object list11:list){

        }

        List list1 = Collections.synchronizedList(new ArrayList());


        Class it = Class.forName("com.evan.wj.demo.IteratorDemo");

        System.out.println(it.getName());
        Field[] fields = it.getFields();
        System.out.println(fields);
        Method[] methods = it.getMethods();
        System.out.println(methods);

        StringBuffer d = new StringBuffer();

        int[] a = {1,2,3};
        System.out.println(a.length);
        String b = "1,2,3";
        System.out.println(b.length());

        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

        concurrentHashMap.put("1","1");
        concurrentHashMap.get("1");
//        Segment


    }

    public static void main(String[] args) throws ClassNotFoundException {
//        list();
        System.out.println(sin(20));
    }
}
