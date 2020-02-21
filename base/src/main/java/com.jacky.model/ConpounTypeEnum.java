package com.jacky.model;

/**
 * 助力车优惠类型
 */
public enum ConpounTypeEnum {
    //促销周期卡
    RIDING_SALE_CARD(601),
    //正常售卖周期卡
    RIDING_NORNAL_CARD(602),
    //免费周期卡
    RIDING_FREE_CARD(603),
    //促销付费次卡
    RIDING_SALE_NUMCARD(604),
    //正常售卖次卡
    RIDING_NORMAL_NUMCARD(605),
    //免费次卡
    RIDING_FREE_NUMCARD(606),
    //券包
    RIDING_COUPON(607);

    ConpounTypeEnum(int value) {
        this.value = value;
    }

    private final int value;

    public int getValue() {
        return value;
    }

    public static ConpounTypeEnum getType(int value) {
        ConpounTypeEnum[] values = ConpounTypeEnum.values();
        for (ConpounTypeEnum typeEnum : values) {
            if (typeEnum.getValue() == value) {
                return typeEnum;
            }
        }
        return null;
    }

}