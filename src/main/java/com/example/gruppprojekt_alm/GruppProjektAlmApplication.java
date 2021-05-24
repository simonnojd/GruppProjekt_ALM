package com.example.gruppprojekt_alm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class GruppProjektAlmApplication {

    public static void main(String[] args) {
        SpringApplication.run(GruppProjektAlmApplication.class, args);
    }

}
