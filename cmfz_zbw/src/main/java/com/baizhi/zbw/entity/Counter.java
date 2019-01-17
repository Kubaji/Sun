package com.baizhi.zbw.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class Counter implements Serializable {
    private String counterid;
    private String name;
    private int count;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy年MM月dd日")
    private Date createtime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy年MM月dd日")
    private Date updatetime;
    private String courseid;
    private String userid;

    public Counter() {
    }

    public Counter(String counterid, String name, int count, Date createtime, Date updatetime, String courseid, String userid) {
        this.counterid = counterid;
        this.name = name;
        this.count = count;
        this.createtime = createtime;
        this.updatetime = updatetime;
        this.courseid = courseid;
        this.userid = userid;
    }

    public String getCounterid() {
        return counterid;
    }

    public void setCounterid(String counterid) {
        this.counterid = counterid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "counterid='" + counterid + '\'' +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                ", courseid='" + courseid + '\'' +
                ", userid='" + userid + '\'' +
                '}';
    }
}
