package com.citi.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfiguration {
    @Bean
    public Person person(@Autowired Car car) {
        Person p = new Person(car);
        p.setCar(car);
        return p;
    }

    @Bean
    public Car car(){
        return new Nissan();
    }
}