package com.example.apicommondemo;

import com.example.apicommondemo.dao.CustomersRepo;
import com.example.apicommondemo.entities.Customers;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiCommonDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiCommonDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomersRepo customersRepo){
        return args ->{
            customersRepo.save(new Customers("978696596","534546","cheikh","M","youssef","H"));
            customersRepo.save(new Customers("978696996","534746","ch","M","anne","F"));
            customersRepo.save(new Customers("478696596","434546","chekh","M","youness","H"));
            customersRepo.findAll().forEach(c->{
                System.out.println(c.toString());
            });
        };
    };

}
