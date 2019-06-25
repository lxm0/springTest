import com.njupt.pojo.UserInfo;
import com.njupt.bean.Person;
import com.njupt.config.Animal;
import com.njupt.config.MainConfig;
import com.njupt.mapper.GroupMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

public class test {
    @Test
    public void test(){
        ApplicationContext ctx = new FileSystemXmlApplicationContext("F:\\Java\\test\\SpringTest\\src\\main\\resources\\spring\\applicationcontext.xml");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationcontext.xml");
        System.out.println(applicationContext.getBeanDefinitionCount());

        Person person = (Person) applicationContext.getBean("person");
        String[] strings = applicationContext.getBeanDefinitionNames();//获取所有的beans名
        for(int i=0;i<strings.length;i++){
            Class<?> beanType = applicationContext.getType(strings[i]);
            try {
               String name =  beanType.getDeclaredField("name").toString();
               System.out.println(name);
            }catch (Exception e){

            }
            System.out.println(beanType);
        }
        //person.work();

    }
    @Test
    public void AnnotationTest(){
       ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(MainConfig.class);
       Animal animal= applicationContext.getBean(Animal.class);
       System.out.println(animal.toString());

    }
    @Test
    public void mybatistest() throws IOException {
        Logger logger = Logger.getLogger(Test.class);
        logger.info("这是调试信息");
        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        GroupMapper mapper = session.getMapper(GroupMapper.class);
        UserInfo userInfo = mapper.testbind("es");
//        UserInfo o = session.selectOne("com.njupt.GroupMapper.selectByname","te");
        System.out.println(userInfo.toString());
        session.close();
    }
    @Test
    public void test003(){
        Logger logger = Logger.getLogger(Test.class);
        logger.info("这是info信息");
        logger.debug("这是调试信息");
    }
    @Test
    public void testEqualsAndHahCode(){
        Object o = new Object();
        Object o1 = new Object();
        HashMap map = new HashMap();
        map.put("s",1);
        Integer integer =(Integer) map.put("ss",12);
        System.out.println(integer);
        System.out.println(o.hashCode());
        System.out.println(o1.hashCode());
        o.equals(o1);
    }
    @Test
    public void test00(){
        Object o = new Object();
        test test = new test();
        System.out.println(test.hashCode());
    }
    public native int hashCode();
}
