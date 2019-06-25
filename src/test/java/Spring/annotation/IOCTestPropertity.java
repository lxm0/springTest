package Spring.annotation;

import com.njupt.config.MainConfigOfPropertityValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTestPropertity {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertityValues.class);

    @Test
    public void test01(){
        Object s = applicationContext.getBean("animal");
        System.out.println(s);
    }
}
