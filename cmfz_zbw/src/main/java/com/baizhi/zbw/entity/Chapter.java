package com.baizhi.zbw.entity;

import java.io.Serializable;
import java.util.UUID;

public class Chapter implements Serializable {
    private String id;
    private String name;
    private Integer size;
    private String src;

    public Chapter() {
    }

    public Chapter(String id, String name, Integer size, String src) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.src = src;
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

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", src='" + src + '\'' +
                '}';
    }
}
