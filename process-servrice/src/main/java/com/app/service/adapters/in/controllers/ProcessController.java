package com.app.service.adapters.in.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/process")
public class ProcessController {

    @GetMapping("/")
    public String process(){
             return "Hi theere";
    }

}
