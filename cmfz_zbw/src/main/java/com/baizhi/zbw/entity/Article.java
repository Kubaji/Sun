package com.baizhi.zbw.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class Article implements Serializable {
    private String articleid;
    private String title;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy年MM月dd日")
    private Date publiishdate;
    private String author;
    private String content;
    private String masterid;

    public Article() {
    }

    public Article(String articleid, String title, Date publiishdate, String author, String content, String masterid) {
        this.articleid = articleid;
        this.title = title;
        this.publiishdate = publiishdate;
        this.author = author;
        this.content = content;
        this.masterid = masterid;
    }

    public String getArticleid() {
        return articleid;
    }

    public void setArticleid(String articleid) {
        this.articleid = articleid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPubliishdate() {
        return publiishdate;
    }

    public void setPubliishdate(Date publiishdate) {
        this.publiishdate = publiishdate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMasterid() {
        return masterid;
    }

    public void setMasterid(String masterid) {
        this.masterid = masterid;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleid='" + articleid + '\'' +
                ", title='" + title + '\'' +
                ", publiishdate=" + publiishdate +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", masterid='" + masterid + '\'' +
                '}';
    }
}
