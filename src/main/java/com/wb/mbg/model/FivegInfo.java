package com.wb.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class FivegInfo implements Serializable {
    private Integer id;

    private String operationType;

    private String province;

    private String city;

    private String district;

    private String location;

    private String gnbidName;

    private String coverType;

    private String openingStatus;

    private Integer cellId;

    private Integer gnbid;

    private Integer tac;

    private Integer pci;

    private String frequencyBand;

    private Integer bandWidth;

    private Integer frequencyPoint;

    private String duplexMode;

    @ApiModelProperty(value = "厂家")
    private String factory;

    @ApiModelProperty(value = "设备型号")
    private String unitType;

    @ApiModelProperty(value = "设备版本")
    private String deviceVersion;

    @ApiModelProperty(value = "基站类型")
    private String stationType;

    private String longitude;

    private String latitude;

    @ApiModelProperty(value = "天线挂高")
    private Integer hangingHigh;

    @ApiModelProperty(value = "方位角")
    private Integer azimuth;

    @ApiModelProperty(value = "下倾角")
    private Integer downtilt;

    @ApiModelProperty(value = "NR架构")
    private String nrFramework;

    @ApiModelProperty(value = "4G锚点站")
    private String enbidCellid;

    @ApiModelProperty(value = "是否共享站")
    private String shareStation;

    @ApiModelProperty(value = "小区覆盖场景")
    private String coverageScene;

    @ApiModelProperty(value = "备注")
    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGnbidName() {
        return gnbidName;
    }

    public void setGnbidName(String gnbidName) {
        this.gnbidName = gnbidName;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public String getOpeningStatus() {
        return openingStatus;
    }

    public void setOpeningStatus(String openingStatus) {
        this.openingStatus = openingStatus;
    }

    public Integer getCellId() {
        return cellId;
    }

    public void setCellId(Integer cellId) {
        this.cellId = cellId;
    }

    public Integer getGnbid() {
        return gnbid;
    }

    public void setGnbid(Integer gnbid) {
        this.gnbid = gnbid;
    }

    public Integer getTac() {
        return tac;
    }

    public void setTac(Integer tac) {
        this.tac = tac;
    }

    public Integer getPci() {
        return pci;
    }

    public void setPci(Integer pci) {
        this.pci = pci;
    }

    public String getFrequencyBand() {
        return frequencyBand;
    }

    public void setFrequencyBand(String frequencyBand) {
        this.frequencyBand = frequencyBand;
    }

    public Integer getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(Integer bandWidth) {
        this.bandWidth = bandWidth;
    }

    public Integer getFrequencyPoint() {
        return frequencyPoint;
    }

    public void setFrequencyPoint(Integer frequencyPoint) {
        this.frequencyPoint = frequencyPoint;
    }

    public String getDuplexMode() {
        return duplexMode;
    }

    public void setDuplexMode(String duplexMode) {
        this.duplexMode = duplexMode;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public String getDeviceVersion() {
        return deviceVersion;
    }

    public void setDeviceVersion(String deviceVersion) {
        this.deviceVersion = deviceVersion;
    }

    public String getStationType() {
        return stationType;
    }

    public void setStationType(String stationType) {
        this.stationType = stationType;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Integer getHangingHigh() {
        return hangingHigh;
    }

    public void setHangingHigh(Integer hangingHigh) {
        this.hangingHigh = hangingHigh;
    }

    public Integer getAzimuth() {
        return azimuth;
    }

    public void setAzimuth(Integer azimuth) {
        this.azimuth = azimuth;
    }

    public Integer getDowntilt() {
        return downtilt;
    }

    public void setDowntilt(Integer downtilt) {
        this.downtilt = downtilt;
    }

    public String getNrFramework() {
        return nrFramework;
    }

    public void setNrFramework(String nrFramework) {
        this.nrFramework = nrFramework;
    }

    public String getEnbidCellid() {
        return enbidCellid;
    }

    public void setEnbidCellid(String enbidCellid) {
        this.enbidCellid = enbidCellid;
    }

    public String getShareStation() {
        return shareStation;
    }

    public void setShareStation(String shareStation) {
        this.shareStation = shareStation;
    }

    public String getCoverageScene() {
        return coverageScene;
    }

    public void setCoverageScene(String coverageScene) {
        this.coverageScene = coverageScene;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", operationType=").append(operationType);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", location=").append(location);
        sb.append(", gnbidName=").append(gnbidName);
        sb.append(", coverType=").append(coverType);
        sb.append(", openingStatus=").append(openingStatus);
        sb.append(", cellId=").append(cellId);
        sb.append(", gnbid=").append(gnbid);
        sb.append(", tac=").append(tac);
        sb.append(", pci=").append(pci);
        sb.append(", frequencyBand=").append(frequencyBand);
        sb.append(", bandWidth=").append(bandWidth);
        sb.append(", frequencyPoint=").append(frequencyPoint);
        sb.append(", duplexMode=").append(duplexMode);
        sb.append(", factory=").append(factory);
        sb.append(", unitType=").append(unitType);
        sb.append(", deviceVersion=").append(deviceVersion);
        sb.append(", stationType=").append(stationType);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", hangingHigh=").append(hangingHigh);
        sb.append(", azimuth=").append(azimuth);
        sb.append(", downtilt=").append(downtilt);
        sb.append(", nrFramework=").append(nrFramework);
        sb.append(", enbidCellid=").append(enbidCellid);
        sb.append(", shareStation=").append(shareStation);
        sb.append(", coverageScene=").append(coverageScene);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}