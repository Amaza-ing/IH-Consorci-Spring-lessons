package com.ironhack.spring_lessons.controller.impl;

import com.ironhack.spring_lessons.controller.interfaces.ITeacherController;
import com.ironhack.spring_lessons.model.Teacher;
import com.ironhack.spring_lessons.service.interfaces.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TeacherController implements ITeacherController {
    @Autowired
    ITeacherService teacherService;

    @GetMapping("/teachers")
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @GetMapping("/teachers/{id}")
    public Teacher getTeacherById(@PathVariable Integer id) {
        return teacherService.getTeacherById(id);
    }
}
