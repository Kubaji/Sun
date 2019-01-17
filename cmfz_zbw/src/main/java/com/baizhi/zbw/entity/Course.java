package com.baizhi.zbw.entity;

import java.io.Serializable;
import java.util.UUID;

public class Course implements Serializable {
    private String courseid;
    private String title;
    private Integer status;
    private String iconCls;

    public Course() {
    }

    public Course(String courseid, String title, Integer status, String iconCls) {
        this.courseid = courseid;
        this.title = title;
        this.status = status;
        this.iconCls = iconCls;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseid='" + courseid + '\'' +
                ", title='" + title + '\'' +
                ", status=" + status +
                ", iconCls='" + iconCls + '\'' +
                '}';
    }
}
