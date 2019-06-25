package javaConcurrent;

public class threadLocal {
    ThreadLocal<Long> longLocal = new ThreadLocal<Long>();
    ThreadLocal<String> stringLocal = new ThreadLocal<String>();
    public static long i=1;

    public void set() {

        longLocal.set(i++);
        stringLocal.set(Thread.currentThread().getName());
    }

    public long getLong() {
        return longLocal.get();
    }
    public void remove(){
        longLocal.remove();
        stringLocal.remove();
    }
    public String getString() {
        return stringLocal.get();
    }

    public static void main(String[] args) throws InterruptedException {
        final threadLocal test = new threadLocal();


        test.set();
        System.out.println(test.getLong());
        System.out.println(test.getString());
        test.remove();
        test.set();
        System.out.println(test.getLong());
        System.out.println(test.getString());

        Thread thread1 = new Thread(){
            public void run() {
                test.set();
                System.out.println(test.getLong());
                System.out.println(test.getString());

            };
        };
        thread1.start();
        thread1.join();

        System.out.println(test.getLong());
        System.out.println(test.getString());
    }
}