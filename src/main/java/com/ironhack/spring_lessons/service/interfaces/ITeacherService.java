package com.ironhack.spring_lessons.service.interfaces;

import com.ironhack.spring_lessons.model.Teacher;

import java.util.List;

public interface ITeacherService {
    List<Teacher> getAllTeachers();
    Teacher getTeacherById(Integer id);
}
