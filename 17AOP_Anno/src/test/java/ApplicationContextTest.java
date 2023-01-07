import com.cloud.config.SpringConfig;
import com.cloud.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/4
 * @Time 2:59
 */
public class ApplicationContextTest {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserDao bean = applicationContext.getBean(UserDao.class);
        bean.show();
    }
}
