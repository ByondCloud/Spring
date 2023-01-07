import com.cloud.service.UserService;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/17
 * @Time 1:41
 */
public class Test {
    public static void main(String[] args) {

        System.setProperty("spring.profiles.active", "test");

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Application.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        UserService userService1 = applicationContext.getBean("userService", UserService.class);
//        UserService userService2 = applicationContext.getBean(UserService.class);
        System.out.println(userService);
        System.out.println(userService1);
//        System.out.println(userService2);
    }
}
