package com.pos.hotel.service.impl;

import com.pos.hotel.model.entity.Student;
import com.pos.hotel.model.request.StudentRequest;
import com.pos.hotel.model.response.StudentResponse;
import com.pos.hotel.model.response.base.PageMetaData;
import com.pos.hotel.model.response.base.RestListResponse;
import com.pos.hotel.repository.StudentRepository;
import com.pos.hotel.service.api.ModelConverterService;
import com.pos.hotel.service.api.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by askarymrumhadi on 05/11/17.
 */
@Service public class StudentServiceImpl implements StudentService {

    private static final String STUDENT_NOT_FOUND = "Student Not Found";

    @Autowired private StudentRepository studentRepository;

    @Autowired private ModelConverterService modelConverterService;

    @Override public List<StudentResponse> findAll() {
        List<Student> students = this.studentRepository.findAll();
        return this.modelConverterService.convertToStudentListResponse(students);
    }

    @Override public RestListResponse<StudentResponse> findPageable(StudentRequest request) {
        BigDecimal totalRecords = BigDecimal.valueOf(this.studentRepository.countTotalRecords());
        int size = request.getPageMetaData().getSize();
        int page = request.getPageMetaData().getPage();
        int offset = page * size;
        List<Student> students = this.studentRepository.findPageable(size, offset);
        List<StudentResponse> studentResponses =
            this.modelConverterService.convertToStudentListResponse(students);
        return new RestListResponse<>(null, null, true, studentResponses,
            new PageMetaData(page, size, totalRecords));
    }

    @Override public List<StudentResponse> findByFirstName(String firstName) {
        List<Student> students = this.studentRepository.findByFirstName(firstName);
        return this.modelConverterService.convertToStudentListResponse(students);
    }

    @Override public StudentResponse saveStudent(StudentRequest request) throws Exception {
        Student student = new Student();
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setBirthDate(request.getBirthDate());

        return this.modelConverterService
            .convertToStudentResponse(this.studentRepository.save(student));
    }

    @Override public StudentResponse updateStudent(StudentRequest request) throws Exception {
        Student student = this.studentRepository.findById(request.getId());
        if (student == null) {
            throw new Exception(this.STUDENT_NOT_FOUND);
        } else {
            student.setFirstName(request.getFirstName());
            student.setLastName(request.getLastName());
            student.setBirthDate(request.getBirthDate());
            return this.modelConverterService
                .convertToStudentResponse(this.studentRepository.save(student));
        }
    }

    @Override public void deleteStudent(String id) throws Exception {
        Student student = this.studentRepository.findById(id);
        if (student == null) {
            throw new Exception(this.STUDENT_NOT_FOUND);
        }
        this.studentRepository.delete(student);
    }
}
