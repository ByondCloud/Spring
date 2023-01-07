import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/17
 * @Time 11:34
 */
public class TestMyBatis {
    public static void main(String[] args) throws Exception {
        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatis-config.xml"); // 静态工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder(); // 无参构造实例化
        SqlSessionFactory sqlSessionFactory = builder.build(resourceAsStream); // 实例工厂方法
    }
}
