package com.reptile.web.start;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class BootStrap implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BootStrap.class, args);
    }
    private  static Logger log2 = LoggerFactory.getLogger(BootStrap.class);

    @Override
    public void run(String... args) {
        log.info("启动完成...");
        log2.info("启动完成2...");
        System.out.println("启动完成s...");
        System.setProperty("sun.net.client.defaultConnectTimeout", "30000");
        System.setProperty("sun.net.client.defaultReadTimeout", "30000");
    }

}
