package com.example.springboottest.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Builder
public class Emp {

    /**
     * 员工编号
     */
    private String empNo;
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
    private Integer mgr;
    /**
     * 入职日期
     */
    private Date hireDate;
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
    private Integer deptNo;

}
