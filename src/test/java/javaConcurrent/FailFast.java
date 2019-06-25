package javaConcurrent;

import java.util.HashMap;
import java.util.Iterator;

public class FailFast {
    final static HashMap map = new HashMap();
    public static void main(String[] args) {

        map.put("s1",1);
        map.put("s2",2);
        map.put("s3",3);
        map.put("s4",4);
        map.put("s5",5);
        final Thread thread1 = new Thread(new Runnable() {

            public void run() {
                Iterator<String> keys = map.keySet().iterator();
                while(keys.hasNext()){
//                    System.out.println(map.size());
                    String key =  keys.next();
                    System.out.println(key);
//                    map.remove("s5");
                    keys.remove();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {

            public void run() {
//               map.remove("s5");
            }
        });
//        thread1.start();
//        thread2.start();

        Iterator<String> keys = map.keySet().iterator();
        while(keys.hasNext()){
            String key =  keys.next();
            System.out.println(key);
                    map.remove("s5");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
