package Spring.xml;

import com.njupt.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {
    @Test
    public void testIOC(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring/applicationcontext.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(applicationContext.getId());
        System.out.println(person);


    }
}
