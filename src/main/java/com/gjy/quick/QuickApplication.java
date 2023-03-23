package com.gjy.quick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication  //标志这是一个SpringBoot应用
@ServletComponentScan
@EnableTransactionManagement  //开启事务支持
public class QuickApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuickApplication.class,args);
    }
}
