package online.superh.interview.java.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-02-24 10:25
 */
public class SocketServer {

    public static void main(String[] args) {
        //服务器
        // try {
        //     // 初始化服务端socket并且绑定9999端口
        //     ServerSocket serverSocket  =new ServerSocket(9999);
        //     //等待客户端的连接
        //     Socket socket = serverSocket.accept();
        //     //获取输入流
        //     BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //     //读取一行数据
        //     String str = bufferedReader.readLine();
        //     //输出打印
        //     System.out.println(str);
        // }catch (IOException e) {
        //     e.printStackTrace();
        // }
        try {
            // 初始化服务端socket并且绑定9999端口
            ServerSocket serverSocket  =new ServerSocket(9999);
            //等待客户端的连接
            Socket socket = serverSocket.accept();
            //获取输入流,并且指定统一的编码格式
            BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
            //读取一行数据
            String str;
            //通过while循环不断读取信息，
            while ((str = bufferedReader.readLine())!=null){
            //输出打印
                System.out.println(str);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
