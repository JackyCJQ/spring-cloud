package com.jacky.app01.model;

import lombok.Data;

@Data
public class OrderPriceModel {
    private int code = 0;
    private String message = "";
    private int maxDeduction = 0;
    private String couponId = "";
    private String skuId = "";
    private int shouldPay = 0;
    private int realPay = 0;
    private int operationType = 0;
    private String agentId = "";
    private ConpounTypeEnum conpounTypeEnum;

    public OrderPriceModel() {
        code = 0;
        message = "";
        maxDeduction = 0;
        couponId = "";
        skuId = "";
        shouldPay = 0;
        realPay = 0;
        operationType = 0;
        agentId = "";
        conpounTypeEnum = null;
    }
}