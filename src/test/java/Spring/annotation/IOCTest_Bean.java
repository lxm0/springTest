package Spring.annotation;

import com.njupt.config.MainConfigBeanTest;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class IOCTest_Bean {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MainConfigBeanTest.class);
        Object bean = applicationContext.getBean("dependency");
        Object bean1 = applicationContext.getBean("dependency1");

        System.out.println(bean);
    }
    @Test
    public void test02(){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MainConfigBeanTest.class);
        Object bean = applicationContext.getBean("dependency1");
        System.out.println(bean);

    }

}
