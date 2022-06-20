package com.joodang.service.faq;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FaqController {
    @GetMapping(value = "/faq")
    public String eat(){
        return "service/faq";
    }
}