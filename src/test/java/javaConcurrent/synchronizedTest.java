package javaConcurrent;

import org.junit.Test;

public class synchronizedTest {
    public static void main(String[] args) {
        final staticTest test = new staticTest();
        final Thread thread1 = new Thread(new Runnable() {
            public void run() {
                test.method();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {

            public void run() {
                staticTest.staticMethods();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        thread2.start();
    }
    @Test
    public  void test(){

    }
}
class staticTest  {
    public synchronized  static void staticMethods(){
        System.out.println("staticMethods begin at:" + System.currentTimeMillis());
        System.out.println("staticMethods");
        System.out.println("staticMethods end at:" + System.currentTimeMillis());

    }
    public synchronized void method(){
        System.out.println("method begin at:" + System.currentTimeMillis());
        System.out.println("Methods");
        System.out.println("method end at:" + System.currentTimeMillis());

    }
}