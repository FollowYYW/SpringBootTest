package com.example.springboottest.service.impl;

import com.example.springboottest.entity.EmpEntity;
import com.example.springboottest.mapper.EmpMapper;
import com.example.springboottest.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<EmpEntity> queryEmpList(Integer empNo) {
        return empMapper.selectEmpListByEmpNo(empNo);
    }


}
