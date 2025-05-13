package com.ironhack.spring_lessons.controller.impl;

import com.ironhack.spring_lessons.model.Course;
import com.ironhack.spring_lessons.repository.CourseRepository;
import com.ironhack.spring_lessons.service.interfaces.ICourseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CourseController {
    @Autowired
    ICourseService courseService;


    //  ****************************************************  GET  ****************************************************

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/courses/{course}")
    public Course getCourseById(@PathVariable String course) {
        return courseService.getCourseById(course);
    }

    @GetMapping("/courses/hours")
    public List<Course> getCoursesByHoursLessThan(@RequestParam(defaultValue = "100") Integer hours) {
        return courseService.getCoursesByHoursLessThan(hours);
    }

    @GetMapping("/courses/classroom")
    public List<Course> getCoursesByClassroomAndHours(
            @RequestParam(defaultValue = "A1") String classroom,
            @RequestParam Optional<Integer> hours
    ) {
        return courseService.getCoursesByClassroomAndHours(classroom, hours);
    }


    //  ***************************************************  POST  ****************************************************

    @PostMapping("/courses")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCourse(@RequestBody @Valid Course course) {
        courseService.saveCourse(course);
    }


    //  **************************************************  DELETE  ***************************************************

    @DeleteMapping("/courses/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCourse(@PathVariable String id) {
        courseService.deleteCourse(id);
    }

}
