import com.cloud.dao.UserDao;
import com.cloud.dao.impl.UserDaoImpl;
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
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Application.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.show();
    }
}
