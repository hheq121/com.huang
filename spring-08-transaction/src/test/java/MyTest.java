import com.huang08.services.UserServicesImpl;
import com.huang08.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServicesImpl services = context.getBean("UserServices", UserServicesImpl.class);
        services.AddAndQuery();
    }
}
