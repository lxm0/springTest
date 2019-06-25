package javaConcurrent;

import java.util.concurrent.*;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        // 创建一个线程池对象，控制要创建几个线程对象。
        ExecutorService pool = Executors.newFixedThreadPool(2);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                5, 5,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
        // 可以执行Runnable对象或者Callable对象代表的线程
        pool.execute(new MyRunnableDemo());
        pool.submit(new MyRunnableDemo());
        executor.execute(new MyRunnableDemo());
        //结束线程池
        pool.shutdown();
        executor.shutdown();
    }
}
class MyRunnableDemo implements Runnable {

    public void run() {
        for (int x = 0; x < 100; x++) {
            System.out.println(Thread.currentThread().getName() + ":" + x);
        }
    }
}
