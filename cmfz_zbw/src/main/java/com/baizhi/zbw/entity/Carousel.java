package com.baizhi.zbw.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class Carousel implements Serializable {
    private String chapterid;
    private String name;
    private String imgpath;
    private String description;
    private Integer status;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy年MM月dd日")
    private Date uploaddate;

    public Carousel() {
    }

    public Carousel(String chapterid, String name, String imgpath, String description, Integer status, Date uploaddate) {
        this.chapterid = chapterid;
        this.name = name;
        this.imgpath = imgpath;
        this.description = description;
        this.status = status;
        this.uploaddate = uploaddate;
    }

    public String getChapterid() {
        return chapterid;
    }

    public void setChapterid(String chapterid) {
        this.chapterid = chapterid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getUploaddate() {
        return uploaddate;
    }

    public void setUploaddate(Date uploaddate) {
        this.uploaddate = uploaddate;
    }

    @Override
    public String toString() {
        return "Carousel{" +
                "chapterid=" + chapterid +
                ", name='" + name + '\'' +
                ", imgpath='" + imgpath + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", uploaddate=" + uploaddate +
                '}';
    }
}
