package com.evan.wj.demo.msg;

/**
 * @author liuxiaolei
 * @date 2022/12/2 10:09
 * @description：
 */
public class ConsumeClient {
    public static void main(String[] args) throws Exception {
        MyClient myClient = new MyClient();
        String message = myClient.consume();
        System.out.println("获得的消息是：" + message);
    }
}
