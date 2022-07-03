package com.meituan.mdp.module1;

import com.meituan.mdp.module2.EnglishCat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Import(EnglishCat.class)
@ImportResource({"classpath:spring/applicationContext.xml"})
@SpringBootApplication
public class ApplicationLoader {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ApplicationLoader.class);
        application.setAdditionalProfiles("test");
        application.run(args);
    }
}


