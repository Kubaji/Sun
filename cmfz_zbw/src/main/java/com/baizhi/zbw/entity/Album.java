package com.baizhi.zbw.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Album implements Serializable {
    private String id;
    private String name;
    private String coverPath;
    private Integer count;
    private Integer score;
    private String author;
    private String teller;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JSONField(format="yyyy-MM-dd")
    private Date pulishDate;
    private String brief;
    private List<Chapter> children;

    public Album() {
    }

    public Album(String id, String name, String coverPath, Integer count, Integer score, String author, String teller, Date pulishDate, String brief, List<Chapter> children) {
        this.id = id;
        this.name = name;
        this.coverPath = coverPath;
        this.count = count;
        this.score = score;
        this.author = author;
        this.teller = teller;
        this.pulishDate = pulishDate;
        this.brief = brief;
        this.children = children;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoverPath() {
        return coverPath;
    }

    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTeller() {
        return teller;
    }

    public void setTeller(String teller) {
        this.teller = teller;
    }

    public Date getPulishDate() {
        return pulishDate;
    }

    public void setPulishDate(Date pulishDate) {
        this.pulishDate = pulishDate;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public List<Chapter> getChildren() {
        return children;
    }

    public void setChildren(List<Chapter> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", coverPath='" + coverPath + '\'' +
                ", count=" + count +
                ", score=" + score +
                ", author='" + author + '\'' +
                ", teller='" + teller + '\'' +
                ", pulishDate=" + pulishDate +
                ", brief='" + brief + '\'' +
                ", children=" + children +
                '}';
    }
}
