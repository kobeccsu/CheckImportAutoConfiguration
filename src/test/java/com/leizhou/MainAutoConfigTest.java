package com.leizhou;

import com.leizhou.autoconfiguration.MySeamlessConfig;
import com.leizhou.dto.Person;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@EnableConfigurationProperties(value = MySeamlessConfig.class)
@TestPropertySource("classpath:application.yml")
class MainAutoConfigTest {

    @Autowired
    Person person;

    @Test
    void testIt(){
        System.out.println(person.toString());
    }
}