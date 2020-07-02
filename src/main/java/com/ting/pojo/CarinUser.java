package com.ting.pojo;

import java.io.Serializable;
import java.util.Date;

public class CarinUser implements Serializable {
    private Integer rkId;

    private Integer userId;

    private String rkPlate;

    private Date rkTime;

    private static final long serialVersionUID = 1L;

    public Integer getRkId() {
        return rkId;
    }

    public void setRkId(Integer rkId) {
        this.rkId = rkId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRkPlate() {
        return rkPlate;
    }

    public void setRkPlate(String rkPlate) {
        this.rkPlate = rkPlate == null ? null : rkPlate.trim();
    }

    public Date getRkTime() {
        return rkTime;
    }

    public void setRkTime(Date rkTime) {
        this.rkTime = rkTime;
    }
}