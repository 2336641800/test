package cn.smbms.service.role;


import cn.smbms.pojo.Role;
import cn.smbms.service.user.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class RoleServiceTest {
    @Test
    public void getRoleList() throws Exception {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        RoleService bean = context.getBean(RoleService.class);
        List<Role> roleList = bean.getRoleList();
        for (Role role : roleList) {
            System.out.println(role);
        }
    }



}
