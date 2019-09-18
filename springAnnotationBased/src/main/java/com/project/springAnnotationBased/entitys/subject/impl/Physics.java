package com.project.springAnnotationBased.entitys.subject.impl;

import com.project.springAnnotationBased.entitys.subject.Subject;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Physics implements Subject {
    private static final String SUBJECT_NAME = "Physics";

    @Override
    public String getSubjectName() {
        return SUBJECT_NAME;
    }
}
