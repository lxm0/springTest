package Spring.annotation;

import com.njupt.bean.Red;
import com.njupt.config.MainConfigAutoWired;
import com.njupt.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTestAutowired {
    @Test
    public void test1(){
        AnnotationConfigApplicationContext applicationContext =new AnnotationConfigApplicationContext(MainConfigAutoWired.class);
        BookService bookService = applicationContext.getBean(BookService.class);
        bookService.print();
//        BookDao bookDao = applicationContext.getBean(BookDao.class);
//        System.out.println(bookDao);
        applicationContext.close();

    }
    @Test
    public void test2(){
        try{
            int n=5/0;
        }catch (Exception e){
            System.out.println("catch");
        }
        finally {
            try{
                int m = 6/0;
            }catch (Exception e){
                System.out.println("finally");
            }
        }
    }
    @Test
    public void test3(){
        AnnotationConfigApplicationContext applicationContext =new AnnotationConfigApplicationContext(MainConfigAutoWired.class);
        Red bean  = applicationContext.getBean(Red.class);
        System.out.println(applicationContext);
        System.out.println(bean);
    }
}
