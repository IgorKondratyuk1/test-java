package org.example.testspringrest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class TestSpringRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestSpringRestApplication.class, args);
    }

    @Bean
    public CommandLineRunner printActiveProfile(Environment environment) {
        return args -> {
            String activeProfile = environment.getProperty("spring.profiles.active", "default");
            String applicationPropertiesFileType = environment.getProperty("custom.application-properties-file-type");
            String password_from_env = environment.getProperty("custom.password_from_env");
            String customDefaultvalue = environment.getProperty("custom.defaultvalue");

            System.out.println("\t=====> Active Profile: " + activeProfile);
            System.out.println("\t=====> application-properties-file-type: " + applicationPropertiesFileType);
            System.out.println("\t=====> customPassword: " + password_from_env);
            System.out.println("\t=====> customDefaultvalue: " + customDefaultvalue);
        };
    }

}
