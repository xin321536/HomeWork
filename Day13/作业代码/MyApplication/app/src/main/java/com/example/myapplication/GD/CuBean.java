package com.example.myapplication.GD;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class CuBean {
    @Id
    private Long id;
    private String name;
    @Generated(hash = 1841305502)
    public CuBean(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    @Generated(hash = 876276662)
    public CuBean() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
