package com.ting.pojo;

import java.util.Date;

/**
 * @Author 谢川东
 */
public class TollDto {
    private Integer rk_id;

    private Integer user_id;

    private String rk_plate;

    private Date rk_time;

    private Integer park_id;

    private Date out_time;

    private Float cost;

    public Integer getRk_id() {
        return rk_id;
    }

    public void setRk_id(Integer rk_id) {
        this.rk_id = rk_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getRk_plate() {
        return rk_plate;
    }

    public void setRk_plate(String rk_plate) {
        this.rk_plate = rk_plate;
    }

    public Date getRk_time() {
        return rk_time;
    }

    public void setRk_time(Date rk_time) {
        this.rk_time = rk_time;
    }

    public Integer getPark_id() {
        return park_id;
    }

    public void setPark_id(Integer park_id) {
        this.park_id = park_id;
    }

    public Date getOut_time() {
        return out_time;
    }

    public void setOut_time(Date out_time) {
        this.out_time = out_time;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }
}
