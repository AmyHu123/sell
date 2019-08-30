package com.amy.sell.service;

import com.amy.sell.model.SellerInfo;

/**
 * @Author: amy
 * @Date: 2019/8/30
 */
public interface SellerInfoService {

    /**
     * 通过openId查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
