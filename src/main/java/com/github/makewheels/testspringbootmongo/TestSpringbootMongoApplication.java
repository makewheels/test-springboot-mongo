package com.github.makewheels.testspringbootmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

import javax.annotation.Resource;
import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class TestSpringbootMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestSpringbootMongoApplication.class, args);
    }

}
