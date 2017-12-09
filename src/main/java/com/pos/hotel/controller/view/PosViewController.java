package com.pos.hotel.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by askarymrumhadi on 28/10/17.
 */
@Controller
public class PosViewController {

    private static final String BASE_PATH = "/";

    @GetMapping(value = PosViewController.BASE_PATH)
    public ModelAndView getBaseView() {
        return new ModelAndView("pos_welcome");
    }

}
