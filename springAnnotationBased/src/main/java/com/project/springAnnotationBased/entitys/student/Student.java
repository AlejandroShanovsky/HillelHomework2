package com.project.springAnnotationBased.entitys.student;

import com.project.springAnnotationBased.entitys.subject.Subject;
import com.project.springAnnotationBased.entitys.teacher.Teacher;
import com.project.springAnnotationBased.exceptions.StudentException;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Data
@Component(value = "student")
public class Student {
    private String name;
    private Integer age;
    @Autowired
    private Teacher teacher;
    @Autowired
    private Subject subject;
    private Map<String, Integer> marks;

    private void setStudentMarksBySubject(String subjectName) {
        marks.put(subjectName, new Random().nextInt(12));
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.marks = new HashMap();
    }

    public String study() {
        if (teacher.getTeacherName() != null && subject.getSubjectName() != null) {
            setStudentMarksBySubject(subject.getSubjectName());
            if (marks.containsKey(subject.getSubjectName())) {
                return "I " + name + " study with teacher " + teacher.getTeacherName() + " these subjects " + subject.getSubjectName() +
                        " and have these marks " + marks.get(subject.getSubjectName());
            } else {
                return "I study with teacher " + teacher.getTeacherName() + " these subjects " + subject.getSubjectName() + " without marks.";
            }
        } else {
            throw new StudentException("Something wrong!");
        }
    }
}
