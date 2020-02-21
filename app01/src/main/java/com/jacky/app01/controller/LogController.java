package com.jacky.app01.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.jacky.app01.model.BaseResult;
import com.jacky.app01.model.BeforeRidingPriceCouponVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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

    @GetMapping(value = "/log1.do")
    public BaseResult<JSONObject> getUserCouponInfo1() {
        long start = System.currentTimeMillis();
        BaseResult<JSONObject> result = BaseResult.defaultSuccess(null);
        JSONObject data = new JSONObject();

        BeforeRidingPriceCouponVo priceCouponVo = new BeforeRidingPriceCouponVo();
        priceCouponVo.setStartTimeLength(12);
        priceCouponVo.setStartTimeLengthDes("起步价(分钟内)");
        data.put("couponInfo", priceCouponVo);
        data.put("beforeRidingPriceCouponVo", "");
        result.setData(data);
        System.out.println(result.toString());
        log.info("preCheckCouponInfo output result={}, time={}",
                JSONObject.toJSONString(result, SerializerFeature.WriteMapNullValue));
        return result;
    }

    @GetMapping(value = "/log2.do")
    public BaseResult<Map> getUserCouponInfo2() {
        BaseResult<Map> result = BaseResult.defaultSuccess(null);
        Map data = new HashMap();

        BeforeRidingPriceCouponVo priceCouponVo = new BeforeRidingPriceCouponVo();
        priceCouponVo.setStartTimeLength(12);
        priceCouponVo.setStartTimeLengthDes("起步价(分钟内)");
        data.put("couponInfo", priceCouponVo);
        data.put("beforeRidingPriceCouponVo", "");
        result.setData(data);
        System.out.println(result.toString());
        log.info("preCheckCouponInfo output result={}, time={}", result.toString());
        return result;
    }
}
