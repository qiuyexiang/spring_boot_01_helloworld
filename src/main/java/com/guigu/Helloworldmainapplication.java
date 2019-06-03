package com.guigu;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class Helloworldmainapplication {
    public static void main(String[] args) {
        //让spring应用启动起来
        SpringApplication.run(Helloworldmainapplication.class,args);
    }
}
