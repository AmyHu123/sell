package com.amy.sell.service.impl;

import com.amy.sell.mapper.SellerInfoMapper;
import com.amy.sell.model.SellerInfo;
import com.amy.sell.service.SellerInfoService;
import com.amy.sell.utils.GsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: amy
 * @Date: 2019/8/30
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SellInfoServiceImplTest {

    @Autowired
    private SellerInfoService sellerInfoService;

    @Test
    public void getSellerInfo(){
        SellerInfo sellerInfo = sellerInfoService.findSellerInfoByOpenid("111111");
        log.info("卖家信息为：" + GsonUtil.toJson(sellerInfo));
    }
}
