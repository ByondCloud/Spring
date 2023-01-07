package com.cloud.web; /**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/5
 * @Time 7:20
 */

import com.cloud.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/accountServlet")
public class AccountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = request.getServletContext();
        ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        AccountService bean = applicationContext.getBean(AccountService.class);
        bean.transferMoney("tom", "lucy", 500);
    }
}
