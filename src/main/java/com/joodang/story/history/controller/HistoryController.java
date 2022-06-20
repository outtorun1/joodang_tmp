package com.joodang.story.history.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HistoryController {

    @GetMapping(value = "/history")
    public String history(){
        return "story/history";
    }
}