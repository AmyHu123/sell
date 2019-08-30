package com.amy.sell.service;

import com.amy.sell.model.ProductInfo;
import com.amy.sell.model.dto.CartDTO;

import java.util.List;

/**
 * @Author: amy
 * @Date: 2019/8/30
 */
public interface ProductInfoService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();
      //TODO
//    Page<ProductInfo> findAll(Pageable pageable);

    int save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);

    //上架
    int onSale(String productId);

    //下架
    int offSale(String productId);
}
