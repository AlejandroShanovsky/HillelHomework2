package com.project.springAnnotationBased.config;

import com.project.springAnnotationBased.entitys.student.Student;
import com.project.springAnnotationBased.entitys.subject.Subject;
import com.project.springAnnotationBased.entitys.subject.impl.Math;
import com.project.springAnnotationBased.entitys.teacher.Teacher;
import com.project.springAnnotationBased.entitys.teacher.impl.MathTeacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"com.project.springAnnotationBased.config"})
@Configuration
public class SpringAnnotationBasedConfig {
    @Bean
    public Student student() {
        return new Student("Sasha" , 25);
    }

    @Bean
    public Teacher teacher() {
        return new MathTeacher();
    }

    @Bean
    public Subject subject() {
        return new Math();
    }
}
