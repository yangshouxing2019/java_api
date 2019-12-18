package com.tedu.cn.api.file.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

//小辣椒
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor//或安装插件project lombok 或构造有参构造器
public class Emp implements Serializable {
    //员工类
    private int empno;  //工号
    private transient String ename;//名字   transient反序列化时该属性为空
    private String gender;//性别
    private Date hiredate;//入职日期
    private double salary;//薪资
    private double common;
    private int deptno;//部门号

}
