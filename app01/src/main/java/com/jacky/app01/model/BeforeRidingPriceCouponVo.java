package com.jacky.app01.model;

import lombok.Data;

/**
 * 助力车主流程页面优惠券信息
 *
 * @author xiaofan04
 * @date
 */
@Data
public class BeforeRidingPriceCouponVo {

    /**
     * 是否新用户（0-否、1-是）
     */
    private Integer isNewUser;

    /**
     * 新手页优惠券提示信息
     */
    private String newUserTips;

    /**
     * 抵扣场景
     */
    private Integer deductScene;

    /**
     * 抵扣类型描述
     */
    private String deductTypeDes;

    /**
     * 当前城市起步时长
     */
    private Integer startTimeLength;

    /**
     * 当前城市起步时长文案描述
     */
    private String startTimeLengthDes;

    /**
     * 当前城市起步价
     */
    private Integer startPrice;

    /**
     * 实际消费金额
     */
    private Integer actualPrice;

    /**
     * 超出起步时长/起步价的计算规则
     */
    private String overRule;

}
