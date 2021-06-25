import com.huang.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.PersistenceDelegate;

public class test1 {


    @Test
    public  void testabc(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("person",Person.class);
        person.getCat().shout();
        person.getDog().shout();
        System.out.println(person.toString());
    }
}
