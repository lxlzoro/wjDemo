package com.evan.wj.demo.msg;

import java.io.IOException;

/**
 * @author liuxiaolei
 * @date 2022/12/2 11:26
 * @description：
 */
public class ProduceClient {
    public static void main(String[] args) throws Exception {
        MyClient client = new MyClient();
        client.produce("hello world");
    }
}
