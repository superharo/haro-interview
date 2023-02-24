package online.superh.interview.java.io;

import java.io.*;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-02-24 9:59
 */
public class TestInputstream {


    public static void main(String[] args) throws IOException {
        // String msg = "Hello world";
        // File file = new File("1.txt");
        // FileOutputStream fos = new FileOutputStream(file);
        // fos.write(msg.getBytes());
        // File file = new File("1.txt");
        // InputStream in = new FileInputStream(file);
        // byte[] bytes = new byte[1024];
        // while (in.read(bytes) != -1){
        //
        // }
        File file = new File("2.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder msg =new StringBuilder();
        msg.append(br.readLine());
        OutputStream os = new FileOutputStream(file);
        os.write(msg.toString().getBytes());
    }

}
