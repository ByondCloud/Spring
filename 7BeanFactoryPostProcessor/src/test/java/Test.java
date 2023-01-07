import com.cloud.dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/20
 * @Time 14:31
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object userDao = applicationContext.getBean("userDao");
        System.out.println(userDao);
    }
}
