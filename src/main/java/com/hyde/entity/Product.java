package com.hyde.entity;

import java.io.Serializable;

public class Product implements Serializable {

    private String productId;
    private String productName;
    private String version;
    private String releaseDate;
    private String fileLocation;
    private String updateInfo;
    private String sourceCodeDate;
    private Integer isTested;


    public Product() {
    }

    public Product(String productId, String productName, String version, String releaseDate, String fileLocation, String updateInfo, String sourceCodeDate, Integer isTested) {
        this.productId = productId;
        this.productName = productName;
        this.version = version;
        this.releaseDate = releaseDate;
        this.fileLocation = fileLocation;
        this.updateInfo = updateInfo;
        this.sourceCodeDate = sourceCodeDate;
        this.isTested = isTested;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public String getUpdateInfo() {
        return updateInfo;
    }

    public void setUpdateInfo(String updateInfo) {
        this.updateInfo = updateInfo;
    }

    public String getSourceCodeDate() {
        return sourceCodeDate;
    }

    public void setSourceCodeDate(String sourceCodeDate) {
        this.sourceCodeDate = sourceCodeDate;
    }

    public Integer getTested() {
        return isTested;
    }

    public void setTested(Integer tested) {
        isTested = tested;
    }
}