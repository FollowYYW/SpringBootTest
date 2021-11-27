package com.example.springboottest.controller;

import com.example.springboottest.entity.EmpEntity;
import com.example.springboottest.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private EmpService empService;

    @ResponseBody
    @GetMapping("/getEmpList")
    public List<EmpEntity> getEmpList(@RequestParam Integer empNo){

        return empService.queryEmpList(empNo);
    }


}
