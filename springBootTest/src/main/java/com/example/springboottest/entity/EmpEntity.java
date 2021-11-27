package com.example.springboottest.entity;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class EmpEntity {

    /**
     * 员工编号
     */
    private BigDecimal empNo;
    /**
     * 员工姓名
     */
    private String eName;
    /**
     * 岗位
     */
    private String job;
    /**
     * 上级编号
     */
    private BigDecimal mgr;
    /**
     * 入职日期
     */
    private String hireDate;
    /**
     * 工资
     */
    private BigDecimal sal;
    /**
     * 奖金
     */
    private BigDecimal comm;
    /**
     * 部门编号
     */
    private BigDecimal deptNo;

}
