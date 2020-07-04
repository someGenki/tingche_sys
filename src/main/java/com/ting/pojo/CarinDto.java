package com.ting.pojo;


import java.util.Date;

public class CarinDto {
    String rk_plate;
    Date rk_time;
    Integer user_id;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CarinDto{");
        sb.append("rk_plate='").append(rk_plate).append('\'');
        sb.append(", rk_time=").append(rk_time);
        sb.append(", user_id=").append(user_id);
        sb.append('}');
        return sb.toString();
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

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}
