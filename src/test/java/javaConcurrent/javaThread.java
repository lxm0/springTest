package javaConcurrent;

import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class javaThread {
    public static void main(String[] args) {
        MyRunnable instance = new MyRunnable();
        Thread thread = new Thread(instance);
        thread.start();
    }
    @Test
    public void test01() throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<Integer>(mc);
        Thread thread = new Thread(ft);
        thread.start();
        System.out.println(ft.get());
    }
    @Test
    public void test02(){
        MyThread mt = new MyThread();
        mt.start();
    }
    @Test
    public void test03(){
        String a="123";
        String b ="123";
        String c = new String("123");
        System.out.println(a==c);
    }

}
class MyRunnable implements Runnable {
    public void run() {
// ...

        System.out.println("MyRunnable线程启动");

    }
}
class MyCallable implements Callable<Integer> {
    public Integer call() {
        return 123;
    }
}
class MyThread extends Thread {
    public void run() {
        System.out.println("MyThread线程启动");
    }
}