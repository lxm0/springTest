package Spring.annotation;

import com.njupt.ApplicationEvent.DemoPublisher;
import com.njupt.config.MainConfigAppEvent;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationEvent {
    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MainConfigAppEvent.class);
        DemoPublisher demoPublisher = applicationContext.getBean(DemoPublisher.class);
        demoPublisher.publish("nihao");
    }
}
