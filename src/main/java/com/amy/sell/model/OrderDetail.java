package com.amy.sell.model;

import lombok.Data;

import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "order_detail")
@Data
public class OrderDetail {
    
    private String detailId;

    /** 订单id. */
    private String orderId;

    /** 商品id. */
    private String productId;

    /** 商品名称. */
    private String productName;

    /** 商品单价. */
    private BigDecimal productPrice;

    /** 商品数量. */
    private Integer productQuantity;

    /** 商品小图. */
    private String productIcon;
}
