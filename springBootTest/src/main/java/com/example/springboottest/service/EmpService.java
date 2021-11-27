package com.example.springboottest.service;

import com.example.springboottest.entity.EmpEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmpService {

    List<EmpEntity> queryEmpList(Integer empNo) ;
}
