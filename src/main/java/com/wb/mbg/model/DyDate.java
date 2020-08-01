package com.wb.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class DyDate implements Serializable {
    private Integer gnbid;

    private String name;

    private Integer pci;

    private Float rsrpUl;

    private Float rsrpDl;

    private Float sinrUl;

    private Float sinrDl;

    private Integer delayRequest;

    private Integer delaySuccess;

    private Integer delayFail;

    private Float delay;

    private Integer nsaRequest;

    private Integer nsaSuccess;

    private Integer nsaFail;

    private String longitude;

    private String latitude;

    private Integer throughputUl;

    private Integer throughputDl;

    private Date time;

    private static final long serialVersionUID = 1L;

    public Integer getGnbid() {
        return gnbid;
    }

    public void setGnbid(Integer gnbid) {
        this.gnbid = gnbid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPci() {
        return pci;
    }

    public void setPci(Integer pci) {
        this.pci = pci;
    }

    public Float getRsrpUl() {
        return rsrpUl;
    }

    public void setRsrpUl(Float rsrpUl) {
        this.rsrpUl = rsrpUl;
    }

    public Float getRsrpDl() {
        return rsrpDl;
    }

    public void setRsrpDl(Float rsrpDl) {
        this.rsrpDl = rsrpDl;
    }

    public Float getSinrUl() {
        return sinrUl;
    }

    public void setSinrUl(Float sinrUl) {
        this.sinrUl = sinrUl;
    }

    public Float getSinrDl() {
        return sinrDl;
    }

    public void setSinrDl(Float sinrDl) {
        this.sinrDl = sinrDl;
    }

    public Integer getDelayRequest() {
        return delayRequest;
    }

    public void setDelayRequest(Integer delayRequest) {
        this.delayRequest = delayRequest;
    }

    public Integer getDelaySuccess() {
        return delaySuccess;
    }

    public void setDelaySuccess(Integer delaySuccess) {
        this.delaySuccess = delaySuccess;
    }

    public Integer getDelayFail() {
        return delayFail;
    }

    public void setDelayFail(Integer delayFail) {
        this.delayFail = delayFail;
    }

    public Float getDelay() {
        return delay;
    }

    public void setDelay(Float delay) {
        this.delay = delay;
    }

    public Integer getNsaRequest() {
        return nsaRequest;
    }

    public void setNsaRequest(Integer nsaRequest) {
        this.nsaRequest = nsaRequest;
    }

    public Integer getNsaSuccess() {
        return nsaSuccess;
    }

    public void setNsaSuccess(Integer nsaSuccess) {
        this.nsaSuccess = nsaSuccess;
    }

    public Integer getNsaFail() {
        return nsaFail;
    }

    public void setNsaFail(Integer nsaFail) {
        this.nsaFail = nsaFail;
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

    public Integer getThroughputUl() {
        return throughputUl;
    }

    public void setThroughputUl(Integer throughputUl) {
        this.throughputUl = throughputUl;
    }

    public Integer getThroughputDl() {
        return throughputDl;
    }

    public void setThroughputDl(Integer throughputDl) {
        this.throughputDl = throughputDl;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gnbid=").append(gnbid);
        sb.append(", name=").append(name);
        sb.append(", pci=").append(pci);
        sb.append(", rsrpUl=").append(rsrpUl);
        sb.append(", rsrpDl=").append(rsrpDl);
        sb.append(", sinrUl=").append(sinrUl);
        sb.append(", sinrDl=").append(sinrDl);
        sb.append(", delayRequest=").append(delayRequest);
        sb.append(", delaySuccess=").append(delaySuccess);
        sb.append(", delayFail=").append(delayFail);
        sb.append(", delay=").append(delay);
        sb.append(", nsaRequest=").append(nsaRequest);
        sb.append(", nsaSuccess=").append(nsaSuccess);
        sb.append(", nsaFail=").append(nsaFail);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", throughputUl=").append(throughputUl);
        sb.append(", throughputDl=").append(throughputDl);
        sb.append(", time=").append(time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}