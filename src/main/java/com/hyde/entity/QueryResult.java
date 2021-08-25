package com.hyde.entity;

import java.io.Serializable;
import java.util.List;

public class QueryResult implements Serializable {

    private List<Product> productList;
    private Integer ResultCode;
    private String ResultInfo;

    public QueryResult() {
    }

    public QueryResult(List<Product> productList, Integer resultCode, String resultInfo) {
        this.productList = productList;
        ResultCode = resultCode;
        ResultInfo = resultInfo;
    }

    public QueryResult(Integer resultCode, String resultInfo) {
        ResultCode = resultCode;
        ResultInfo = resultInfo;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Integer getResultCode() {
        return ResultCode;
    }

    public void setResultCode(Integer resultCode) {
        ResultCode = resultCode;
    }

    public String getResultInfo() {
        return ResultInfo;
    }

    public void setResultInfo(String resultInfo) {
        ResultInfo = resultInfo;
    }
}
