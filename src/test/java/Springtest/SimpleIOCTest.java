package Springtest;

import com.njupt.SimpleIOC.Car;
import com.njupt.SimpleIOC.Wheel;
import com.njupt.SimpleIOC.simpleIOC;
import org.junit.Test;

/**
 * 执行过程：
 * 1.读取配置文件，创建bean，注入字段值存入容器map中
 * 2.
 */
public class SimpleIOCTest {
    @Test
    public void getBean() throws Exception {
        //String location = simpleIOC.class.getClassLoader().getResource("ioc.xml").getFile();
        simpleIOC bf = new simpleIOC("F:\\Java\\test\\SpringTest\\src\\main\\java\\com\\njupt\\SimpleIOC\\ioc.xml");
        Wheel wheel = (Wheel) bf.getBean("wheel");
        System.out.println(wheel);
        Car car = (Car) bf.getBean("car");
        System.out.println(car);
    }
}