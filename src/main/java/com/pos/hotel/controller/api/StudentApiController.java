package com.pos.hotel.controller.api;

import com.pos.hotel.model.request.StudentRequest;
import com.pos.hotel.model.response.StudentResponse;
import com.pos.hotel.model.response.base.BaseRestResponse;
import com.pos.hotel.model.response.base.RestListResponse;
import com.pos.hotel.model.response.base.RestSingleResponse;
import com.pos.hotel.service.api.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController public class StudentApiController {

    @Autowired private StudentService studentService;

    @PostMapping(path = "/api/students", produces = MediaType.APPLICATION_JSON_VALUE) @ResponseBody
    public RestListResponse<StudentResponse> getStudents(@RequestBody StudentRequest request) {
        RestListResponse<StudentResponse> response;
        try {
            response = this.studentService.findPageable(request);
        } catch (Exception e) {
            response = new RestListResponse<>(null, e.getMessage(), false);
        }
        return response;
    }

    @PostMapping(path = "/api/student", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public RestSingleResponse<StudentResponse> saveStudent(@RequestBody StudentRequest request) {
        RestSingleResponse<StudentResponse> response;
        try {
            response = new RestSingleResponse<>(null, null, true,
                this.studentService.saveStudent(request));
        } catch (Exception e) {
            response = new RestSingleResponse<>(null, e.getMessage(), false);
        }
        return response;
    }

    @PutMapping(path = "/api/student", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public RestSingleResponse<StudentResponse> updateStudent(@RequestBody StudentRequest request) {
        RestSingleResponse<StudentResponse> response;
        try {
            response = new RestSingleResponse<>(null, null, true,
                this.studentService.updateStudent(request));
        } catch (Exception e) {
            response = new RestSingleResponse<>(null, e.getMessage(), false);
        }
        return response;
    }

    @DeleteMapping(path = "/api/student/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody public BaseRestResponse deleteStudent(@PathVariable("id") String id) {
        BaseRestResponse response;
        try {
            this.studentService.deleteStudent(id);
            response = new BaseRestResponse(null, null, true);
        } catch (Exception e) {
            response = new BaseRestResponse(null, e.getMessage(), false);
        }
        return response;
    }

}
