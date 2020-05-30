package com.reptile.web.start;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@Slf4j
@SpringBootApplication(scanBasePackages={"com.reptile"})
@MapperScan("com.reptile.mapper.dao")
public class BootStrap implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BootStrap.class, args);
    }

    @Override
    public void run(String... args) {
        log.info("启动完成...");
        System.setProperty("sun.net.client.defaultConnectTimeout", "30000");
        System.setProperty("sun.net.client.defaultReadTimeout", "30000");
    }

}
