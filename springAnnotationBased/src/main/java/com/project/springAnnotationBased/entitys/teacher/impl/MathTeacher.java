package com.project.springAnnotationBased.entitys.teacher.impl;

import com.project.springAnnotationBased.entitys.teacher.Teacher;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class MathTeacher implements Teacher {
    private static final String TEACHER_NAME = "Gorbunovich";

    @Override
    public String getTeacherName() {
        return TEACHER_NAME;
    }
}
