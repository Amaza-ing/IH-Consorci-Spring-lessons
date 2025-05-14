package com.ironhack.spring_lessons.controller.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseHoursDTO {
    @Max(value = 400, message = "The course cannot be longer than 400 hours")
    @Min(30)
    private Integer hours;
}
