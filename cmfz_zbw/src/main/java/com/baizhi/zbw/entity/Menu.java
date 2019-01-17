package com.baizhi.zbw.entity;

import java.io.Serializable;
import java.util.UUID;

public class Menu implements Serializable {
    private String id;
    private String name;
    private String level;
    private Integer parentid;
    private String href;
    private String iconCls;

    public Menu() {
    }

    public Menu(String id, String name, String level, Integer parentid, String href, String iconCls) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.parentid = parentid;
        this.href = href;
        this.iconCls = iconCls;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", parentid=" + parentid +
                ", href='" + href + '\'' +
                ", iconCls='" + iconCls + '\'' +
                '}';
    }
}
