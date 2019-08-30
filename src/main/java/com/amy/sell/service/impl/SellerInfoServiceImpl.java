package com.amy.sell.service.impl;

import com.amy.sell.mapper.SellerInfoMapper;
import com.amy.sell.model.SellerInfo;
import com.amy.sell.service.SellerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

/**
 * @Author: amy
 * @Date: 2019/8/30
 */
@Service
public class SellerInfoServiceImpl implements SellerInfoService {

    @Autowired
    private SellerInfoMapper sellerInfoMapper;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        Example example = new Example(SellerInfo.class);
        example.createCriteria().andEqualTo("openid",openid);
        return sellerInfoMapper.selectOneByExample(example);
    }
}
