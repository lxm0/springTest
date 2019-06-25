package Spring.annotation;

import com.njupt.conditional.windowsConditional;
import com.njupt.config.Animal;
import com.njupt.config.MainConfig;
import org.junit.Test;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class IOCTest {
    @Test
    public void iocTest(){
        AnnotationConfigApplicationContext applicationContext =new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beansName = applicationContext.getBeanDefinitionNames();
        for(String name:beansName){
            System.out.println(name);
        }
        Object bean1 = applicationContext.getBean("animal");
        Object bean2 = applicationContext.getBean("animal");
        Object p = applicationContext.getBean("properties");
        System.out.println(p);
        applicationContext.getType("animal");
        System.out.println(bean1==bean2);

    }
    @Test
    public void conditionalTest(){
        AnnotationConfigApplicationContext applicationContext =new AnnotationConfigApplicationContext(MainConfig.class);

        String[] namesFotType = applicationContext.getBeanNamesForType(Animal.class);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String name = environment.getProperty("os.name");
        System.out.println(name);
        for(String name1:namesFotType){
            System.out.println(name1.toString());
        }
        BeanDefinitionRegistry beanDefinitionRegistry = applicationContext.getDefaultListableBeanFactory();
        beanDefinitionRegistry.getBeanDefinition("animal");
    }
    @Test
    public void test04(){
        AnnotationConfigApplicationContext applicationContext =new AnnotationConfigApplicationContext(MainConfig.class);


        Object p = applicationContext.getBean("properties");
        System.out.println(p);

    }
    @Test
    public void test05(){
        AnnotationConfigApplicationContext applicationContext =new AnnotationConfigApplicationContext(MainConfig.class);

        windowsConditional windowsConditional = new windowsConditional();



    }
    @Test
    public void test06(){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MainConfig.class);
        Object bean = applicationContext.getBean("animal");
        System.out.println(bean);



    }

}
