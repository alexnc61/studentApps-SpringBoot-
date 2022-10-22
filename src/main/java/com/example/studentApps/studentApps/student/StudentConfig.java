package com.example.studentApps.studentApps.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.JANUARY;
import static java.time.Month.JULY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student("Mariam","mariam@gmail.com", LocalDate.of(2009, JANUARY,5)
                    );
            Student alex = new Student("Alex","alex@gmail.com", LocalDate.of(2002, JULY,5)
                    );
            repository.saveAll(
                    List.of(mariam,alex)
            );


        };
    }
}
