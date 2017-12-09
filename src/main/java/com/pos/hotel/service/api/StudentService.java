package com.pos.hotel.service.api;

import com.pos.hotel.model.request.StudentRequest;
import com.pos.hotel.model.response.StudentResponse;
import com.pos.hotel.model.response.base.BaseRestResponse;
import com.pos.hotel.model.response.base.RestListResponse;
import com.pos.hotel.model.response.base.RestSingleResponse;

import java.util.List;

/**
 * Created by askarymrumhadi on 05/11/17.
 */
public interface StudentService {

    List<StudentResponse> findAll();

    RestListResponse<StudentResponse> findPageable(StudentRequest request);

    List<StudentResponse> findByFirstName(String firstName);

    StudentResponse saveStudent(StudentRequest request) throws Exception;

    StudentResponse updateStudent(StudentRequest request)
        throws Exception;

    void deleteStudent(String id) throws Exception;

}
