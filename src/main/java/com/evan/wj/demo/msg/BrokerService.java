package com.evan.wj.demo.msg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author liuxiaolei
 * @date 2022/12/2 10:08
 * @description： 对外提供Broker的服务
 */
public class BrokerService implements Runnable {
    public static int SERVICE_PORT = 9999;
    private final Socket socket;

    public BrokerService(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream())) {
            while (true) {
                String str = in.readLine();
                if (str == null) {
                    continue;
                }
                System.out.println("接收到的原始数据：" + str);
                if (str.equals("CONSUME")) {
                    String message = Broker.consume();
                    out.println(message);
                    out.flush();
                } else {
                    Broker.produce(str);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(SERVICE_PORT);
        while (true) {
            BrokerService brokerService = new BrokerService(server.accept());
            new Thread(brokerService).start();
        }

    }
}
