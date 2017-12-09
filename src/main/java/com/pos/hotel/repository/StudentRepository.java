package com.pos.hotel.repository;

import com.pos.hotel.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by askarymrumhadi on 05/11/17.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student,String> {

    Student findById(String id);

    List<Student> findByFirstName(String firstName);
}
