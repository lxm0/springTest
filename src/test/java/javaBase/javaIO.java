package javaBase;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class javaIO {
    @Test
    public void test01(){
        File file = new File("F:\\Java\\test\\SpringTest\\src\\test\\java\\javaBase");
        listAllFiles(file);
    }
    @Test
    public void test02() throws IOException {
        File file = new File("F:\\Java\\test\\SpringTest\\src\\test\\java\\javaBase");
        copyFile("C:\\Users\\GT\\Desktop\\ICSE2019\\[ICSE2019]9.6 Million Links in Source Code Comments.pdf","C:\\Users\\GT\\Desktop\\ICSE2019\\test\\[ICSE2019]9.6 Million Links in Source Code Comments.pdf");
    }


    //递归地列出一个目录下所有文件
    public static void listAllFiles(File dir) {
        if (dir == null || !dir.exists()) {
            return;
        }
        if (dir.isFile()) {
            System.out.println(dir.getName());
            return;
        }
        for (File file : dir.listFiles()) {
            listAllFiles(file);
        }
    }
    //实现文件复制
    public static void copyFile(String src, String dist) throws IOException {
        FileInputStream in = new FileInputStream(src);
        FileOutputStream out = new FileOutputStream(dist);
        byte[] buffer = new byte[20 * 1024];
        int cnt;
        // read() 最多读取 buffer.length 个字节
        // 返回的是实际读取的个数
        // 返回 -1 的时候表示读到 eof，即文件尾
        while ((cnt = in.read(buffer, 0, buffer.length)) != -1) {
            out.write(buffer, 0, cnt);
        }
        in.close();
        out.close();
    }
}
