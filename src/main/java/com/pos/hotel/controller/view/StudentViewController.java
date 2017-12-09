package com.pos.hotel.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentViewController {

    private static final String BASE_PATH = "/student";
    private static final String SUMMARY_PATH = StudentViewController.BASE_PATH + "/summary";

    @GetMapping(value = StudentViewController.BASE_PATH)
    public ModelAndView getBaseView() {
        return new ModelAndView("pos_student");
    }

    @GetMapping(value = StudentViewController.SUMMARY_PATH)
    public ModelAndView getSummaryView() {
        return new ModelAndView("pos_student_summary");
    }
}
