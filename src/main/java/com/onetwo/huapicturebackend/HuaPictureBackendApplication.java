package com.onetwo.huapicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@MapperScan("com.onetwo.huapicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class HuaPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuaPictureBackendApplication.class, args);
    }

}
