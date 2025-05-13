package com.ironhack.spring_lessons.service.impl;

import com.ironhack.spring_lessons.model.Teacher;
import com.ironhack.spring_lessons.repository.TeacherRepository;
import com.ironhack.spring_lessons.service.interfaces.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService implements ITeacherService {
    @Autowired
    TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public Teacher getTeacherById(Integer id) {
        Optional<Teacher> teacherOptional = teacherRepository.findById(id);
        if (teacherOptional.isEmpty()) return null;
        return teacherOptional.get();
    }
}
