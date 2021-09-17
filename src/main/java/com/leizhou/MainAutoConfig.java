package com.leizhou;

import com.leizhou.dto.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class MainAutoConfig implements CommandLineRunner {

    @Autowired
    Person person;

    public static void main(String[] args) {
        SpringApplication.run(MainAutoConfig.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(person.toString());
    }
}
