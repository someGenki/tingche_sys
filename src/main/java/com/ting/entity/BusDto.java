package com.ting.entity;

import java.util.Date;
/**
 * @author  孙菊红
 */
public class BusDto {
    private Integer log_id;

    private Integer user_id;

    private Integer park_id;

    private String plate;

    private Date rin_time;

    private Date out_time;

    private Float cost;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BusDto{");
        sb.append("log_id=").append(log_id);
        sb.append(", user_id=").append(user_id);
        sb.append(", park_id=").append(park_id);
        sb.append(", plate='").append(plate).append('\'');
        sb.append(", rin_time=").append(rin_time);
        sb.append(", out_time=").append(out_time);
        sb.append(", cost=").append(cost);
        sb.append('}');
        return sb.toString();
    }

    private static final long serialVersionUID = 1L;

    public Integer getLog_id() {
        return log_id;
    }

    public void setLog_id(Integer log_id) {
        this.log_id = log_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getPark_id() {
        return park_id;
    }

    public void setPark_id(Integer park_id) {
        this.park_id = park_id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Date getRin_time() {
        return rin_time;
    }

    public void setRin_time(Date rin_time) {
        this.rin_time = rin_time;
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
