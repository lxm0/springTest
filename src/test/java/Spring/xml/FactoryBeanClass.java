package Spring.xml;

import com.njupt.SimpleIOC.FactoryBeanTest;
import com.njupt.bean.Demo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanClass {
    @Test
    public void test(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring/applicationcontext.xml");
        /**
         * 根据该Bean的ID从BeanFactory中获取的实际上是FactoryBean的getObject()返回的对象，
         * 而不是FactoryBean本身，如果要获取FactoryBean对象，请在id前面加一个&符号来获取
         */
        FactoryBeanTest factoryBeanTest = (FactoryBeanTest)applicationContext.getBean("factoryBeanLearn");
        factoryBeanTest.test();
    } @Test
    public void test02(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring/applicationcontext.xml");
        Demo demo = applicationContext.getBean(Demo.class);
        demo.demo3();
    }
}
