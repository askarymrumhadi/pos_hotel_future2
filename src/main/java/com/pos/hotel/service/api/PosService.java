package com.pos.hotel.service.api;

import com.pos.hotel.model.entity.Student;

import java.util.List;

/**
 * Created by askarymrumhadi on 05/11/17.
 */
public interface PosService {

    List<Student> findByFirstName(String firstName);

}
