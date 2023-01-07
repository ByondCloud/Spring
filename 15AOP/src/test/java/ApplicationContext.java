import com.cloud.config.SpringConfig;
import com.cloud.dao.UserDao;
import com.cloud.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/31
 * @Time 1:19
 */
public class ApplicationContext {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
//        UserService bean = annotationConfigApplicationContext.getBean(UserService.class);
//        bean.show1();
        UserDao bean = annotationConfigApplicationContext.getBean(UserDao.class);
        bean.show();
    }
}
