package Spring.annotation;

import com.njupt.config.Animal;
import com.njupt.config.MianConfBeanPostProcessor;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCtestBeanPostProcessor {
    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MianConfBeanPostProcessor.class);
        //MyBeanPostProcessor myBeanPostProcessor =applicationContext.getBean(MyBeanPostProcessor.class);
        Animal animal = applicationContext.getBean(Animal.class);
        System.out.println(animal);
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for(String bean:beanNames){
            System.out.println(bean);
        }
    }
}
