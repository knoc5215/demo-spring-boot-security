package me.jumen.demospringbootsecurity;

import me.jumen.demospringbootsecurity.account.Account;
import me.jumen.demospringbootsecurity.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SecurityRunner implements ApplicationRunner {

    @Autowired
    AccountService accountService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account account = accountService.createAccount("jumen", "5215");
        System.out.println("username : " + account.getUsername() + ", password : " + account.getPassword());
    }
}
