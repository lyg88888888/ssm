package com.lyg.ssm.spring;

import com.lyg.ssm.service.IAccountService;
import com.lyg.ssm.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void test1(){

        ApplicationContext applicationContext  =  new ClassPathXmlApplicationContext("applicationContext.xml");

        IUserService userService = applicationContext.getBean("userService", IUserService.class);

        System.out.println(userService);

        IAccountService accountService = applicationContext.getBean("accountService",IAccountService.class);

        accountService.transfer(1,2,1000.0);

    }
}
