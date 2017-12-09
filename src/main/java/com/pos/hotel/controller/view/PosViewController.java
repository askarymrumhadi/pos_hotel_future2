package com.pos.hotel.controller.view;

import com.pos.hotel.service.api.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by askarymrumhadi on 28/10/17.
 */
@Controller
public class PosViewController {

    private static final String BASE_PATH = "/";
    private static final String SUMMARY_PATH = PosViewController.BASE_PATH + "summary";

    @Autowired
    private StudentService studentService;

    @GetMapping(value = PosViewController.BASE_PATH)
    public ModelAndView getIndexView() {
        return new ModelAndView("pos_welcome");
    }

}
