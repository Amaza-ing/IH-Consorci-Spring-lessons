package com.ironhack.spring_lessons.controller.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseClassroomDTO {
    @NotEmpty(message = "Classroom cannot be empty")
    private String classroom;
}
