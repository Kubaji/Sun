package com.baizhi.zbw.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class User implements Serializable {
    @Excel(name="编号")
    private String userId;

    @Excel(name="姓名")
    private String name;

    @Excel(name="法名")
    private String dharmaName;

    @Excel(name="密码")
    private String password;

    @Excel(name="手机号")
    private String phone;

    @Excel(name="头像")
    private String head;

    @Excel(name="性别")
    private Integer gender;

    @Excel(name="省")
    private String province;

    @Excel(name="市")
    private String city;

    @Excel(name="签名")
    private String sign;

    @Excel(name="状态")
    private Integer status;

    @Excel(name="盐")
    private String salt;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JSONField(format="yyyy-MM-dd")
    @Excel(name="注册日期")
    private Date registDate;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDharmaName() {
        return dharmaName;
    }

    public void setDharmaName(String dharmaName) {
        this.dharmaName = dharmaName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Date getRegistDate() {
        return registDate;
    }

    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", name=" + name + ", dharmaName="
                + dharmaName + ", password=" + password + ", phone=" + phone
                + ", head=" + head + ", gender=" + gender + ", province="
                + province + ", city=" + city + ", sign=" + sign + ", status="
                + status + ", salt=" + salt + ", registDate=" + registDate
                + "]";
    }

    public User(String userId, String name, String dharmaName, String password,
                String phone, String head, Integer gender, String province,
                String city, String sign, Integer status, String salt,
                Date registDate) {
        super();
        this.userId = userId;
        this.name = name;
        this.dharmaName = dharmaName;
        this.password = password;
        this.phone = phone;
        this.head = head;
        this.gender = gender;
        this.province = province;
        this.city = city;
        this.sign = sign;
        this.status = status;
        this.salt = salt;
        this.registDate = registDate;
    }

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }
}
