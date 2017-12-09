package com.pos.hotel.service.api;

import com.pos.hotel.model.entity.Student;
import com.pos.hotel.model.response.StudentResponse;

import java.util.List;

public interface ModelConverterService {

    StudentResponse convertToStudentResponse(Student student);

    List<StudentResponse> convertToStudentListResponse(List<Student> students);
}
