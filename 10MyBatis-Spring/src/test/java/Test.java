import com.cloud.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/21
 * @Time 15:32
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = (UserService) applicationContext.getBean("service");
        service.show();
    }
}
