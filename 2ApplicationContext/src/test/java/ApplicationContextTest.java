import com.cloud.dao.UserDao;
import com.cloud.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/12
 * @Time 21:49
 */
public class ApplicationContextTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Application.xml");
//        UserService userService = (UserService) applicationContext.getBean("userService");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        System.out.println(userDao);
        userDao = (UserDao) applicationContext.getBean("userDao");
        System.out.println(userDao);
        userDao = (UserDao) applicationContext.getBean("userDao");
        System.out.println(userDao);
    }
}
