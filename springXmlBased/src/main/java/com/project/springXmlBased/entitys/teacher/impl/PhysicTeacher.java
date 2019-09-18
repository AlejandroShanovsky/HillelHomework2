package com.project.springXmlBased.entitys.teacher.impl;

import com.project.springXmlBased.entitys.teacher.Teacher;
import lombok.Data;

@Data
public class PhysicTeacher implements Teacher {
    private static final String TEACHER_NAME = "No_name";

    @Override
    public String getTeacherName() {
        return TEACHER_NAME;
    }
}
