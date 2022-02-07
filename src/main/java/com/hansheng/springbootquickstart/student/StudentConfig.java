package com.hansheng.springbootquickstart.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            studentRepository.save(new Student("Student 1", LocalDate.of(2000, Month.JANUARY, 1),  "student1@student1.com"));
            studentRepository.save(new Student("Student 2", LocalDate.of(2000, Month.JANUARY, 1),  "student2@student2.com"));
        };
    }
}
