package com.ironhack.spring_lessons.service.interfaces;

import com.ironhack.spring_lessons.model.Course;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;
import java.util.Optional;

public interface ICourseService {
    List<Course> getAllCourses();
    Course getCourseById(String course);
    List<Course> getCoursesByHoursLessThan(Integer hours);
    List<Course> getCoursesByClassroomAndHours(String classroom, Optional<Integer> hours);

    void saveCourse(Course course);

    void deleteCourse(String id);

    Course updateCourse(Course course, String id);

    void updateCourseHours(Integer hours, String id);

    void updateCourseClassroom(String classroom, String id);
}
