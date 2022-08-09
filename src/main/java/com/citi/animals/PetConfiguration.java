package com.citi.animals;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PetConfiguration {
    @Bean
    public Person person(@Autowired Pet pet) {
        Person p = new Person();
        p.setPet();
        return p;
    }

    @Bean
    public Pet cat(){
        return new Cat();
    }
}