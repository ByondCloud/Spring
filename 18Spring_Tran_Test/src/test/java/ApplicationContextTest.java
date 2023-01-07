import com.cloud.config.SpringConfig;
import com.cloud.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/4
 * @Time 7:39
 */
public class ApplicationContextTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService bean = applicationContext.getBean(AccountService.class);
        bean.transferMoney("tom", "lucy", 500);
    }
}
