package Spring.annotation;

import com.njupt.bean.Demo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
    @Test
    public void testAOPBefore(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring/applicationcontext.xml");

        Demo demo = (Demo) applicationContext.getBean("demo");
        demo.demo1();
        demo.demo2();
        demo.demo3();
    }
}
