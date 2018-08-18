package com.mj;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

/**
 * Created by：mingwang
 * Company：MJ
 * Date：2017/12/21
 */
@Slf4j
@SpringBootApplication
public class KEApplication {
    public static void main(String[] args) {
        Environment env = SpringApplication.run(KEApplication.class, args).getEnvironment();
        log.info("\n----------------------------------------------------------\n\t" +
                        "Application '{}' is running! Access URLs:\n\t" +
                        "Local: \t\thttp://localhost:{}\n----------------------------------------------------------",
                env.getProperty("spring.application.name"),
                env.getProperty("server.port"));
    }
}
