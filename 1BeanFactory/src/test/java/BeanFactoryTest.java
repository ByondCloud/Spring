import com.cloud.service.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/12
 * @Time 21:44
 */
public class BeanFactoryTest {
    public static void main(String[] args) {
        // 创建一个工厂对象
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 创建一个读取器
        // 读取器和工厂绑定
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        // 读取xml文件
        reader.loadBeanDefinitions("beans.xml");
        // 根据id获取bean对象
        UserService userService = (UserService) beanFactory.getBean("userService");
    }
}
