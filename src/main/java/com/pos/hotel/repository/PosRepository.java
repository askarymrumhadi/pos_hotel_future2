package com.pos.hotel.repository;

import com.pos.hotel.model.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by askarymrumhadi on 05/11/17.
 */
@Repository
public interface PosRepository extends CrudRepository<Student,String> {

    List<Student> findByFirstName(String firstName);
}
