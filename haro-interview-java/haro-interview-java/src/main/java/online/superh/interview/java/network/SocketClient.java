package online.superh.interview.java.network;

import java.io.*;
import java.net.Socket;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-02-24 10:30
 */
public class SocketClient {

    public static void main(String[] args) {
        //客户端
        // try {
        //     Socket socket =new Socket("127.0.0.1",9999);
        //     BufferedWriter bufferedWriter =new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        //     String str="你好，这是我的第一个socket";
        //     bufferedWriter.write(str);
        //     //刷新输入流
        //     bufferedWriter.flush();
        //     //关闭socket的输出流
        //     socket.shutdownOutput();
        // }catch (IOException e) {
        //     e.printStackTrace();
        // }
        //初始化一个socket
        try {
            //初始化一个socket
            Socket socket =new Socket("127.0.0.1",9999);
            //通过socket获取字符流
            BufferedWriter bufferedWriter =new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            //通过标准输入流获取字符流
            BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in,"UTF-8"));
            while (true){
                String str = bufferedReader.readLine();
                bufferedWriter.write(str);
                bufferedWriter.write("\n");
                bufferedWriter.flush();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
