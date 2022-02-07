package com.hansheng.springbootquickstart;

import com.hansheng.springbootquickstart.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SpringBootQuickStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootQuickStartApplication.class, args);
    }
}
