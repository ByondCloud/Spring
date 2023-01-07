import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/12/17
 * @Time 11:24
 */
public class TestDate {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Application.xml");
        Date date = applicationContext.getBean("date", Date.class);
        System.out.println(date);
    }
}
