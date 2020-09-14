package cn.bdqn;

import cn.bdqn.domain.Account;
import cn.bdqn.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestMyBatisANDSpring {
    @Test
    public void testSpringAndMyBatis() throws Exception{
        ApplicationContext ac =  new ClassPathXmlApplicationContext("beans.xml");

        AccountService accountService = (AccountService) ac.getBean("accountService");

        List<Account> accounts = accountService.queryAll();

        System.out.println(accounts);
    }
}
