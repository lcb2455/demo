package com.example.demo.entity;

import java.util.Date;

/**
 * 用户数据的实体类
 */
public class User extends BaseEntity{
    private String createdUser;
    private Date createdTime;
    private String modifiedUser;
    private Date modifiedTime;

    @Override
    public String getCreatedUser() {
        return createdUser;
    }

    @Override
    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    @Override
    public Date getCreatedTime() {
        return createdTime;
    }

    @Override
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String getModifiedUser() {
        return modifiedUser;
    }

    @Override
    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    @Override
    public Date getModifiedTime() {
        return modifiedTime;
    }

    @Override
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
