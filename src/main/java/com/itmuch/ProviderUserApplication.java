package com.itmuch;

import com.itmuch.dao.UserRepository;
import com.itmuch.entity.User;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.stream.Stream;

/**
 * @author evanYang
 * @version 1.0
 * @date 2019/06/16 23:05
 */
@SpringBootApplication
public class ProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication.class,args);
    }

    @Bean
    ApplicationRunner init(UserRepository repository){
        return args -> {
            User user1=new User(1l,"account1","张三",20,new BigDecimal(100.0));
            User user2=new User(1l,"account2","李四",30,new BigDecimal(200.0));
            User user3=new User(1l,"account3","王五",40,new BigDecimal(300.0));
            Stream.of(user1,user2,user3).forEach(repository::save);
        };
    }
}
