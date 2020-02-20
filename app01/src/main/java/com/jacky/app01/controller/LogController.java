package com.jacky.app01.controller;

import com.alibaba.fastjson.JSONObject;
import com.jacky.app01.model.BaseResult;
import com.jacky.app01.model.BeforeRidingPriceCouponVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenjiaqi
 * @create 2020-02-20
 */
@RestController
@Slf4j
public class LogController {
    @GetMapping(value = "/log.do")
    public BaseResult<JSONObject> getUserCouponInfo() {
        long start = System.currentTimeMillis();
        BaseResult<JSONObject> result = BaseResult.defaultSuccess(null);
        JSONObject data = new JSONObject();

        BeforeRidingPriceCouponVo priceCouponVo = new BeforeRidingPriceCouponVo();
        priceCouponVo.setStartTimeLength(12);
        priceCouponVo.setStartTimeLengthDes("起步价(分钟内)");
        data.put("couponInfo", priceCouponVo);
        data.put("beforeRidingPriceCouponVo", "");
        result.setData(data);
        log.info("preCheckCouponInfo output result={}, time={}", result);
        return result;
    }
}
