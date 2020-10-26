package com.czf.apply.dao.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @description: 用户
 * @author: luohanye
 * @create: 2019-04-17
 **/
@Data
public class User implements Serializable {
    private String id;

    //姓名
    private String name;
    //性别
    private String gender;
    //专业
    private String profession;
    //班级
    private String grade;
    //注册或者报名邮箱
    private String email;
    //出生日期
    private Date dateOfBirth;
    //意向部门
    private String department;
    //照片名称
    private String fileName;

    private String gameUserId;
    // 激活状态 0 未激活 1 已激活
    private String activeStatus;
    // 激活码
    private String activeCode;

    private Timestamp createTime;

    private Timestamp gameTime;

    private  String   introduce;

    private  String region;
    private  String  tel;
    private  String  departmentTwo;
}
