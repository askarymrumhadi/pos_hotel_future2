package com.pos.hotel.service.impl;

import com.pos.hotel.model.entity.Student;
import com.pos.hotel.model.response.StudentResponse;
import com.pos.hotel.service.api.ModelConverterService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ModelConverterServiceImpl implements ModelConverterService {

    @Override public List<StudentResponse> convertToStudentListResponse(List<Student> students) {
        List<StudentResponse> studentResponses = new ArrayList<>();
        for (Student student : students) {
            StudentResponse studentResponse = new StudentResponse();
            studentResponse.setFirstName(student.getFirstName());
            studentResponse.setLastName(student.getLastName());
            studentResponse.setBirthDate(student.getBirthDate());
            studentResponses.add(studentResponse);
        }
        return studentResponses;
    }

    @Override public StudentResponse convertToStudentResponse(Student student) {
        StudentResponse studentResponse = new StudentResponse();
        studentResponse.setFirstName(student.getFirstName());
        studentResponse.setLastName(student.getLastName());
        studentResponse.setBirthDate(student.getBirthDate());
        return studentResponse;
    }
}
