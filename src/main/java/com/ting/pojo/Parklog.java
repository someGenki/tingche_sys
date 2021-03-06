package com.ting.pojo;

import java.io.Serializable;
import java.util.Date;

public class Parklog implements Serializable {
    private Integer logId;

    private Integer userId;

    private Integer parkId;

    private String plate;

    private Date rinTime;

    private Date outTime;

    private Float cost;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Parklog{");
        sb.append("logId=").append(logId);
        sb.append(", userId=").append(userId);
        sb.append(", parkId=").append(parkId);
        sb.append(", plate='").append(plate).append('\'');
        sb.append(", rinTime=").append(rinTime);
        sb.append(", outTime=").append(outTime);
        sb.append(", cost=").append(cost);
        sb.append('}');
        return sb.toString();
    }

    private static final long serialVersionUID = 1L;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getParkId() {
        return parkId;
    }

    public void setParkId(Integer parkId) {
        this.parkId = parkId;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate == null ? null : plate.trim();
    }

    public Date getRinTime() {
        return rinTime;
    }

    public void setRinTime(Date rinTime) {
        this.rinTime = rinTime;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }
}