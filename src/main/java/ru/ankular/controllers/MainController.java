package ru.ankular.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by niko on 03.06.15.
 */
@Controller
@RequestMapping("/main")
public class MainController {
    @RequestMapping(method = RequestMethod.GET)
    public String main() {
        return "main";
    }
}