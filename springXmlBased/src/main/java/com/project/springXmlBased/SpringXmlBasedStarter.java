package com.project.springXmlBased;

import com.project.springXmlBased.entitys.student.Student;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringXmlBasedStarter {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:springXML/app-context.xml");
        ctx.refresh();

        Student student = ctx.getBean("student", Student.class);
        System.out.println(student.study());
        ctx.close();
    }
}
