package Spring.xml;

import com.njupt.pojo.UserInfo;
import com.njupt.service.DemoService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class transactionTest {
    @Test
    public void test1(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring/applicationcontext.xml");
        DemoService demoService = applicationContext.getBean(DemoService.class);
        UserInfo userInfo =demoService.getUserInfo();
        System.out.println(userInfo);
    }
    @Test
    public void test2(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring/applicationcontext.xml");
        DemoService demoService = applicationContext.getBean(DemoService.class);
//        demoService.updateName();
    }
}
