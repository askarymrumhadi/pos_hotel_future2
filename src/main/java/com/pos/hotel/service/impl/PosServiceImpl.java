package com.pos.hotel.service.impl;

import com.pos.hotel.model.entity.Student;
import com.pos.hotel.repository.PosRepository;
import com.pos.hotel.service.api.PosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by askarymrumhadi on 05/11/17.
 */
@Service
public class PosServiceImpl implements PosService {

    @Autowired
    private PosRepository posRepository;

    @Override
    public List<Student> findByFirstName(String firstName) {
        return posRepository.findByFirstName(firstName);
    }
}
