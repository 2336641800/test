package cn.smbms.service.user;


import cn.smbms.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserServiceTest {
    @Test
    public void getUserCount() throws Exception {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService bean = context.getBean(UserService.class);
        bean.getUserCount("张",1);
    }

    @Test
    public void getUserList() throws Exception {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService bean = context.getBean(UserService.class);
        List<User> userList = bean.getUserList("系", 1, 0, 5);
        for (User user : userList) {
            System.out.println(user);
        }
    }



}
