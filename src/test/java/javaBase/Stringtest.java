package javaBase;

import org.junit.Test;

public class Stringtest {
    static String a="w";
    public static void main(String[] args) throws InterruptedException {
        final Stringtest stringtest = new Stringtest();
        System.out.println(a);
        Thread thread1 = new Thread(){
            public void run() {
                a="sss";
            }
        };
        thread1.start();
        thread1.join();

        System.out.println(a);
    }
    @Test
    public void test01(){
        String b = "123";
        String a =b;
        System.out.println(b);
        System.out.println(a);
        b="www";
        System.out.println(b);
        System.out.println(a);
    }
    @Test
    public void test02(){
        String b = "123";
        String a ="ww";
        String d ="123ww";
        String c =b+a;
        System.out.println(d==c);

    }
    @Test
    public void test03(){
        String b = "123";
        String a= new String("123");
        System.out.println(a==b);

    }
}
