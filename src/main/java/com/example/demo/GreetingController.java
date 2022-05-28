package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="nameFromRequest", required=false, defaultValue="World") String valueOFNFR, Model model) {
        model.addAttribute("nameForView", valueOFNFR);
        return "greeting";
    }

}

