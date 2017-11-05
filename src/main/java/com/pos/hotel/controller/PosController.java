package com.pos.hotel.controller;

import com.pos.hotel.model.entity.Student;
import com.pos.hotel.service.api.PosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by askarymrumhadi on 28/10/17.
 */
@Controller
public class PosController {

    private static final String BASE_PATH = "/";
    private static final String SUMMARY_PATH = PosController.BASE_PATH + "summary";

    @Autowired
    private PosService posService;

    @GetMapping(value = PosController.BASE_PATH)
    public ModelAndView getIndexView() {
        return new ModelAndView("pos_welcome");
    }

    @GetMapping(value = PosController.SUMMARY_PATH)
    public ModelAndView getSummaryView() {
        List<Student> student = posService.findByFirstName("askary");
        System.out.println(student.get(0).getLastName());
        System.out.println(student.get(1).getLastName());
        return new ModelAndView("pos_summary");
    }
}
