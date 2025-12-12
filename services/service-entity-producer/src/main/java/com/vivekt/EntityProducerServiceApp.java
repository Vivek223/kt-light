package com.vivekt;

import com.vivekt.services.eps.EntityProducer;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EntityProducerServiceApp {
    @Autowired
    EntityProducer entityProducer;

    public static void main(String[] args) {
        SpringApplication.run(EntityProducerServiceApp.class, args);
    }

    @PostConstruct
    void startService(){
        System.out.println("post construct.. entity producer starting");
        entityProducer.start();
        System.out.println("post construct.. finished");
    }
}
