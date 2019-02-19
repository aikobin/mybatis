package com.topisv.wms.output.basic.po;

import java.util.Date;

public class ContainerPO {
    private String id;

    private String containerCode;

    private String containerType;

    private String useBatch;

    private String containerStatus;

    private Date createTime;

    private String createOwner;

    private Date updateTime;

    private String updateOwner;

    private Integer optimistic;

    private String warehouseCode;

    private String locationCode;

    private String shelfCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getContainerCode() {
        return containerCode;
    }

    public void setContainerCode(String containerCode) {
        this.containerCode = containerCode == null ? null : containerCode.trim();
    }

    public String getContainerType() {
        return containerType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType == null ? null : containerType.trim();
    }

    public String getUseBatch() {
        return useBatch;
    }

    public void setUseBatch(String useBatch) {
        this.useBatch = useBatch == null ? null : useBatch.trim();
    }

    public String getContainerStatus() {
        return containerStatus;
    }

    public void setContainerStatus(String containerStatus) {
        this.containerStatus = containerStatus == null ? null : containerStatus.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateOwner() {
        return createOwner;
    }

    public void setCreateOwner(String createOwner) {
        this.createOwner = createOwner == null ? null : createOwner.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateOwner() {
        return updateOwner;
    }

    public void setUpdateOwner(String updateOwner) {
        this.updateOwner = updateOwner == null ? null : updateOwner.trim();
    }

    public Integer getOptimistic() {
        return optimistic;
    }

    public void setOptimistic(Integer optimistic) {
        this.optimistic = optimistic;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode == null ? null : warehouseCode.trim();
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode == null ? null : locationCode.trim();
    }

    public String getShelfCode() {
        return shelfCode;
    }

    public void setShelfCode(String shelfCode) {
        this.shelfCode = shelfCode == null ? null : shelfCode.trim();
    }
}