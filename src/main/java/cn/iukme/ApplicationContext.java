package cn.iukme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@EnableJpaRepositories(basePackages= "cn.iukme.dto")
@EntityScan("cn.iukme.domain")
public class ApplicationContext {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationContext.class,args);
    }
}
