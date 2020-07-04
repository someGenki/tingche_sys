package com.ting.pojo;

/**
 * @Author 林雄
 */
public class Wearhouse {
    private Integer parkId;
    private String parkName;
    private String parkSite;
    private Integer usableCapacity;
    private Integer currentUse;

    public Integer getParkId() {
        return parkId;
    }

    public String getParkName() {
        return parkName;
    }

    public String getParkSite() {
        return parkSite;
    }

    public Integer getUsableCapacity() {
        return usableCapacity;
    }

    public Integer getCurrentUse() {
        return currentUse;
    }

    public void setParkId(Integer parkId) {
        this.parkId = parkId;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public void setParkSite(String parkSite) {
        this.parkSite = parkSite;
    }

    public void setUsableCapacity(Integer usableCapacity) {
        this.usableCapacity = usableCapacity;
    }

    public void setCurrentUse(Integer currentUse) {
        this.currentUse = currentUse;
    }
}
