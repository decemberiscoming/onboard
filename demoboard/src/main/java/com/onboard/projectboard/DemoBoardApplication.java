package com.onboard.projectboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class DemoBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoBoardApplication.class, args);
    }

}
