import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/17
 * @Time 8:18
 */
public class Test {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Application.xml");
        DruidDataSource druid = applicationContext.getBean("druid", DruidDataSource.class);
        try {
            Connection connection = druid.getConnection();
            String sql = "select * from test.account where id=100";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String string = resultSet.getString(2);
                System.out.println(string);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        // ------------------------------------------------------
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            DriverManager.getConnection("", "", "");
        } catch (Exception e) {
            e.printStackTrace();
        }


        // ------------------------------------------------------
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = simpleDateFormat.parse("2022-10-01 12:12:15");
    }
}
