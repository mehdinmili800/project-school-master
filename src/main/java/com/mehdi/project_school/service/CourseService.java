package com.mehdi.project_school.service;

import com.mehdi.project_school.dto.response.CourseResponseDTO;
import com.mehdi.project_school.entity.Course;

public interface CourseService {

    Course create(CourseResponseDTO courseResponseDTO);
}
