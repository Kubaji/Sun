package com.baizhi.zbw.entity;

import java.io.Serializable;
import java.util.UUID;

public class Master implements Serializable {
    private String masterid;
    private String name;
    private String dharmaname;
    private String head;
    private String status;

    public Master() {
    }

    public Master(String masterid, String name, String dharmaname, String head, String status) {
        this.masterid = masterid;
        this.name = name;
        this.dharmaname = dharmaname;
        this.head = head;
        this.status = status;
    }

    public String getMasterid() {
        return masterid;
    }

    public void setMasterid(String masterid) {
        this.masterid = masterid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDharmaname() {
        return dharmaname;
    }

    public void setDharmaname(String dharmaname) {
        this.dharmaname = dharmaname;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Master{" +
                "masterid='" + masterid + '\'' +
                ", name='" + name + '\'' +
                ", dharmaname='" + dharmaname + '\'' +
                ", head='" + head + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
