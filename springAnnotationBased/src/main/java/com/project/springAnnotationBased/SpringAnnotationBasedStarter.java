package com.project.springAnnotationBased;

import com.project.springAnnotationBased.config.SpringAnnotationBasedConfig;
import com.project.springAnnotationBased.entitys.student.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringAnnotationBasedStarter {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringAnnotationBasedConfig.class);
//        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:app-context.xml");
        Student student = ctx.getBean("student", Student.class);
        System.out.println(student.study());
    }
}
