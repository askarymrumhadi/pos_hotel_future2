package com.pos.hotel.repository;

import com.pos.hotel.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by askarymrumhadi on 05/11/17.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student,String> {

    Student findById(String id);

    List<Student> findByFirstName(String firstName);

    @Query(value = "SELECT COUNT(1) FROM students", nativeQuery = true)
    Long countTotalRecords();

    @Query(value = "SELECT * FROM students LIMIT ?1 OFFSET ?2", nativeQuery = true)
    List<Student> findPageable( int limit, int offset);
}
