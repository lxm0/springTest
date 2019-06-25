package mybatisTest;

import com.njupt.mapper.GroupMapper;
import com.njupt.mapper.UserInfoMapper;
import com.njupt.pojo.UserInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {
    public static void main(String[] args) {
        final ThreadLocal<String> threadLocal = new ThreadLocal<String>();
        threadLocal.set("测试");
        new Thread(){
            @Override
            public void run() {
//                threadLocal.set("测试2");
                String result  =threadLocal.get();
                System.out.println("结果："+result);
//                super.run();
            }
        }.run();

        String s =  threadLocal.get();
        //System.out.println(s);
    }
    @Test
    public void test() throws IOException {
        //缓存
        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        GroupMapper mapper = session.getMapper(GroupMapper.class);
        UserInfo userInfo = mapper.testbind("es");
        session.close();
        SqlSession session2 = factory.openSession();
        GroupMapper mapper2 = session2.getMapper(GroupMapper.class);
        UserInfo userInfo2 = mapper2.testbind("es");
        System.out.println(userInfo.toString());
        session2.close();
    }
    @Test
    public void testAnnotation() throws IOException {
        //注解
        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);
        UserInfo userInfo = mapper.getUserinfo(1);
        System.out.println(userInfo.toString());
        session.close();
    }
    @Test
    public void springWithMybatis() throws IOException {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring/applicationcontext.xml");

//        SqlSessionFactory sqlSessionFactory  = (SqlSessionFactory) applicationContext.getBean("factory");
//        SqlSession session  = sqlSessionFactory.openSession();
//        GroupMapper mapper = session.getMapper(GroupMapper.class);
//        UserInfo userInfo = mapper.select(1);
//        System.out.println(userInfo.toString());
//        session.close();
        String[] strings = applicationContext.getBeanDefinitionNames();
        for (String s:strings){
            System.out.println(s);
        }
        GroupMapper groupMapper  =applicationContext.getBean(GroupMapper.class);
        UserInfo userInfo = groupMapper.select(1);
        System.out.println(userInfo);


    }
    @Test
    public void test05() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        Configuration configuration = factory.getConfiguration();

        GroupMapper mapper = session.getMapper(GroupMapper.class);

        UserInfo userInfo = mapper.selectByname("test");
        System.out.println(userInfo);
        session.close();

    }

}
