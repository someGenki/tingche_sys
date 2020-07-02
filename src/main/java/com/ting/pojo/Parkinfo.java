package com.ting.pojo;

import java.io.Serializable;

public class Parkinfo implements Serializable {
    private Integer parkId;

    private String parkName;

    private String parkSite;

    private Integer maxCapacity;

    private Integer usableCapacity;

    private Integer currentUse;

    private static final long serialVersionUID = 1L;

    public Integer getParkId() {
        return parkId;
    }

    public void setParkId(Integer parkId) {
        this.parkId = parkId;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName == null ? null : parkName.trim();
    }

    public String getParkSite() {
        return parkSite;
    }

    public void setParkSite(String parkSite) {
        this.parkSite = parkSite == null ? null : parkSite.trim();
    }

    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Integer getUsableCapacity() {
        return usableCapacity;
    }

    public void setUsableCapacity(Integer usableCapacity) {
        this.usableCapacity = usableCapacity;
    }

    public Integer getCurrentUse() {
        return currentUse;
    }

    public void setCurrentUse(Integer currentUse) {
        this.currentUse = currentUse;
    }
}