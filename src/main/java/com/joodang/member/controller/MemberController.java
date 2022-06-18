package com.joodang.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/member")
public class MemberController {
    @GetMapping(value = "/meInsertFirst")
    public String memberInsertFirst() {
        return "/member/meInsertFirstForm";
    }

    @GetMapping(value = "/meInsertSecond")
    public String memberInsertSecond() {
        return "/member/meInsertSecondForm";
    }
}
