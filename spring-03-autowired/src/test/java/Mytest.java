import com.rbc.spConfig;
import com.rbc.user;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {

    @Test
    public   void  test1()
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(spConfig.class);
        user use = context.getBean("user" , user.class);
        use.speack();

    }
}
