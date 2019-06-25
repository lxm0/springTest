package Spring.annotation;

import com.njupt.bean.Car;
import com.njupt.config.ManConfigLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_LifeCycle {
    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext  =new AnnotationConfigApplicationContext(ManConfigLifeCycle.class);
        System.out.println("容器创建完成");
        applicationContext.close();
    }
    @Test
    public void test2(){
        AnnotationConfigApplicationContext applicationContext  =new AnnotationConfigApplicationContext(ManConfigLifeCycle.class);
        System.out.println("容器创建完成");
    }
    @Test
    public void test3(){
        Car car = new Car();
        Object o = new Object();
        o.equals(car);
        o.hashCode();
        String s = "";
        s.equals("");
        s.hashCode();
        Integer i  = 1;
        i.equals(1);
        i.hashCode();
    }

}
