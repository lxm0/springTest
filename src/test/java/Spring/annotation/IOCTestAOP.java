package Spring.annotation;

import com.njupt.aop.MathCalculator;
import com.njupt.config.MainConfAspect;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTestAOP {

    @Autowired
    MathCalculator mathCalculator;

    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfAspect.class);
        MathCalculator mathCalculator  =applicationContext.getBean(MathCalculator.class);
        mathCalculator.div(1,1);
        System.out.println("--------");
        mathCalculator.div(1,2);
        applicationContext.close();
    }
}
