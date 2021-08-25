package com.hyde.entity;

import java.io.Serializable;

public class Product implements Serializable {
    private String ProductName;
    private String Version;
    private String ReleaseDate;
    private String FileLocation;
    private String updateInfo;
    private String SourceCodeDate;
    private Boolean isTested;


    public Product(String productName, String version, String releaseDate, String fileLocation, String updateInfo, String sourceCodeDate, Boolean isTested) {
        ProductName = productName;
        Version = version;
        ReleaseDate = releaseDate;
        FileLocation = fileLocation;
        this.updateInfo = updateInfo;
        SourceCodeDate = sourceCodeDate;
        this.isTested = isTested;
    }

    public Product() {
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public String getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        ReleaseDate = releaseDate;
    }

    public String getFileLocation() {
        return FileLocation;
    }

    public void setFileLocation(String fileLocation) {
        FileLocation = fileLocation;
    }

    public String getUpdateInfo() {
        return updateInfo;
    }

    public void setUpdateInfo(String updateInfo) {
        this.updateInfo = updateInfo;
    }

    public String getSourceCodeDate() {
        return SourceCodeDate;
    }

    public void setSourceCodeDate(String sourceCodeDate) {
        SourceCodeDate = sourceCodeDate;
    }

    public Boolean getTested() {
        return isTested;
    }

    public void setTested(Boolean tested) {
        isTested = tested;
    }
}