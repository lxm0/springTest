package Spring.annotation;

import com.njupt.config.MainConfigOfProfile;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class IOCTest_Profile {
    //使用命令行参数:-Dspring.profiles.active=test
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext();
        //设置需要激活的环境
        applicationContext.getEnvironment().setActiveProfiles("test","dev");
        //注册主配置类
        applicationContext.register(MainConfigOfProfile.class);
        //启动刷新容器
        applicationContext.refresh();

        String[] beanForTypes = applicationContext.getBeanNamesForType(DataSource.class);
        for(String bean:beanForTypes){
            System.out.println(bean);
        }
        applicationContext.close();
    }
}
