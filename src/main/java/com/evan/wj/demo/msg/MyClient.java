package com.evan.wj.demo.msg;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author liuxiaolei
 * @date 2022/12/2 10:09
 * @description：
 */
public class MyClient {
    public void produce(String message) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), BrokerService.SERVICE_PORT);
        try (PrintWriter out = new PrintWriter(socket.getOutputStream())) {
            out.println(message);
            out.flush();
        }
    }

    public String consume() throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), BrokerService.SERVICE_PORT);
        try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream())) {
            out.println("CONSUME");
            out.flush();
            String message = in.readLine();
            return message;
        }
    }
}
