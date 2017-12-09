package com.pos.hotel.model.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by askarymrumhadi on 05/11/17.
 */
@Entity @Table(name = Student.TABLE_NAME) public class Student {

    public static final String TABLE_NAME = "students";

    @Id @Column(name = "id") @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2") private String id;

    @Column(name = "first_name", nullable = false) private String firstName;

    @Column(name = "last_name", nullable = false) private String lastName;

    @Column(name = "birth_date", nullable = false) private Date birthDate;

    public Student() {
    }

    public Student(String id, String firstName, String lastName, Date birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
