package com.example.springboottest.mapper;

import com.example.springboottest.entity.EmpEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {

    List<EmpEntity> selectEmpListByEmpNo(Integer empNo) ;

}
