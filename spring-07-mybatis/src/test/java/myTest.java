import com.huang.mapper.UserMapper;
import com.huang.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class myTest {
    @Test
    public void test1() throws IOException {
//        String resource="mybatis-config.xml";
//        InputStream inputStream= Resources.getResourceAsStream(resource);
//
//        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//
//        List<User> users = mapper.selectUser();
//        System.out.println(users.toString());


        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSession sqlSession = context.getBean("sqlsession", SqlSessionTemplate.class);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();
        System.out.println(users.toString());


    }
}
